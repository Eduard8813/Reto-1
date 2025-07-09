public class usuario {
    private String nombre;
    private String apellido;
    private String edad;
    private String codigo;

    public usuario(String nombre, String apellido, String edad, String codigo){
        this.nombre = nombre;
        this.apellido = apellido;
        this.edad = edad;
        this.codigo = codigo;
    }

    public String getApellido() {
        return apellido;
    }
    public String getCodigo() {
        return codigo;
    }
    public String getEdad() {
        return edad;
    }
    public String getNombre() {
        return nombre;
    }

    public usuario(){

    }

    public String getinfo(){
        return nombre + apellido + edad + codigo;
    }

    void imprimir(){
        System.out.println("Datos: " + getNombre());
        System.out.println("Datos: " + getApellido());
        System.out.println("Datos: " + getCodigo());
        System.out.println("Datos: " + getEdad());
    }
}
