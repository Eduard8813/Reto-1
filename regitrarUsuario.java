import java.util.Scanner;
import java.util.ArrayList;
public class regitrarUsuario {
    
        private String nombre;
        private String correo;
        private String codigo;

        public ArrayList<usuario>registrUsuarios(){

            ArrayList<usuario> lista = new ArrayList<>();
            Scanner sc = new Scanner(System.in);

            System.out.println("¿Cuántos usuarios vas a registrar? ");
            int cantidad = sc.nextInt();
            sc.nextLine();

            for(int i = 0; i < cantidad; i++){
                System.out.println("Usuario #" + (i + 1));
                System.out.println("Ingrese el nombre");
                nombre = sc.nextLine();

                System.out.println("Ingrese el correo");
                correo = sc.nextLine();
                
                codigo = generarCodigo();

                usuario u = new usuario(nombre, correo, codigo);
                lista.add(u);

            }

            return lista;
        }

        public String generarCodigo(){
            String codigoResultado = "";

            for(int i = 0; i < 4 ; i++){
                int numero = (int)(Math.random() * 10);
                codigoResultado += numero;
            }

            for(int i = 0;i < 2; i++){
                char letra = (char)('A' + (int)(Math.random() * 26));
                codigoResultado += letra;
            }
            return codigoResultado;
        }
}
