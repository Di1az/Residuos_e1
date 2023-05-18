/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Subsistemas;

import Dominio.Traslado;
import Persistencia.FachadaDatos;
import Persistencia.IDatos;
import java.util.List;

/**
 *
 * @author oscar
 */
public class ControlTraslado implements ITraslado{

    //Atributo de Interfaz datos
    private IDatos datos;

    /**
     * Método que guarda traslados e inicializa el atributo de la clase 
     * con una instancia de fachadaDatos.
     * @param traslado parámetro traslado
     */
    @Override
    public void guardarTraslado(Traslado traslado) {
        datos = new FachadaDatos();
        datos.guardarTraslado(traslado);
    }

    /**
     * Método que busca todos los residuos en una lista de traslados.
     * @return regresa una lista de Traslado
     */
    @Override
    public List<Traslado> buscarTodosT() {
        datos = new FachadaDatos();
        return datos.listaTraslado();
    }

    

    
    
}
