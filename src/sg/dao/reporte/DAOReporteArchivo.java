
package sg.dao.reporte;

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
import sg.modelo.Reporte;

public class DAOReporteArchivo implements DAOReporte{
    
    private String archivo = "Reporte.doc";

    @Override
    public boolean guardar(Reporte reporte) {
        FileOutputStream archi = null;
       
        try {
            List<Reporte> reportes = new ArrayList<>();
            reportes = listar();
            reportes.add(reporte);
            archi = new FileOutputStream(archivo); 
            ObjectOutputStream salida = new ObjectOutputStream(archi); 
            salida.writeObject(reportes);
            
            salida.close();
            return true;
        } catch (FileNotFoundException ex) {
            Logger.getLogger(DAOReporte.class.getName()).log(Level.SEVERE, null, ex);
            return false;
        } catch (IOException ex) { 
            Logger.getLogger(DAOReporte.class.getName()).log(Level.SEVERE, null, ex);
            return false;
        } finally { 
            try {
                archi.close();
            } catch (IOException ex) {
                Logger.getLogger(DAOReporte.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
    }

    @Override
    public List<Reporte> listar() {
        List<Reporte> reportes = null;
        
        try{
            FileInputStream input = new FileInputStream(archivo);
            ObjectInputStream entrada = new ObjectInputStream(input);
            reportes = (List<Reporte>) entrada.readObject();  
            
            entrada.close();
            input.close();
        }catch(Exception exe){ 
            System.err.println("Error al leer el archivo");
            reportes = new ArrayList<>();
        }
        return reportes;
    }
}
