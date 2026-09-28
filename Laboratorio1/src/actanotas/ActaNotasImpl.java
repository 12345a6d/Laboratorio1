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
	for(int i = 0; i<calificaciones.size(); i++) {
		if (calificaciones.get(i).matricula() == matricula) {
			throw new IllegalStateException("Ya hay otra matrícula asociada a este usuario.");	
	}
	}
	
	calificaciones.add(calificaciones.size(), new Calificacion(nombre, matricula,grupo,nota));
	return this;
}

@Override
public Calificacion getCalificacion(String matricula) throws IllegalArgumentException {
	if(matricula == null){
		throw new IllegalArgumentException("La matrícula es nula, introduzca una matrícula válida.");
	return calificaciones.get(this.getPositionOfMatricula(matricula));
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
	addCalificacion(calificacion.nombre(), calificacion.matricula(), calificacion.grupo(), calificacion.nota);
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
public double notaMedia() {
	double notaMedia = 0;
	for (int i = 0; i<this.calificaciones.size();i++) {
		notaMedia += calificaciones.get(i).nota();
	}
	notaMedia = notaMedia/calificaciones.size();
	return notaMedia;
}

@Override
public IndexedList<Pair<String, Integer>> alumnosPorGrupo() {
	IndexedList<Pair<String,Integer>> resultado = new ArrayIndexedList<>();
	Integer numCalificaciones = 0; 
	for(int i = 0; i<calificaciones.size(); i++) {
	Calificacion calificacionBucle = calificaciones.get(i);
	Pair<String,Integer> parejaI = new Pair<>(calificacionBucle.grupo(),numCalificaciones);
	numCalificaciones++;
	resultado.add(i, parejaI);
	}
	return resultado;
}

@Override
public IndexedList<Calificacion> getCalificaciones(Function<Calificacion, Boolean> filter,
		Comparator<Calificacion> cmp) {
		
	if (filter == null) {
	return this.calificaciones;
	}
	IndexedList<Calificacion> res = new ArrayIndexedList<>();
	for(int i = 0; i<calificaciones.size(); i++) {
		Calificacion calificacionBucle = this.calificaciones.get(i);
		if(filter.apply(calificacionBucle)){
			if(cmp == null) {
				if(calificacionBucle.matricula().compareTo(res.get(i).matricula())<0){
				res.add(i-1, calificacionBucle);
				}
				else {
				res.add(i+1, calificacionBucle);
				}
			}
		}	
		else {
			res.add(this.whereToAdd(cmp, res, calificacionBucle), calificacionBucle);
		}
		
	}
	
	return null;
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
		&& this.minNotaAprobada() == other.minNotaAprobada();
	}
}

@Override
public String toString(){
	return
	"Acta: " + '\n' +
	this.asignatura() + '\n' +
	this.anyo() + '\n' +
	this.esConvocatoriaExtraordinaria();
}

private int getPositionOfMatricula(String Matricula) {
	int position = 0;
Calificacion calificacionFirst = calificaciones.get(0);
Calificacion calificacionLast = calificaciones.get(calificaciones.size()-1);
while (calificacionFirst.matricula().compareTo(Matricula)<0) {
	int medio = (calificaciones.size())/2;
Calificacion CalificacionMedio	= calificaciones.get(medio);
if(CalificacionMedio.matricula().equals(Matricula)) {
	position = medio;
}
else if(calificacionLast.matricula().compareTo(Matricula)<0) {
	calificacionFirst = calificaciones.get(medio+1);
}
else if (calificacionLast.matricula().compareTo(Matricula)>0){
	calificacionLast = calificaciones.get(medio-1);
}
else {
	position = -1;
}

}
return position;
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
