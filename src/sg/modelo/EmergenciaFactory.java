
package sg.modelo;

public class EmergenciaFactory {
    private static EmergenciaFactory fabrica = null;

    private EmergenciaFactory() {
    }
    
    public static EmergenciaFactory getFabrica(){
        if (fabrica == null) {
            fabrica = new EmergenciaFactory();
        }
        return fabrica;
    }
    
    public Emergencia getEmergencia(String tipo){
        if (tipo.equalsIgnoreCase("Inundacion")) {
            return new Inundacion();
        }else{
            if (tipo.equalsIgnoreCase("Deslizamiento")) {
                return new Deslizamiento();
            }else{
                if (tipo.equalsIgnoreCase("Incendio")) {
                    return new Incendio();
                }else{
                    if (tipo.equalsIgnoreCase("Vendaval")) {
                        return new Vendaval();
                    }else{
                        if (tipo.equalsIgnoreCase("Terremoto")) {
                            return new Terremoto();
                        }
                    }
                }
            }
        }
        return null;
    }
}
