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

    //Atributo de Interfaz datos
    private IDatos datos;

    /**
     * Método que guarda productores e inicializa el atributo de la clase 
     * con una instancia de fachadaDatos.
     * @param productor parámetro productor
     */
    public void guardarProductor(Productor productor) {
        datos = new FachadaDatos();
        datos.guardarProductor(productor);
    }

    /**
     * Método que busca todos los productores en una lista de productores.
     * @return regresa una lista de productoresz
     */
    public List<Productor> buscarTodos() {
        datos = new FachadaDatos();
        return datos.listaProductor();
        
    }
    
    /**
     * Método verificar productor que verifica si el productor existe o no.
     * @param nombre parámetro nombne
     * @param numero parámetro número
     * @return regresa un booleano verdadero o falso
     */
    public Productor verificarProductor(String nombre, int numero){
        datos = new FachadaDatos();
       return datos.verificarProductorNombreId(nombre, numero);
    }
}
