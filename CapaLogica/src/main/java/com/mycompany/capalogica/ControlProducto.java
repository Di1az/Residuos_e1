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
    //Atributo de Interfaz datos
    private IDatos datos;
    /**
     * Método que guarda un prouducto, es parte de la fachada datos.
     * @param producto parámetro producto
     */
    public void guardarProducto(Producto producto){
      datos = new FachadaDatos();
        datos.guardarProducto(producto); 
    }
    /**
     * Método que buscar todos los productos en una lista de productos.
     * @return regresa una lista de productos
     */
    public List<Producto> buscarTodos(){
        datos = new FachadaDatos();
        return datos.listaProducto();
    }
}
