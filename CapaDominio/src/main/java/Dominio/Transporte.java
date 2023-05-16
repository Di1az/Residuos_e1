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
    //Atributo producto
    private Producto producto;
    //Atributo destino
    private String destino;
    //Atributo vehiculo
    private String vehiculo;
    //Atributo costo
    private float costoV;
    
    /**
     * Constructor vacío de la clase.
     */
    public Transporte(){
        
    }

    /**
     * Método constructor que inicializa los atributos de la clase.
     * @param id parámetro id
     * @param producto parámetro producto
     * @param destino parámetro destino
     * @param vehiculo parámetro vehiculo
     * @param costoV parámetro costoV
     */
    public Transporte(ObjectId id, Producto producto, String destino, String vehiculo, float costoV) {
        this.id = id;
        this.producto = producto;
        this.destino = destino;
        this.vehiculo = vehiculo;
        this.costoV = costoV;
    }

    /**
     * Método obtiene costo.
     * @return regresa costo
     */
    public float getCostoV() {
        return costoV;
    }

    /**
     * Método que ingresa el costo.
     * @param costoV parámetro costo
     */
    public void setCostoV(float costoV) {
        this.costoV = costoV;
    }

    /**
     * Método que obtiene el producto.
     * @return regresa producto.
     */
    public Producto getProducto() {
        return producto;
    }
    
    /**
     * Método que ingresa el producto.
     * @param producto parámetro producto
     */
    public void setProducto(Producto producto) {
        this.producto = producto;
    }

    /**
     * Método que obtiene el destino.
     * @return regresa destino.
     */
    public String getDestino() {
        return destino;
    }

    /**
     * Método que ingresa el destino.
     * @param destino parámetro destino
     */
    public void setDestino(String destino) {
        this.destino = destino;
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
