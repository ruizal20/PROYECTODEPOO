
package sg.dao.usuario;

import java.util.List;
import sg.modelo.Usuario;

public interface DAOUsuario {
    boolean guardar(Usuario usuario);
    List<Usuario> listar();
}
