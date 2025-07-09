import java.util.Scanner;
public class regitrarUsuario {
    
        private String nombre;
        private String apellido;
        private String edad;
        private String codigo;

        public regitrarUsuario(String nombre, String apellido, String edad, String codigo){
            this.nombre = nombre;
            this.apellido = apellido;
            this.edad = apellido;
            this.codigo = codigo;
        }
        
        public regitrarUsuario(){

        }
        public String getApellido() {
            return apellido;
        }
        public String getEdad() {
            return edad;
        }
        public String getNombre() {
            return nombre;
        }
        public void setApellido(String apellido) {
            this.apellido = apellido;
        }
        public void setEdad(String edad) {
            this.edad = edad;
        }
        public void setNombre(String nombre) {
            this.nombre = nombre;
        }
        public void setCodigo(String codigo) {
            this.codigo = codigo;
        }

        public String enviar(){
            return nombre + apellido + edad + codigo;
        }
        
        void control(){
            if(nombre != null && !nombre.isEmpty() || apellido != null && !nombre.isEmpty() || edad != null && !edad.isEmpty()){
                System.out.println("Datos registrado correctamente");
                mostrarDato();
                menuUsuario retorno = new menuUsuario();
                retorno.mostrarMenu();
            }else{
                System.out.println("Datos no registrado correctamente, intentelo de nuevo");
            }
        }

        void generarCodigo(){
            String codigoResultado = " ";

            for(int i = 0; i < 4 ; i++){
                int numero = (int)(Math.random() * 10);
                codigoResultado += numero;
            }

            for(int i = 0;i < 2; i++){
                char letra = (char)(Math.random() * 26);
                codigoResultado += letra;
            }
            setCodigo(codigoResultado);
        }


        void inicio(){
            System.out.println("Bienvenido al sistema de Registro estudiantil");
            Scanner scanner = new Scanner(System.in);

            System.out.println("Ingrese el nombre del estudiante");
            String valor1 = scanner.nextLine();
            if(valor1.isEmpty()){
                System.out.println("El nombre esta vacio, intentelo de nuevo");
                scanner.close();
                return;
            }else{
            setNombre(valor1);
            }
            
            System.out.println("Ingrese su apellido");
            String valor2 = scanner.nextLine();
            if(valor2.isEmpty()){
                System.out.println("El apellido esta vacion, intentelo de nuevo");
                scanner.close();
                return;
            }else{
                setApellido(valor2);
            }

            System.out.println("Ingrese su edad");
            String valor3 = scanner.nextLine();
            if(valor3.isEmpty()){
                System.out.println("La edad esta vacio, intentelo de nuevo<");
                scanner.close();
                return;
            }else{
                setEdad(valor3);
            }
            generarCodigo();
            control();
            scanner.close();
        }

        void mostrarDato(){
            System.out.println("Nombre: " + nombre);
            System.out.println("Apellido: " + apellido);
            System.out.println("Edad: " + edad);
            System.out.println("Codigo: " + codigo);
        }
}
