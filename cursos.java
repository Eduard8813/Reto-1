
public class cursos {

    String nombreCurso;
    String descripcionCurso;
    String duracionCurso;
    String fechaInicio;
    String fechaFin;

    public cursos(String nombreCurso, String descripcionCurso, String duracionCurso, String fechaInicio, String fechaFin) {
        this.nombreCurso = nombreCurso;
        this.descripcionCurso = descripcionCurso;
        this.duracionCurso = duracionCurso;
        this.fechaInicio = fechaInicio;
        this.fechaFin = fechaFin;
    }

    public cursos(){
        
    }

    public String getDescripcionCurso() {
        return descripcionCurso;
    }
    public String getDuracionCurso() {
        return duracionCurso;
    }
    public String getFechaFin() {
        return fechaFin;
    }
    public String getFechaInicio() {
        return fechaInicio;
    }
    public String getNombreCurso() {
        return nombreCurso;
    }
    public String getDatos() {
        return "Nombre: " + nombreCurso + " | Descripción: " + descripcionCurso +
            " | Duración: " + duracionCurso + " meses | Inicio: " + fechaInicio +
            " | Fin: " + fechaFin + " | ";
    }
}
