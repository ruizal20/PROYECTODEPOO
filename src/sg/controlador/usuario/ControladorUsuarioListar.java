
package sg.controlador.usuario;

public class ControladorUsuarioListar {
    private ServicioUsuario serv = ServicioUsuario();
    
    public String Listar(){
        return serv.listar();
    }
   
}
