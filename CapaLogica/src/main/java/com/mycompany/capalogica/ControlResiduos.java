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
    private IDatos datos;
    public void guardarResiduo(Residuo residuo){
      datos=new FachadaDatos();
      datos.guardarResiduo(residuo);
    }
    public List<Residuo> buscarTodos(){
        datos=new FachadaDatos();
        return datos.listaResiduo();
    }
}
