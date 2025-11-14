
package sg.controlador.usuario;

import sg.modelo.Usuario;
import sg.servicio.ServicioUsuario;

public class ControladorUsuarioGuardar {

    private ServicioUsuario serv = new ServicioUsuario();

    public boolean guardar(int cedula,String nombre,String zona, String ubicacion) {
        Usuario usu = new Usuario(cedula, nombre, zona, ubicacion);
        return serv.addUsuario(usu);
    }
    

   

    
}
