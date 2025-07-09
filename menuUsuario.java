import java.util.Scanner;

public class menuUsuario {
    Scanner sc = new Scanner(System.in);

    public void mostrarMenu(){
        System.out.println("--------------------------------------");
        System.out.println("Bienvenido al sistema de gestión de usuarios");
        System.out.println("--------------------------------------");
        System.out.println("Seleccione una opción:");
        System.out.println("1. Registrar usuario");
        System.out.println("2. Crear Usuario");
        System.out.println("3. Usuario Registrado");
        System.out.println("4. Salir");

        int opcion = sc.nextInt();

        switch (opcion) {
            case 1:
                regitrarUsuario registro = new regitrarUsuario();
                registro.inicio();;

                break;
            case 2:
                crearCursos cursos = new crearCursos();
                cursos.inicio();
                break;
            case 3:
                //usuarioRegistrado usuario = new usuarioRegistrado();
                //usuario.mostrarUsuario();
                System.out.println("Funcionalidad de mostrar usuario no implementada.");
                break;
            case 4:
                System.out.println("Saliendo del sistema...");
                System.exit(0);
                break;
            default:
                System.out.println("Opción no válida. Por favor, intente de nuevo.");
                mostrarMenu();
                break;
            }
    }
}
