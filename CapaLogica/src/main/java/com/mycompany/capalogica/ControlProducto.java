/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.capalogica;
import Dominio.Producto;
import Persistencia.FachadaDatos;
import Persistencia.IDatos;
import java.util.List;

/**
 *
 * @author oscar
 */
public class ControlProducto {
    private IDatos datos;
    public void guardarProducto(Producto producto){
      datos = new FachadaDatos();
        datos.guardarProducto(producto); 
    }
    public List<Producto> buscarTodos(){
        datos = new FachadaDatos();
        return datos.listaProducto();
    }
}
