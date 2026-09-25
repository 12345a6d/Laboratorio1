package resto;
import java.lang.Comparable;


	/**
	 * Una calificacion representa la nota de un alumno (con un nombre, matricula y grupo) en una convocatoria.
	 */
	public class Calificacion {
		String nombreAlumno;
		String matricula;
	  String grupo;
		double nota;
	  
	  /**
	   * Construye una calificacion compuesto por un nombre, matricula, grupo y nota.
	   * @throws IllegalArgumentException si nombre, matricula o grupo es null,
	   * o si nota < 0.0 o nota > 10.0.
	   */
	  public Calificacion(String nombreAlumno, String matricula, String grupo, double nota) {
	    if (nombreAlumno == null || matricula == null || grupo == null || nota < 0.0 || nota > 10.0) {
	      throw new IllegalArgumentException();
	    }

	    this.nombreAlumno = nombreAlumno;
	    this.matricula = matricula;
	    this.grupo = grupo;
	    this.nota = nota;
	  }
	  
	  /**
	   * Devuelve el nombre.
	   * @return devuelve el nombre.
	   */
	  public String nombreAlumno() {
	    return nombreAlumno;
	  }
	  
	  /**
	   * Devuelve la matricula.
	   * @return devuelve la matricula.
	   */
	  public String matricula() {
	    return matricula;
	  }
	  
	  /**
	   * Devuelve el grupo.
	   * @return devuelve el grupo.
	   */
	  public String grupo() {
	    return grupo;
	  }
	  
	  /**
	   * Devuelve la nota.
	   * @return devuelve la nota.
	   */
	  public double nota() {
	    return nota;
	  }
	  
	  public String toString() {
	    return "Calificacion("+
		    "\""+nombreAlumno()+
		    "\",\""+matricula()+
		    "\",\""+grupo()+
		    "\","+nota()+
		    ")";
	  }
	  
	  public boolean equals(Object obj) {
	    if (this == obj) return true;
	    else if (obj instanceof Calificacion) {
	      Calificacion other = (Calificacion) obj;
	    
	      return
	        nombreAlumno.equals(other.nombreAlumno())
	        && matricula.equals(other.matricula())
	        && grupo.equals(other.grupo());
	    } else return false;
	  }
	  
	  public int hashCode() {
	    return
	      nombreAlumno.hashCode()
	      + matricula.hashCode()
	      + grupo.hashCode();
	  }
	}
