
public class estudiantes {
    private String nombre;
    private String correo;
    private String codigo;

    public estudiantes(String nombre, String correo, String codigo){
        this.nombre = nombre;
        this.correo = correo;
        this.codigo = codigo;
    }

    public String getCorreo() {
        return correo;
    }
    public String getNombre() {
        return nombre;
    }
    public String getCodigo() {
        return codigo;
    }

    public String getinfo(){
        return "Nombre: " + nombre + " | Correo: " + correo + " | Código: " + codigo + "  |  ";
    }
}
