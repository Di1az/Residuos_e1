/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package subsistemaTraslado;

import Dominio.Traslado;
import java.util.List;

/**
 *
 * @author oscar
 */
public interface ITraslado {

    //Método guardarTraslado
    public void guardarTraslado(Traslado traslado);

    //Método de lista traslado que busca todos
    public List<Traslado> buscarTodosT();

    
}
