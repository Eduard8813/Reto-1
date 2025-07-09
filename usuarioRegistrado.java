public class usuarioRegistrado extends regitrarUsuario{
    private String nombre;
    private String edad;
    private String apellido;
    private String codigo;

    public usuarioRegistrado(String nombre, String edad, String apellido, String codigo){
        super(nombre, apellido, edad, codigo);
        this.nombre = nombre;
        this.edad = edad;
        this.apellido = apellido;
        this.codigo = codigo;
    }

    public usuarioRegistrado(){

    }

    @Override
    public String getNombre() {
        return super.getNombre();
    }
    @Override
    public String getApellido() {
        return super.getApellido();        
    }
    @Override
    public String getEdad() {
        return super.getEdad();
    }

    void visualizar(){
        System.out.println("Nombre: " + nombre);
        System.out.println("Apellido: " + apellido);
        System.out.println("Edad: " + edad);
        System.out.println("Codigo: " + codigo);
    }

    void registro(){
        if(nombre != null && !nombre.isEmpty() || apellido != null && !apellido.isEmpty() || edad != null && !edad.isEmpty() || codigo != null && !codigo.isEmpty()){
            visualizar();

        }else{
            System.out.println("No hay usuario registrados");
        }
    }
}