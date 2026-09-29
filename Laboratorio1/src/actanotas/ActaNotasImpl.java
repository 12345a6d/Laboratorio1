package actanotas;
import resto.Calificacion;

import java.util.Comparator;
import java.util.function.Function;

import es.upm.aedlib.Pair;
import es.upm.aedlib.indexedlist.*;
public class ActaNotasImpl implements ActaNotas {
private	IndexedList<Calificacion> calificaciones;
private String asignatura;
private int anyo;
private boolean esConvocatoriaExtraordinaria;
private double minNotaAprobada;

public ActaNotasImpl(IndexedList<Calificacion> calificaciones, String asignatura, int anyo, boolean esConvocatoriaExtraordinaria, double minNotaAprobada) {
this.calificaciones = calificaciones;
this.asignatura = asignatura;
this.anyo = anyo;
this.esConvocatoriaExtraordinaria = esConvocatoriaExtraordinaria;
this.minNotaAprobada = minNotaAprobada;
}
public ActaNotasImpl(String x_1, double x_2, int x_3, boolean x_4) {
	this.asignatura = x_1;
	this.minNotaAprobada = x_2;
	this.anyo = x_3;
	this.esConvocatoriaExtraordinaria = x_4;
	this.calificaciones = new ArrayIndexedList<>();
}
@Override
public String asignatura() {
	
	return this.asignatura;
}

@Override
public int anyo() {
	return this.anyo;
}

@Override
public boolean esConvocatoriaExtraordinaria() {

	return this.esConvocatoriaExtraordinaria;
}

@Override
public double minNotaAprobado() {
	return this.minNotaAprobada;
}

@Override
public ActaNotas addCalificacion(String nombre, String matricula, String grupo, double nota) throws IllegalStateException, IllegalArgumentException {
	if (nombre == null || matricula == null || grupo == null || nota<0.00 || nota>10.00) {
	throw new IllegalArgumentException("No hay nombre, o matrícula, o grupo, o las notas exceden los parámetros tradicionales");
	}
	
	Calificacion aIntroducir = new Calificacion(nombre, matricula, grupo, nota);
	Comparator<Calificacion> cmp = (c1,c2) -> c1.matricula().compareTo(c2.matricula());
	int pos = whereToAdd(cmp,calificaciones,aIntroducir);
	
	if(pos < calificaciones.size() && calificaciones.get(pos).matricula().equals(aIntroducir.matricula())) {
		throw new IllegalStateException("Ya hay una matrícula asociada a este usuario.");
	}
		
	calificaciones.add(pos, aIntroducir);
	
	return this;
}

@Override
public Calificacion getCalificacion(String matricula) throws IllegalArgumentException {
	if(matricula == null){
		throw new IllegalArgumentException("La matrícula es nula, introduzca una matrícula válida.");
	}
	int pos = this.getPositionOfMatricula(matricula);
	if(pos == -1) return null;
	return calificaciones.get(pos);
}

@Override
public ActaNotas updateCalificacion(Calificacion calificacion) throws IllegalArgumentException, IllegalStateException  {
	if(calificacion == null){
		throw new IllegalArgumentException("La calificación es nula, introduzca una calificación válida.");
	}
	int pos = this.getPositionOfMatricula(calificacion.matricula());
	if(pos == -1){
		throw new IllegalStateException("No existe una calificación con esta matrícula.");
	}
	deleteCalificacion(calificacion.matricula());
	addCalificacion(calificacion.nombreAlumno(), calificacion.matricula(), calificacion.grupo(), calificacion.nota());
	return this;
}

@Override
public ActaNotas deleteCalificacion(String matricula) throws IllegalArgumentException, IllegalStateException {
	if(matricula == null) {
		throw new IllegalArgumentException("La matrícula es nula, introduzca una matrícula asociada.");
	}
	int pos = this.getPositionOfMatricula(matricula);
	if (pos == -1) {
	throw new IllegalStateException("No hay una matrícula asociada a la calificación");
		
	}
	calificaciones.removeElementAt(pos);
	return this;
}

@Override
public double notaMedia() throws IllegalStateException {
	if(calificaciones.isEmpty()) {
		throw new IllegalStateException("La lista de calificaciones está vacía.");
	}
	double notaMedia = 0;
	for (int i = 0; i<this.calificaciones.size();i++) {
		notaMedia += calificaciones.get(i).nota();
	}
	notaMedia = notaMedia/calificaciones.size();
	return notaMedia;
}

@Override
public IndexedList<Pair<String, Integer>> alumnosPorGrupo() {

    IndexedList<String> grupos = new ArrayIndexedList<>();
    IndexedList<Integer> contadores = new ArrayIndexedList<>();
//Bucle para mirar la lista indexada de bucles
    for (int i = 0; i < this.calificaciones.size(); i++) {
        String grupo = this.calificaciones.get(i).grupo();

        int posGrupo = -1;
        for (int j = 0; j<grupos.size(); j++) {
            if (grupos.get(j).equals(grupo)) {
                posGrupo = j;
            }
        }

        if (posGrupo==-1) {
            grupos.add(grupos.size(), grupo);
            
            contadores.add(contadores.size(), 1);
        } else {
            contadores.set(posGrupo, contadores.get(posGrupo) + 1);
        }
    }
    IndexedList<Pair<String,Integer>> resultado = new ArrayIndexedList<>();
    for(int i = 0; i < grupos.size(); i++) {
    	resultado.add(i, new Pair<>(grupos.get(i),contadores.get(i)));
    }
    return resultado;
}

@Override
public IndexedList<Calificacion> getCalificaciones(Function<Calificacion, Boolean> filter,
        Comparator<Calificacion> cmp) {

    Comparator<Calificacion> comparador = (cmp != null)
            ? cmp
            : (c1, c2) -> c1.matricula().compareTo(c2.matricula());

    IndexedList<Calificacion> res = new ArrayIndexedList<>();
    for (int i = 0; i < calificaciones.size(); i++) {
        Calificacion calificacionBucle = calificaciones.get(i);
        if (filter == null || filter.apply(calificacionBucle)) {
            int pos = this.whereToAdd(comparador, res, calificacionBucle);
            res.add(pos, calificacionBucle);
        }
    }
    return res;
}

@Override
public boolean equals(Object obj){
	if(this == obj) return true;
	else if(obj instanceof ActaNotasImpl) {
		ActaNotasImpl other = (ActaNotasImpl) obj;

		boolean aux = false;
		int i = 0;
		if(this.calificaciones.size() == other.calificaciones.size()){
			while(i < this.calificaciones.size() && this.calificaciones.get(i).equals(other.calificaciones.get(i))){
				i++;
			}
			if(i == this.calificaciones.size()){
				aux = true;
			}
		}
		return aux
		&& this.asignatura().equals(other.asignatura())
		&& this.anyo() == other.anyo()
		&& this.esConvocatoriaExtraordinaria() == other.esConvocatoriaExtraordinaria()
		&& this.minNotaAprobado() == other.minNotaAprobado();
	} else return false;
}

@Override
public String toString(){
	return 
	"Acta: " + '\n' +
	this.asignatura() + '\n' + 
	this.anyo() + '\n' +
	this.esConvocatoriaExtraordinaria();
}

private int getPositionOfMatricula(String matricula) {
	if(calificaciones.size() == 0) {
		return -1;
	}
	int low = 0;
	int high = calificaciones.size() - 1;
	while(low <= high) {
		int mid = low + (high - low)/2;
		Calificacion midpoint = calificaciones.get(mid);
		if(midpoint.matricula().compareTo(matricula) == 0)
			return mid;
		if(midpoint.matricula().compareTo(matricula) < 0)
			low = mid + 1;
		else high = mid - 1;
	}
	return -1;
}

private int whereToAdd(Comparator <Calificacion> cmp, IndexedList<Calificacion> calificaciones, Calificacion Objetivo) {
 int inicio = 0;
int end = calificaciones.size();

	    while (inicio < end) {
	        int medio = inicio + (end - inicio) / 2;

	        if (cmp.compare(calificaciones.get(medio), Objetivo) < 0) {
	            inicio = medio + 1;
	        } else {
	            end = medio;
	        }
	    }

	    return inicio;
	}
}
