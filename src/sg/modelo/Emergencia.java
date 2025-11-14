package sg.modelo;

import java.util.ArrayList;

public abstract class Emergencia {
    private int id;
    private String causa;
    private String fecha;
    private String tipo;
    private String[] zonas;
    private int severidad;
    private ArrayList<Reporte> reportes;
    private EntidadDeRiesgo entidadQueAtiende;

    public Emergencia() {
    }

    public Emergencia(int id, String causa, String fecha, String tipo, String[] zonas, int severidad, ArrayList<Reporte> reportes, EntidadDeRiesgo entidadQueAtiende) {
        this.id = id;
        this.causa = causa;
        this.fecha = fecha;
        this.tipo = tipo;
        this.zonas = zonas;
        this.severidad = severidad;
        this.reportes = new ArrayList<>();
        this.entidadQueAtiende = entidadQueAtiende;
    }
    
    public void addReporte(Reporte reporte) {
        reportes.add(reporte);  
    }
    
    public int contarReporte() {
        return reportes.size();
    }
    
    ArrayList<String> listarReporte() {

        ArrayList<String> lista = new ArrayList<>();
        for (Reporte r : reportes) {
            lista.add(r.toString());
        }
        return lista;
    }
    
    public abstract void evaluarEmergencia();

    public abstract float porcenEmergencias();

    /**
     * @return the id
     */
    public int getId() {
        return id;
    }

    /**
     * @param id the id to set
     */
    public void setId(int id) {
        this.id = id;
    }

    /**
     * @return the causa
     */
    public String getCausa() {
        return causa;
    }

    /**
     * @param causa the causa to set
     */
    public void setCausa(String causa) {
        this.causa = causa;
    }

    /**
     * @return the fecha
     */
    public String getFecha() {
        return fecha;
    }

    /**
     * @param fecha the fecha to set
     */
    public void setFecha(String fecha) {
        this.fecha = fecha;
    }

    /**
     * @return the tipo
     */
    public String getTipo() {
        return tipo;
    }

    /**
     * @param tipo the tipo to set
     */
    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    /**
     * @return the zonas
     */
    public String[] getZonas() {
        return zonas;
    }

    /**
     * @param zonas the zonas to set
     */
    public void setZonas(String[] zonas) {
        this.zonas = zonas;
    }

    /**
     * @return the severidad
     */
    public int getSeveridad() {
        return severidad;
    }

    /**
     * @param severidad the severidad to set
     */
    public void setSeveridad(int severidad) {
        this.severidad = severidad;
    }

    /**
     * @return the reportes
     */
    public ArrayList<Reporte> getReportes() {
        return reportes;
    }

    /**
     * @param reportes the reportes to set
     */
    public void setReportes(ArrayList<Reporte> reportes) {
        this.reportes = reportes;
    }

    /**
     * @return the entidadQueAtiende
     */
    public EntidadDeRiesgo getEntidadQueAtiende() {
        return entidadQueAtiende;
    }

    /**
     * @param entidadQueAtiende the entidadQueAtiende to set
     */
    public void setEntidadQueAtiende(EntidadDeRiesgo entidadQueAtiende) {
        this.entidadQueAtiende = entidadQueAtiende;
    }

    @Override
    public String toString() {
        return "Emergencia{" + "id=" + id + ", causa=" + causa + ", fecha=" + fecha + ", tipo=" + tipo + ", zonas=" + zonas + ", severidad=" + severidad + ", reportes=" + reportes + ", entidadQueAtiende=" + entidadQueAtiende + '}';
    }
    
    
}
