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

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getCausa() {
        return causa;
    }

    public void setCausa(String causa) {
        this.causa = causa;
    }

    public String getFecha() {
        return fecha;
    }

    public void setFecha(String fecha) {
        this.fecha = fecha;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public String[] getZonas() {
        return zonas;
    }

    public void setZonas(String[] zonas) {
        this.zonas = zonas;
    }

    public int getSeveridad() {
        return severidad;
    }

    public void setSeveridad(int severidad) {
        this.severidad = severidad;
    }

    public ArrayList<Reporte> getReportes() {
        return reportes;
    }

    public void setReportes(ArrayList<Reporte> reportes) {
        this.reportes = reportes;
    }

    public EntidadDeRiesgo getEntidadQueAtiende() {
        return entidadQueAtiende;
    }

    public void setEntidadQueAtiende(EntidadDeRiesgo entidadQueAtiende) {
        this.entidadQueAtiende = entidadQueAtiende;
    }

    @Override
    public String toString() {
        return "Emergencia{" + "id=" + id + ", causa=" + causa + ", fecha=" + fecha + ", tipo=" + tipo + ", zonas=" + zonas + ", severidad=" + severidad + ", reportes=" + reportes + ", entidadQueAtiende=" + entidadQueAtiende + '}';
    }
    
    public void actualizarDatosEntidad(String tipo, String causa, String fecha, String[] zonas, int severidad){
        this.tipo = tipo;
        this.causa = causa;
        this.fecha = fecha;
        this.zonas = zonas;
        this.severidad = severidad;
    }
}
