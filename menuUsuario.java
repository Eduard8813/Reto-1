import java.util.Scanner;

public class menuUsuario {
    Scanner sc = new Scanner(System.in);

    public void mostrarMenu(){
        System.out.println("--------------------------------------");
        System.out.println("Bienvenido al sistema de gestión de usuarios");
        System.out.println("--------------------------------------");
        System.out.println("Seleccione una opción:");
        System.out.println("1. Registrar Estudiante");
        System.out.println("2. Crear Curos");
        System.out.println("3. Usuarios Registrados");
        System.out.println("4. Salir");

        int opcion = sc.nextInt();

        switch (opcion) {
            case 1:
                regitrarUsuario registro = new regitrarUsuario();
                registro.registrar();
                mostrarMenu();
                break;
            case 2:
                crearCursos registry = new crearCursos();
                cursos curso = registry.registrarCurso();
                Gestorcursos gestor = new Gestorcursos();
                gestor.guardarCurso(curso);
                mostrarMenu();
                break;
            case 3:
                GestorUsuarios visor = new GestorUsuarios();
                visor.mostrarUsuario();
                mostrarMenu();
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
