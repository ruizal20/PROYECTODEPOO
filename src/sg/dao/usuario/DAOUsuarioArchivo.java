
package sg.dao.usuario;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import sg.modelo.Usuario;

public class DAOUsuarioArchivo implements DAOUsuario{
    private String archivo = "Usuario.doc";

    @Override
    public boolean guardar(Usuario usuario) {
        FileOutputStream archi = null;
       
        try {
            List<Usuario> usuarios = new ArrayList<>();
            usuarios = listar();
            usuarios.add(usuario);
            archi = new FileOutputStream(archivo); 
            ObjectOutputStream salida = new ObjectOutputStream(archi); 
            salida.writeObject(usuarios);
            
            salida.close();
            return true;
        } catch (FileNotFoundException ex) {
            Logger.getLogger(DAOUsuario.class.getName()).log(Level.SEVERE, null, ex);
            return false;
        } catch (IOException ex) { 
            Logger.getLogger(DAOUsuario.class.getName()).log(Level.SEVERE, null, ex);
            return false;
        } finally { 
            try {
                archi.close();
            } catch (IOException ex) {
                Logger.getLogger(DAOUsuario.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
    }

    @Override
    public List<Usuario> listar() {
        List<Usuario> usuarios = null;
        
        try{
            FileInputStream input = new FileInputStream(archivo);
            ObjectInputStream entrada = new ObjectInputStream(input);
            usuarios = (List<Usuario>) entrada.readObject();  
            
            entrada.close();
            input.close();
        }catch(Exception exe){ 
            System.err.println("Error al leer el archivo");
            usuarios = new ArrayList<>();
        }
        return usuarios;
    }
    
}
