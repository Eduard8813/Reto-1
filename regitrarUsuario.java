import java.util.Scanner;
import java.util.ArrayList;
public class regitrarUsuario {
    
        public ArrayList<usuario>registrUsuarios(){
            ArrayList<usuario> lista = new ArrayList<>();
            Scanner sc = new Scanner(System.in);

            System.out.println("¿Cuántos usuarios vas a registrar? ");
            int cantidad = sc.nextInt();
            sc.nextLine();

            for(int i = 0; i < cantidad; i++){
                System.out.println("Usuario #" + (i + 1));
                System.out.println("Ingrese el nombre");
                String nombre = sc.nextLine();

                System.out.println("Ingrese el apellido");
                String apellido = sc.nextLine();

                System.out.println("Ingrese su edad");
                String edad = sc.nextLine();

                generarCodigo();
                String codigo = generarCodigo();

                usuario u = new usuario(nombre, apellido, edad, codigo);
                lista.add(u);
            }
            sc.close();
            return lista;
        }

        public String generarCodigo(){
            String codigoResultado = " ";

            for(int i = 0; i < 4 ; i++){
                int numero = (int)(Math.random() * 10);
                codigoResultado += numero;
            }

            for(int i = 0;i < 2; i++){
                char letra = (char)(Math.random() * 26);
                codigoResultado += letra;
            }
            return codigoResultado;
        }

}
