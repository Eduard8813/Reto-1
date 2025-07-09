import java.util.Scanner;

public class crearCursos {

    String nombreCurso;
    String descripcionCurso;
    String duracionCurso;
    String fechaInicio;
    String fechaFin;

    public crearCursos(String nombreCurso, String descripcionCurso, String duracionCurso, String fechaInicio, String fechaFin) {
        this.nombreCurso = nombreCurso;
        this.descripcionCurso = descripcionCurso;
        this.duracionCurso = duracionCurso;
        this.fechaInicio = fechaInicio;
        this.fechaFin = fechaFin;
    }

    public crearCursos(){
        
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
    
    public void setDescripcionCurso(String descripcionCurso) {
        this.descripcionCurso = descripcionCurso;
    }
    public void setDuracionCurso(String duracionCurso) {
        this.duracionCurso = duracionCurso;
    }
    public void setFechaFin(String fechaFin) {
        this.fechaFin = fechaFin;
    }
    public void setFechaInicio(String fechaInicio) {
        this.fechaInicio = fechaInicio;
    }
    public void setNombreCurso(String nombreCurso) {
        this.nombreCurso = nombreCurso;
    }

    public void inicio(){
            System.out.println("Bienvenido al sistema de gestion de cursos");
            scanner();
            camposlleno();
    }
    
    void mostrar(){
            System.out.println("Nombre del curso: " + nombreCurso);
            System.out.println("--------------------------------------");
            System.out.println("Descripcion del curso: " + descripcionCurso);
            System.out.println("--------------------------------------");
            System.out.println("Duracion del curso: " + duracionCurso + " horas");
            System.out.println("--------------------------------------");
            System.out.println("Fecha de inicio: " + fechaInicio);
            System.out.println("--------------------------------------");
            System.out.println("Fecha de fin: " + fechaFin);
        }

        void scanner(){
            Scanner scanner = new Scanner(System.in);

            System.out.println("Ingrese el nombre del curso:");
            String valor1 = scanner.nextLine();
            if(valor1.isEmpty()) {
                System.out.println("El nombre del curso no puede estar vacío. Por favor, intente de nuevo.");
                scanner.close();
                return;
            }else{
            setNombreCurso(valor1);
            System.out.println("--------------------------------------");
            }

            System.out.println("Ingrese la descripcion del curso:");
            String valor2 = scanner.nextLine();
            if(valor2.isEmpty()){
                System.out.println("La descripcion del curso no puede estar vacio. por favor, intente de nuevo.");
                scanner.close();
                return;
            }else{
            setDescripcionCurso(valor2);
            System.out.println("--------------------------------------");
            }

            System.out.println("Ingrese la duracion del curso (en meses):");
            String valor3 = scanner.nextLine();
            if(valor3.isEmpty()){
                System.out.println("La duracion del curso no puede estar vacio. por favor, intente de nuevo.");
                scanner.close();
                return;
            }else{
            setDuracionCurso(valor3);
            System.out.println("--------------------------------------");
            }

            System.out.println("Ingrese la fecha de inicio del curso (dd/mm/yyyy):");
            String valor4 = scanner.nextLine();
            if(valor4.isEmpty()){
                System.err.println("La fecha de inicio no puede estar vacion. por favor, intente de nuevo.");
                scanner.close();
                return;
            }else{ 
            setFechaInicio(valor4);
            System.out.println("--------------------------------------");
            }

            System.out.println("Ingrese la fecha de fin del curso (dd/mm/yyyy):");
            String valor5 = scanner.nextLine();
            if (valor5.isEmpty()) {
                System.out.println("La fecha de fin no puede estar vacio. por favor, intente de nuevo.");
                scanner.close();
                return;
            }else{ 
            setFechaFin(valor5);
            System.out.println("--------------------------------------");
            }

            scanner.close();
        }

        void camposlleno(){
            if(nombreCurso != null && !nombreCurso.isEmpty() || descripcionCurso != null && !descripcionCurso.isEmpty() || duracionCurso != null && !duracionCurso.isEmpty() || fechaInicio != null && !fechaInicio.isEmpty() || fechaFin != null && !fechaFin.isEmpty()){
                System.out.println("Curso creado correctamente");
                System.out.println("--------------------------------------");
                mostrar();
                System.out.println("--------------------------------------");
            }else{
                System.out.println("Curso creado incorrectamente, intente de nuevo");
            }
        }
}