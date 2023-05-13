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
public class Empresa_transportista {
    
    private ObjectId id;
    private int traslados_totales;
    
    public Empresa_transportista(){
        
    }

    public Empresa_transportista(ObjectId id, int traslados_totales) {
        this.id = id;
        this.traslados_totales = traslados_totales;
    }

    public ObjectId getId() {
        return id;
    }

    public void setId(ObjectId id) {
        this.id = id;
    }

    public int getTraslados_totales() {
        return traslados_totales;
    }

    public void setTraslados_totales(int traslados_totales) {
        this.traslados_totales = traslados_totales;
    }
    
    
}
