package sg.modelo;

import java.lang.reflect.Array;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Date;
import sg.controlador.emergencia.ControladorEmergenciaCargar;
import sg.controlador.emergencia.ControladorEmergenciaGuardar;
import sg.controlador.entidad.ControladorEntidadCargar;
import sg.controlador.usuario.ControladorUsuarioCargar;

public class GestionEmergencia {

    private static GestionEmergencia instancia = null;
    private ArrayList<Usuario> usuarios;
    private ArrayList<Emergencia> emergencias;
    private ArrayList<EntidadDeRiesgo> entidades;

    private GestionEmergencia() {
        usuarios = new ArrayList<>();
        emergencias = new ArrayList<>();
        entidades = new ArrayList<>();
        cargarDatos();
    }

    public ArrayList<Usuario> getUsuarios() {
        return usuarios;
    }

    public void setUsuarios(ArrayList<Usuario> usuarios) {
        this.usuarios = usuarios;
    }

    public ArrayList<Emergencia> getEmergencias() {
        return emergencias;
    }

    public void setEmergencias(ArrayList<Emergencia> emergencias) {
        this.emergencias = emergencias;
    }

    public ArrayList<EntidadDeRiesgo> getEntidades() {
        return entidades;
    }

    public void setEntidades(ArrayList<EntidadDeRiesgo> entidades) {
        this.entidades = entidades;
    }

    @Override
    public String toString() {
        return "GestionEmergencia{" + "usuarios = " + usuarios + ", emergencias = " + emergencias + ", entidades = " + entidades + '}';
    }

    public static GestionEmergencia getInstancia() {
        if (instancia == null) {
            instancia = new GestionEmergencia();
        }
        return instancia;
    }

    public void crearEmergencia(Emergencia emergencia) {
        emergencias.add(emergencia);
    }

    public void crearUsuario(Usuario usuario) {
        usuarios.add(usuario);
    }

    public void crearEntidad(EntidadDeRiesgo entidad) {
        entidades.add(entidad);
    }

    public String listarXEmengencia(String tipo) {
        String list = "";
        for (Emergencia emergencia : emergencias) {
            if (emergencia.getTipo().equalsIgnoreCase(tipo)) {
                list += " " + emergencia.toString() + "\n";
            }
        }
        return list;
    }

    public String listarXUsuario(String nomUsuario) {
        String list = "";
        for (Usuario usuario : usuarios) {
            if (usuario.getNombre().equalsIgnoreCase(nomUsuario)) {
                list += " " + usuario.toString() + "\n";
            }
        }
        return list;
    }

    public String listarXZona(String xZona) {
        String list = "";
        for (Emergencia emergencia : emergencias) {
            if (emergencia.getZonas().equals(xZona)) {
                list += " " + emergencia.toString() + "\n";
            }
        }
        return list;
    }

    public String listarXEntidad(String xEntidad) {
        String list = "";
        for (EntidadDeRiesgo entidad : entidades) {
            if (entidad.getNombre().equalsIgnoreCase(xEntidad)) {
                list += " " + entidad.toString() + "\n";
            }
        }
        return list;
    }

    public float porcenEmergAtendXEntidad(String xEntidad) {
        float porcen = 0;
        for (EntidadDeRiesgo entidad : entidades) {
            if (entidad.getNombre().equalsIgnoreCase(xEntidad)) {
                porcen = (float) (entidad.getCantEmergAtendidas() / emergencias.size() * 100);
            }
        }
        return porcen;
    }

    public float porcenXTipoEmergencia(String xTipo) {
        float porcen = 0, conta = 0;
        for (Emergencia emergencia : emergencias) {
            if (emergencia.getTipo().equalsIgnoreCase(xTipo)) {
                conta++;
            }
        }
        return (float) (conta / emergencias.size() * 100);
    }

    public void cargarDatos() {
        ControladorUsuarioCargar cUsuario = new ControladorUsuarioCargar();
        ControladorEmergenciaCargar cEmergencia = new ControladorEmergenciaCargar();
        ControladorEntidadCargar cEntidad = new ControladorEntidadCargar();

        usuarios = cUsuario.cargar();
        emergencias = cEmergencia.cargar();
        entidades = cEntidad.cargar();
    }

    public void gestionarEmergencia(Reporte reporte) {
        String emergencia = reporte.getTipoEmergencia();
        string zona = reporte.getZona();
        boolean existe = false;

        for (Emergencia eme : emergencias) {
            if (Arrays.asList(eme.getZonas()).contains(zona) && eme.getTipo().equals(emergencia)) {
                existe = true;
                break;
            }
        }

        if (existe) {
            eme.addReporte(reporte);

        } else {
            ControladorEmergenciaGuardar conEmeGua = new ControladorEmergenciaGuardar();
            int id = emergencias.size()+1;
            String fecha = LocalDate.now();
            String[] zonas;
            zonas[0]=zona;
            ArrayList<Reporte> reportes = new ArrayList<>();
            reportes.add(reporte);
            
            EntidadDeRiesgo entidadQueAtiende = AsignarEntidad();
                       
            conEmeGua.guardar(id, "",fecha , emergencia, zonas, 0,reportes , entidadQueAtiende)

        }

    }
    
    public EntidadDeRiesgo AsignarEntidad(){
        
    }
}
