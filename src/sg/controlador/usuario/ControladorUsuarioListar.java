
package sg.controlador.usuario;

import sg.servicio.ServicioUsuario;

public class ControladorUsuarioListar {
    private ServicioUsuario serv = new ServicioUsuario();
    
    public String Listar(){
        return serv.listar();
    }
   
}
