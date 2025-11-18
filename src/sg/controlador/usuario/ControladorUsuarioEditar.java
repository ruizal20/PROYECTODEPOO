
package sg.controlador.usuario;

import sg.modelo.Usuario;
import sg.servicio.ServicioUsuario;

public class ControladorUsuarioEditar {
    private ServicioUsuario serv = new ServicioUsuario();

    public boolean editar(int cedula, String nuevoNombre,String nuevaZona, String nuevaUbicacion) {
        Usuario usu = new Usuario(cedula, nuevoNombre, nuevaZona, nuevaUbicacion);
        return serv.addUsuario(usu);
    }
}
