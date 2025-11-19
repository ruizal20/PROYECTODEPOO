
package sg.controlador.usuario;

import sg.dao.usuario.DAOUsuarioArchivo;

public class ControladorUsuarioEliminar {
    private DAOUsuarioArchivo dao; 

    public ControladorUsuarioEliminar() {
        dao = new DAOUsuarioArchivo(); 
    }
    public boolean eliminarUsuario(int cedula){
        return dao.eliminar(cedula);
    }
}
