
package sg.controlador;




public class ControladorEmergenciaGuardar {

    ServicioEmergencia serv = ServicioEmergencia();

    public boolean guardar(String tipo,
            String causa,
            String fecha,
            String[] zonas,
            int severidad) {
        
        Emergencia em = new Emergencia(tipo,causa,fecha,zonas, severidad);
        return serv.addEmergencia(em);

    }
    

   

    
}
