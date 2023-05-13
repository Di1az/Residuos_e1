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
    private ObjectId id;
    private Producto producto;
    private String destino;
    private String vehiculo;
    private float costoV;
    
    public Transporte(){
        
    }

    public Transporte(ObjectId id, Producto producto, String destino, String vehiculo, float costoV) {
        this.id = id;
        this.producto = producto;
        this.destino = destino;
        this.vehiculo = vehiculo;
        this.costoV = costoV;
    }

    public float getCostoV() {
        return costoV;
    }

    public void setCostoV(float costoV) {
        this.costoV = costoV;
    }

    public Producto getProducto() {
        return producto;
    }

    public void setProducto(Producto producto) {
        this.producto = producto;
    }

    public String getDestino() {
        return destino;
    }

    public void setDestino(String destino) {
        this.destino = destino;
    }

    public String getVehiculo() {
        return vehiculo;
    }

    public void setVehiculo(String vehiculo) {
        this.vehiculo = vehiculo;
    }

    public ObjectId getId() {
        return id;
    }

    public void setId(ObjectId id) {
        this.id = id;
    }
}
