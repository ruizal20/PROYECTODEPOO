/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package sg.controlador.usuario;

import sg.modelo.Usuario;
import sg.servicio.ServicioUsuario;

/**
 *
 * @author anyor
 */
public class ControladorUsuarioObtener {
    public Usuario getOne(int cedula){
        ServicioUsuario ser = new ServicioUsuario();
        return ser.getUsuario(cedula);
    }
}
