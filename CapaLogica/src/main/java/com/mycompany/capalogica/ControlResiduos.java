/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.capalogica;
import Dominio.Residuo;
import Persistencia.FachadaDatos;
import Persistencia.IDatos;
import java.util.List;

/**
 *
 * @author oscar
 */
public class ControlResiduos {
    //Atributo de Interfaz datos
    private IDatos datos;
    
    /**
     * Método que guarda residuos e inicializa el atributo de la clase 
     * con una instancia de fachadaDatos.
     * @param residuo parámetro residuo
     */
    public void guardarResiduo(Residuo residuo){
      datos=new FachadaDatos();
      datos.guardarResiduo(residuo);
    }
    
    /**
     * Método que busca todos los residuos en una lista de residuos.
     * @return regresa una lista de residuos
     */
    public List<Residuo> buscarTodos(){
        datos=new FachadaDatos();
        return datos.listaResiduo();
    }
}
