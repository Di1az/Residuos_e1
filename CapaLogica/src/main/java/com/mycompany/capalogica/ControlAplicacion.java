/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.capalogica;
import Dominio.Destino;
import Dominio.Productor;
import Dominio.Residuo;
import Dominio.Traslado;
import java.util.Date;
import java.util.Calendar;
import javax.swing.JOptionPane;

/**
 *
 * @author koine
 */
public class ControlAplicacion {
    
    /**
     * Método que nos ayuda para que no existan vacíos dentro del cuadro de
     * texto.
     *
     * @param nombreProductor nombre del productor a validar vacio
     * @param numIdentificador numero de identificador a validar vacio
     * @return regreso
     */
    public boolean validarVaciosInicioSesion(String nombreProductor, String numIdentificador) {
        boolean error = true;

        if (nombreProductor.equals("")
                && numIdentificador.equals("")) {
            JOptionPane.showMessageDialog(null, "Favor de no dejar campos sin llenar", "Informacion", JOptionPane.INFORMATION_MESSAGE);
            return false;
        }
        return error;
    }
    
    /**
     * Método de validación que solo permite letras y el espacio
     *
     * @param evento evt
     */
    public void validarNombreProductorInicioSesion(java.awt.event.KeyEvent evento) {
        if (evento.getKeyChar() >= 33 && evento.getKeyChar() <= 64
                || evento.getKeyChar() >= 91 && evento.getKeyChar() <= 96
                || evento.getKeyChar() >= 123 && evento.getKeyChar() <= 127) {

            evento.consume();

        }
    }
    
    
    
    /**
     * Método que nos ayuda para que no existan vacíos dentro del cuadro de
     * texto.
     *
     * @param cantidad cantidad a validar vacio
     * @param fecha fecha estimada a validar vacio
     * @return regreso
     */
    public boolean validarVaciosTraslado(String cantidad, Date fecha) {
        boolean error = true;

        if (cantidad.equals("")
                && fecha == null) {
            JOptionPane.showMessageDialog(null, "Favor de no dejar campos sin llenar", "Informacion", JOptionPane.INFORMATION_MESSAGE);
            return false;
        }
        return error;
    }
    
    /**
     * Metodo que valida que no se puedan poner caracteres especiales
     *
     * @param evento
     */
    public void validarCaracteresTraslado(java.awt.event.KeyEvent evento){
        if(evento.getKeyChar()>=33 && evento.getKeyChar() <=34
                || evento.getKeyChar()>=36 && evento.getKeyChar() <=47
                ||evento.getKeyChar()>=58 && evento.getKeyChar() <=64
                || evento.getKeyChar()>=91 && evento.getKeyChar() <=96
                || evento.getKeyChar()>=123 && evento.getKeyChar() <=208
                || evento.getKeyChar()>=210 && evento.getKeyChar() <=240
                || evento.getKeyChar()>=242 && evento.getKeyChar() <=255){
            
            evento.consume();
            
        }
        
    }
    
    /**
     * Metodo que se encarga de que la fecha estimada no sea menor al dia de hoy
     *
     * @param fecha parámetro fecha.
     * @return regresa un booleano verdadero o falso.
     */
    public boolean validarFechaTraslado(Date fecha) {
        Date hoy = new Date(); // Obtiene la fecha de hoy

        // Compara las fechas utilizando el método compareTo()
        // Si la fecha proporcionada es anterior a la fecha de hoy, devuelve false
        if (fecha.compareTo(hoy) < 0) {
            JOptionPane.showMessageDialog(null, "Fecha inválida");
            return false;

        }

        return true; // Si la fecha es igual o posterior a la fecha de hoy, devuelve true
    }
    
    /**
     * Método que nos ayuda para que no existan vacíos dentro del cuadro de
     * texto.
     *
     * @param nombreEmpresa nombre de la empresa a validar vacio
     * @param nombreProductor nombre del productor representante a validar vacio
     * @return regreso
     */
    public boolean validarVaciosRegistroProductor(String nombreEmpresa, String nombreProductor) {
        boolean error = true;

        if (nombreEmpresa.equals("")
                && nombreProductor.equals("")) {
            JOptionPane.showMessageDialog(null, "Favor de no dejar campos sin llenar", "Informacion", JOptionPane.INFORMATION_MESSAGE);
            return false;
        }
        return error;
    }
    
    /**
     * Método de validación que solo permite letras y el espacio
     *
     * @param evento evt
     */
    public void validarNombreProductor(java.awt.event.KeyEvent evento) {
        if (evento.getKeyChar() >= 33 && evento.getKeyChar() <= 64
                || evento.getKeyChar() >= 91 && evento.getKeyChar() <= 96
                || evento.getKeyChar() >= 123 && evento.getKeyChar() <= 127) {

            evento.consume();

        }
    }
    
    
    
    
    
}
