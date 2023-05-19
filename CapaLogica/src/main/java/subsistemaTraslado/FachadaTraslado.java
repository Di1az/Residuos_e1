/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package subsistemaTraslado;

import Dominio.Traslado;
import java.util.List;

/**
 *
 * @author dany
 */
public class FachadaTraslado implements ITraslado{
    
    /**
     * Método que guarda traslados, creando una instancia de controltraslado
     * que llama al método de guardar traslado e ingresa un parámetro traslado.
     * @param traslado parámetro traslado
     */
    @Override
    public void guardarTraslado(Traslado traslado) {
        ControlTraslado cont = new ControlTraslado();
        cont.guardarTraslado(traslado);
    }
    
    /**
     * Método que busca todos los datos del traslado, crea una instancia de 
     * controltraslado y llama al método buscarTodos de la clase.
     * @return regresa una lista de los traslados
     */
    @Override
    public List<Traslado> buscarTodosT() {
       ControlTraslado cont = new ControlTraslado();
       return cont.buscarTodosT();
    }
    
    
    
}
