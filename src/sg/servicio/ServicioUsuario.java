
package sg.servicio;

import java.util.ArrayList;
import java.util.List;
import sg.dao.usuario.DAOUsuario;
import sg.dao.usuario.DAOUsuarioArchivo;
import sg.modelo.Usuario;

public class ServicioUsuario {
    ArrayList<Usuario> usuarios;

    public ServicioUsuario() {
        usuarios = new ArrayList<>();
    }

    public ArrayList<Usuario> getUsuarios() {
        return (ArrayList<Usuario>) new DAOUsuarioArchivo().listar();
    }
    
    public boolean addUsuario(Usuario usuario){
        DAOUsuario dao = new DAOUsuarioArchivo();
        return dao.guardar(usuario);
    }
    
    public String listar(){
        String list = "";
        DAOUsuario dao = new DAOUsuarioArchivo();
        List<Usuario> usuarios = dao.listar();
        
        for (Usuario usuario : usuarios) {
            list += " " + usuario.toString() + "\n";
        }
        return list;
    }
    
    public boolean iniciarSesion(String usuario, String contrasena){
        System.out.println("llego al servicio");
        DAOUsuario dao = new DAOUsuarioArchivo();
        List<Usuario> usuarios = dao.listar();
        boolean correcto = false;
        int contra = Integer.parseInt(contrasena);
        
        for (Usuario u : usuarios) {
            if(u.getNombre().equals(usuario) && u.getCedula()==contra){
                correcto = true;
            }
        }
        
        return correcto;
    }
    
    public Usuario getUsuario(int cedula){
        DAOUsuario dao = new DAOUsuarioArchivo();
        List<Usuario> usuarios = dao.listar();
        Usuario usuario = null;
      
        for (Usuario u : usuarios) {
            if(u.getCedula()==cedula){
                usuario= u;
            }
            
        }
        
        return usuario;
    }
}
