/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Subsistemas;

import Persistencia.CorreoDAO;

/**
 *
 * @author oscar
 */
public class ControlCorreo implements ICorreo{

    //Atributo de tipo correo inicializado con el correoDAO
    CorreoDAO correo = new CorreoDAO();
    
    /**
     * Método que setea el texto del correo, con todos los parámetros obtenidos
     * desde el frame de solicitar traslado.
     * @param direccion parámetro dirección
     * @param empresa parámetro empresa
     * @param km parámetro km
     * @param productor parámetro productor
     * @param residuo parámetro residuo
     * @param cantRes parámetro cantidad residuo
     * @param fecha_estimada parámetro fecha estimada
     * @param tipoTras parámetro tipo traslado
     * @return regresa un traslado
     */
    @Override
    public String correoTexto(String direccion, String empresa, String km, String productor, String residuo, String cantRes, String fecha_estimada, String tipoTras) {
         String traslado = "";
        
        traslado = "<h2> Residuos -  Traslados </h2> <br>"
                + "¡Buenos días!, "+ empresa +"<br>"
                + "Se le informa de un pedido de envío de residuos a la siguiente direccion: <br>"
                + direccion + "<br> , km del destino : "+km+"<br>"
                + "Por parte de la empresa productora "+ productor + "<br>"
                + "Con cargo de residuos: "+residuo+"<br>"
                + "Cantidad de residuos de: "+cantRes+"<br>"
                + "Para una fecha estimada de: "+fecha_estimada.toString()+" <br>"
                + "con un tipo de traslado de: "+tipoTras+". <br>"
                + "\nSe espera su pronta respuesta para la , gracias";
        
        return traslado;
    }

      /**
     * Método que llama el método sendEmail de la clase dao, que obtiene dos
     * Strings y le envía estos parámetros para envíar el correo al usuario.
     * @param receptor parámetro receptor
     * @param traslado parámetro traslado
     * */
    @Override
    public void correoEnvio(String receptor, String traslado) {
        correo.sendEmail(receptor, traslado);
    }
    
}
