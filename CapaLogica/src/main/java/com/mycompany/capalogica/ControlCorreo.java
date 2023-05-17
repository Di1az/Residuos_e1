/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.capalogica;

import Persistencia.CorreoDAO;
import java.util.Calendar;

/**
 *
 * @author koine
 */
public class ControlCorreo {
    
    CorreoDAO correo = new CorreoDAO();
    
    public String correoTexto(String direccion, String empresa, String km, String productor, String residuo, String cantRes, String fecha_estimada, String tipoTras){
        String traslado = "";
        
        traslado = "¡Buenos días!, "+ empresa +"\n"
                + "Se le informa de un pedido de envío de residuos a la siguiente direccion: \n"
                + direccion + "\n km del destino : "+km+"\n"
                + "Por parte de la empresa productora "+ productor + "\n"
                + "Con cargo de residuos: "+residuo+"\n"
                + "Cantidad de residuos de: "+cantRes+"\n"
                + "Para una fecha estimada de: "+fecha_estimada.toString()+" \n"
                + "con un tipo de traslado de: "+tipoTras+"\n"
                + "Se espera su pronta respuesta para la , gracias";
        
        return traslado;
    }
    
    public void correoEnvio(String receptor, String traslado){
        correo.sendEmail(receptor, traslado);
    }
    
}
