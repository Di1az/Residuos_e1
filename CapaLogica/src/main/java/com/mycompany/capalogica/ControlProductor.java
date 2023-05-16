/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.capalogica;

import Dominio.Productor;
import Persistencia.FachadaDatos;
import Persistencia.IDatos;
import java.util.List;

/**
 *
 * @author oscar
 */
public class ControlProductor {

    private IDatos datos;

    public void guardarProductor(Productor productor) {
        datos = new FachadaDatos();
        datos.guardarProductor(productor);
    }

    public List<Productor> buscarTodos() {
        datos = new FachadaDatos();
        return datos.listaProductor();
        
    }
    
    public boolean verificarProductor(String nombre, int numero){
        datos = new FachadaDatos();
       return datos.verificarProductorNombreId(nombre, numero);
    }
}
