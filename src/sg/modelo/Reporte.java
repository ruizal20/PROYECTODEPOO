package sg.modelo;

public class Reporte{
    
    private String tipoEmergencia;
    private String ubicacion;
    private String descripcion;
    private boolean heridosVisibles;
    private Usuario usuarioReporta;

    public Reporte() {
    }

    public Reporte(String tipoEmergencia, String ubicacion, String descripcion, boolean heridosVisibles, Usuario usuarioReporta) {
        this.tipoEmergencia = tipoEmergencia;
        this.ubicacion = ubicacion;
        this.descripcion = descripcion;
        this.heridosVisibles = heridosVisibles;
        this.usuarioReporta = usuarioReporta;
    }
    
    

    /**
     * @return the tipoEmergencia
     */
    public String getTipoEmergencia() {
        return tipoEmergencia;
    }

    /**
     * @param tipoEmergencia the tipoEmergencia to set
     */
    public void setTipoEmergencia(String tipoEmergencia) {
        this.tipoEmergencia = tipoEmergencia;
    }

    /**
     * @return the ubicacion
     */
    public String getUbicacion() {
        return ubicacion;
    }

    /**
     * @param ubicacion the ubicacion to set
     */
    public void setUbicacion(String ubicacion) {
        this.ubicacion = ubicacion;
    }

    /**
     * @return the descripcion
     */
    public String getDescripcion() {
        return descripcion;
    }

    /**
     * @param descripcion the descripcion to set
     */
    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    /**
     * @return the heridosVisibles
     */
    public boolean isHeridosVisibles() {
        return heridosVisibles;
    }

    /**
     * @param heridosVisibles the heridosVisibles to set
     */
    public void setHeridosVisibles(boolean heridosVisibles) {
        this.heridosVisibles = heridosVisibles;
    }

    /**
     * @return the usuarioReporta
     */
    public Usuario getUsuarioReporta() {
        return usuarioReporta;
    }

    /**
     * @param usuarioReporta the usuarioReporta to set
     */
    public void setUsuarioReporta(Usuario usuarioReporta) {
        this.usuarioReporta = usuarioReporta;
    }

    @Override
    public String toString() {
        return "Reporte{" + "tipoEmergencia=" + tipoEmergencia + ", ubicacion=" + ubicacion + ", descripcion=" + descripcion + ", heridosVisibles=" + heridosVisibles + ", usuarioReporta=" + usuarioReporta + '}';
    }
    
    
}
