/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package sg.controlador.usuario;

import java.util.ArrayList;
import sg.modelo.Usuario;
import sg.servicio.ServicioUsuario;

/**
 *
 * @author anyor
 */
public class ControladorUsuarioCargar {
    public ArrayList<Usuario> cargar(){
        ServicioUsuario serv = new ServicioUsuario();
        return serv.getUsuarios();
    }
    
}
