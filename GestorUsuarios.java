import java.util.ArrayList;

public class GestorUsuarios {
    private ArrayList<usuario> usuarios;

    public GestorUsuarios() {
        regitrarUsuario registro = new regitrarUsuario();
        usuarios = registro.registrUsuarios();
    }

    public ArrayList<usuario> getUsuarios() {
        return usuarios;
    }
}
