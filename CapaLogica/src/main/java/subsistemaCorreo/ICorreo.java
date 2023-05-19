/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package subsistemaCorreo;

/**
 *
 * @author oscar
 */
public interface ICorreo {
    //Método para setear el correo del productor
    public String correoTexto(String direccion, String empresa, String km, String productor, String residuo, String cantRes, String fecha_estimada, String tipoTras);

    //Método para enviar correo
    public void correoEnvio(String receptor, String traslado);
}
