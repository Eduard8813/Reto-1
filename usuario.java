
public class usuario {
    private String nombre;
    private String correo;
    private String codigo;

    public usuario(String nombre, String correo, String codigo){
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
        if(nombre.isEmpty() || correo.isEmpty() || codigo.isEmpty()){
        return "Nombre: " + nombre + " | Correo: " + correo + " | Código: " + codigo;
        }else{
            System.out.println("Hay campos vacios.");
        }

        return getinfo();
    }
}
