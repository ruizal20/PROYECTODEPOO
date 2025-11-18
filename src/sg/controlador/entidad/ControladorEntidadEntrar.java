/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package sg.controlador.entidad;

import sg.servicio.ServicioEntidadDeRiesgo;

/**
 *
 * @author anyor
 */
public class ControladorEntidadEntrar {
    public boolean entrar(int id){
        ServicioEntidadDeRiesgo ser = new ServicioEntidadDeRiesgo();
        return ser.entrar(id);
    }
}
