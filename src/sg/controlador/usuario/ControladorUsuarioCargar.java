
package sg.controlador.usuario;

import java.util.ArrayList;
import sg.modelo.Usuario;
import sg.servicio.ServicioUsuario;

/**
 *
 * @author anyor
 */
public class ControladorUsuarioCargar {
    public ArrayList<Usuario> cargar(){
        ServicioUsuario serv = new ServicioUsuario();
        return serv.getUsuarios();
    }
    
    public boolean existeUsuario(int cedula){
        ArrayList<Usuario> usuarios = cargar();
        for (Usuario usuario : usuarios) {
            if (usuario.getCedula() == cedula) {
                return true;
            }
        }
        return false;
    }
}
