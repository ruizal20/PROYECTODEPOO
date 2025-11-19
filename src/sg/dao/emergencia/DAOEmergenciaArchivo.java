
package sg.dao.emergencia;

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
import sg.modelo.Emergencia;

public class DAOEmergenciaArchivo implements DAOEmergencia{
    private String archivo = "Emergencia.data";

    @Override
    public boolean guardar(Emergencia emergencia) {
        FileOutputStream archi = null;
       
        try {
            List<Emergencia> emergencias = listar();
            emergencias.add(emergencia);
            archi = new FileOutputStream(archivo); 
            ObjectOutputStream salida = new ObjectOutputStream(archi); 
            salida.writeObject(emergencias);
            
            salida.close();
            return true;
        } catch (FileNotFoundException ex) {
            Logger.getLogger(DAOEmergencia.class.getName()).log(Level.SEVERE, null, ex);
            return false;
        } catch (IOException ex) { 
            Logger.getLogger(DAOEmergencia.class.getName()).log(Level.SEVERE, null, ex);
            return false;
        } finally { 
            try {
                archi.close();
            } catch (IOException ex) {
                Logger.getLogger(DAOEmergencia.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
    }
    
    @Override
    public boolean actualizarDatosEmergencia(Emergencia emegActualizada) {
        
        List<Emergencia> emrg = listar();

        for (int i = 0; i < emrg.size(); i++) {
            if (emrg.get(i).getId() == emegActualizada.getId()) {
                emrg.set(i, emegActualizada);
                return guardarLista(emrg);
            }
        }
        return false;
       
    }

    @Override
    public List<Emergencia> listar() {
        List<Emergencia> emergencias = null;
        
        try{
            FileInputStream input = new FileInputStream(archivo);
            ObjectInputStream entrada = new ObjectInputStream(input);
            emergencias = (List<Emergencia>) entrada.readObject();  
            
            entrada.close();
            input.close();
        }catch(Exception exe){ 
            System.err.println("Error al leer el archivo");
            emergencias = new ArrayList<>();
        }
        return emergencias;
    }
    
    private boolean guardarLista(List<Emergencia> emergencias) { // Guarda las emergencias con todos los datos actualizados
        FileOutputStream archi = null;
        try {
            archi = new FileOutputStream(archivo);
            ObjectOutputStream salida = new ObjectOutputStream(archi);

            salida.writeObject(emergencias);
            salida.close();
            return true;
        } catch (Exception e) {
            e.printStackTrace(); // Muestra la línea exacta donde ocurrió el error
            return false;
        }finally{
            try{
                archi.close();
            }catch(Exception e){
                e.printStackTrace();
            }
        }
    }
}
