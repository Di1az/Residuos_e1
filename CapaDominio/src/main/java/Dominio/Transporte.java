/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Dominio;

import org.bson.types.ObjectId;

/**
 *
 * @author dany
 */
public class Transporte {
    //Atributo id
    private ObjectId id;
//    //Atributo producto
//    private Producto producto;
    //Atributo vehiculo
    private String vehiculo;
    
    /**
     * Constructor vacío de la clase.
     */
    public Transporte(){
        
    }

    /**
     * Método constructor que inicializa los atributos de la clase.
     * @param id parámetro id
     * @param vehiculo parámetro vehiculo
     */
    public Transporte(ObjectId id, String vehiculo) {
        this.id = id;
//        this.producto = producto;
       
        this.vehiculo = vehiculo;
    }

    

    /**
     * Método que obtiene el vehiculo.
     * @return regresa vehiculo
     */
    public String getVehiculo() {
        return vehiculo;
    }

    /**
     * Método que ingresa el vehiculo.
     * @param vehiculo parámetro vehiculo
     */
    public void setVehiculo(String vehiculo) {
        this.vehiculo = vehiculo;
    }

    /**
     * Método que obtiene el id de la clase.
     * @return regresa id.
     */
    public ObjectId getId() {
        return id;
    }

    /**
     * Método que ingresa el id de la clase.
     * @param id parámetro id.
     */
    public void setId(ObjectId id) {
        this.id = id;
    }
}
