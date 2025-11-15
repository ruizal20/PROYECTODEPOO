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
    
    public String getTipoEmergencia() {
        return tipoEmergencia;
    }

    public void setTipoEmergencia(String tipoEmergencia) {
        this.tipoEmergencia = tipoEmergencia;
    }

    public String getUbicacion() {
        return ubicacion;
    }

    public void setUbicacion(String ubicacion) {
        this.ubicacion = ubicacion;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public boolean isHeridosVisibles() {
        return heridosVisibles;
    }

    public void setHeridosVisibles(boolean heridosVisibles) {
        this.heridosVisibles = heridosVisibles;
    }

    public Usuario getUsuarioReporta() {
        return usuarioReporta;
    }
    
    public void setUsuarioReporta(Usuario usuarioReporta) {
        this.usuarioReporta = usuarioReporta;
    }

    @Override
    public String toString() {
        return "Reporte{" + "tipoEmergencia=" + tipoEmergencia + ", ubicacion=" + ubicacion + ", descripcion=" + descripcion + ", heridosVisibles=" + heridosVisibles + ", usuarioReporta=" + usuarioReporta + '}';
    }
    
    
}
