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
public class Detalle_Traslado {
    
    private ObjectId id;
    private int numeroVehiculos;
    private int totalProductos;
    
    public Detalle_Traslado(){
        
    }

    public Detalle_Traslado(ObjectId id, int numeroVehiculos, int totalProductos) {
        this.id = id;
        this.numeroVehiculos = numeroVehiculos;
        this.totalProductos = totalProductos;
    }

    public ObjectId getId() {
        return id;
    }

    public void setId(ObjectId id) {
        this.id = id;
    }

    public int getNumeroVehiculos() {
        return numeroVehiculos;
    }

    public void setNumeroVehiculos(int numeroVehiculos) {
        this.numeroVehiculos = numeroVehiculos;
    }

    public int getTotalProductos() {
        return totalProductos;
    }

    public void setTotalProductos(int totalProductos) {
        this.totalProductos = totalProductos;
    }
    
    
}
