
package sg.controlador;

import sg.modelo.Usuario;




public class ControladorUsuarioGuardar {

    ServicioUsuario serv = ServicioUsuario();

    public boolean guardar(int cedula,String nombre,String zona, String ubicacion) {
        
        Usuario usu = new Usuario(cedula, nombre, zona, ubicacion);
        return serv.addEmergencia(usu);

    }
    

   

    
}
