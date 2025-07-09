import java.util.ArrayList;

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
    public usuario(){

    }

    void inicio(){
        System.out.println("Bienvenido al sistema de gestion de usuarios registrados");
        camposlleno();
    }

    void camposlleno(){
        if(nombre != null && !nombre.isEmpty() && codigo != null && !codigo.isEmpty() && correo != null && !correo.isEmpty()){
                System.out.println("Muesta de estudiantes registrado");
                System.out.println("--------------------------------------");
                GestorUsuarios gestor = new GestorUsuarios();
                ArrayList<usuario>lista = gestor.getUsuarios();
                System.out.println(" Datos mostrados desde clase usuario:");
                for (usuario u : lista) {
                    System.out.println("Nombre: " + u.getNombre());
                    System.out.println("Correo: " + u.getCorreo());
                    System.out.println("Código: " + u.getCodigo());
                }
                System.out.println("--------------------------------------");
            }else{
                System.out.println("No hay estudiantes registrados.");
            }
    }
}
