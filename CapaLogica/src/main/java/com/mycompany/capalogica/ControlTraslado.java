/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.capalogica;

import Dominio.Traslado;
import Persistencia.FachadaDatos;
import Persistencia.IDatos;
import java.util.List;

/**
 *
 * @author oscar
 */
public class ControlTraslado {
    //Atributo de Interfaz datos
    private IDatos datos;

    /**
     * Método que guarda traslados e inicializa el atributo de la clase 
     * con una instancia de fachadaDatos.
     * @param traslado parámetro traslado
     */
    public void guardarTraslado(Traslado traslado) {
        datos = new FachadaDatos();
        datos.guardarTraslado(traslado);
    }

    /**
     * Método que busca todos los residuos en una lista de traslados.
     * @return regresa una lista de Traslado
     */
    public List<Traslado> buscarTodos() {
        datos = new FachadaDatos();
        return datos.listaTraslado();
    }
    
    
    
    
    
}
