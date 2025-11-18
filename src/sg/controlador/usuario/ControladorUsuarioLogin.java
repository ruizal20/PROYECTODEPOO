/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package sg.controlador.usuario;

import sg.servicio.ServicioUsuario;

public class ControladorUsuarioLogin {
    
    public boolean iniciarSesion(String usuario, String contrasena){
         
        ServicioUsuario ser = new ServicioUsuario();
        return ser.iniciarSesion(usuario, contrasena);
        
    }
}
