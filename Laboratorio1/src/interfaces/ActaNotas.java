package interfaces;
import resto.Calificacion;
import java.util.function.Function;
import java.util.Comparator;
import es.upm.aedlib.Pair;
import es.upm.aedlib.indexedlist.IndexedList;

/**
 * Métodos para un acta: una coleccion de notas de alumnos de una asignatura. Una acta
 * esta asociada a una asignatura (String), un año (int), una convocatoria (julio o no),
 * y una nota minima para ser aprobado.
 */
public interface ActaNotas {

  /**
   * Devuelve el nombre de la asignatura.
   * @return el nombre de la asignatura.
   */
  public String asignatura();

  /**
   * Devuelve el año de las 
   * @return devuelve el año para las notas del acta.
   */
  public int anyo();
  
  /**
   * Devuelve true si el acta corresponde a una convocatoria extraordinaria (julio)
   * y false en caso contrario.
   * @return devuelve true si el acta corresponde a una convocatoria extraordinaria.
   */
  public boolean esConvocatoriaExtraordinaria();
  
  /**
   * Devuelve la nota minima para ser aprobado.
   * @return devuelve la nota minima para ser aprobado.
   */
  public double minNotaAprobado();

	/**
	 * Añade una calificacion al acta.
	 * @throws IllegalStateException si una calificacion de la misma matricula ya existe
   * en el acta.
   * @throws IllegalArgumentException si el nombre, matricula, o grupo es null,
   * o si nota < 0.0 o nota > 10.0.
   * @return devuelve el acta.
	 */
	public ActaNotas addCalificacion(String nombre, String matricula, String grupo, double nota);

	/**
	 * Devuelve la calificacion (unica) para el alumno identificado por su matricula (el parametro).
	 * @return devuelve la calificacion (unica) para el alumno identificado por su matricula (el parametro,
   * o null si no hay una calificacion en el acta con la matricula dada.
	 * @throws IllegalArgumentException si la matricula es null.
	 */
	public Calificacion getCalificacion(String matricula);

	/**
	 * Sustituye una calificacion existente dentro del acta
   * con la nueva (el parametro calificacion).
	 * @throws IllegalArgumentException si la calificacion es null.
	 * @throws IllegalStateException si ningun calificacion existe en el acta con
   * la matricula del parametro calificacion.
   * @return devuelve el acta.
	 */
	public ActaNotas updateCalificacion(Calificacion calificacion);

	/**
	 * Borra la calificacion para el alumno identificado por la matricula (el parametro).
	 * @throws IllegalArgumentException si la matricula es null.
	 * @throws IllegalStateException si en el acta no existe ninguna calificacion con
   * la matricula (el parametro).
	 */
	public ActaNotas deleteCalificacion(String matricula);


  /**
   * Devuelve la nota media de todas las calificaciones en el acta (suma notas / numero de calificaciones).
   * @return devuelve la nota media de todas las calificaciones en el acta.
   * @throws IllegalStateException si no hay calificaciones en el acta.
   */
  public double notaMedia();

  /**
   * Devuelve una lista indexada con pares de un nombre de grupo y el numero de calificaciones
   * para alumnos de este grupo que hay en el acta.
   * Notad que el orden de los pares en la lista indexada no esta definido.
   * @return devuelve una lista indexada con pares de un nombre de grupo y el numero de calificaciones
   * con alumnos de este grupo que hay en el acta.
   */
  public IndexedList<Pair<String,Integer>> alumnosPorGrupo();

  /**
   * Devuelve una lista indexada con las calificaciones (del acta) seleccionadas por
   * el argumento filtro, y ordenada segun el parametro Comparator cmp.
   * Es decir, el método devuelve todas las calificaciones del acta que el 
   * filtro accepta (devuelve true), y ordenadas segun el comparador cmp.
   * Si el parametro filtro es null no se filtra ninguna calificacion (todas estan devueltas),
   * y si el parametro cmp es null se debe usar el comparador que compara las matriculas de
   * las calificaciones (segun la comparacion normal -- compareTo -- de String).
   * @return devuelve una lista indexada con las calificaciones (del acta) seleccionadas por
   * el argumento filtro, y ordenada segun el parametro comparator cmp.
   */
  public IndexedList<Calificacion>
    getCalificaciones(Function<Calificacion,Boolean> filter,
                      Comparator<Calificacion> cmp);
}
