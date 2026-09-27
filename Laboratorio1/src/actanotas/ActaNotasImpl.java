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
private int minNotaAprobada;

public ActaNotasImpl(IndexedList<Calificacion> calificaciones, String asignatura, int anyo, boolean esConvocatoriaExtraordinaria, int minNotaAprobada) {
this.calificaciones = calificaciones;
this.asignatura = asignatura;
this.anyo = anyo;
this.esConvocatoriaExtraordinaria = esConvocatoriaExtraordinaria;
this.minNotaAprobada = minNotaAprobada;
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
public Calificacion getCalificacion(String matricula) {
	return calificaciones.get(this.getPositionOfMatricula(matricula));
}

@Override
public ActaNotas updateCalificacion(Calificacion calificacion)  {
	
	return null;
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
	// TODO Auto-generated method stub
	return 0;
}

@Override
public IndexedList<Pair<String, Integer>> alumnosPorGrupo() {
	
	return null;
}

@Override
public IndexedList<Calificacion> getCalificaciones(Function<Calificacion, Boolean> filter,
		Comparator<Calificacion> cmp) {
		
	if (filter == null) {
	return this.calificaciones;
	}
	IndexedList<Calificacion> res = new ArrayIndexedList<>();
	for(int i = 0; i<calificaciones.size(); i++) {
		if(filter.apply(calificaciones.get(i))){
			if(cmp == null) {
				if(this.calificaciones.get(i).matricula().compareTo(res.get(i).matricula())<0){
				res.add(0, calificaciones.get(i));
				}
			}
		}
		
	}
	
	return null;
}

private int getPositionOfMatricula(String Matricula) {
	int position = 0;
Calificacion calificacionFirst = calificaciones.get(0);
Calificacion calificacionLast = calificaciones.get(calificaciones.size()-1);
while (calificacionFirst.matricula().compareTo(Matricula)<0) {
	int medio = (calificaciones.size()-1)/2;
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


}
