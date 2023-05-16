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
public class Producto {
    //Atributo id
    private ObjectId id;
    //Atributo residuo
    private Residuo residuo;
    
    /**
     * Constructor vacio de la clase.
     */
    public Producto(){
        
    }

    /**
     * Método constructor que inicializa los atributos de la clase.
     * @param id parámetro id
     * @param residuo parámetro residuo
     */
    public Producto(ObjectId id, Residuo residuo) {
        this.id = id;
        this.residuo = residuo;
    }

    /**
     * Método que obtiene el id.
     * @return regresa el id
     */
    public ObjectId getId() {
        return id;
    }

    /**
     * Método que ingresa el id.
     * @param id parámetro id
     */
    public void setId(ObjectId id) {
        this.id = id;
    }
    
    /**
     * Método que obtiene el residuo.
     * @return regresa residuo
     */
    public Residuo getResiduo() {
        return residuo;
    }

    /**
     * Método que ingresa el residuo.
     * @param residuo parámetro residuo
     */
    public void setResiduo(Residuo residuo) {
        this.residuo = residuo;
    }
    
    
}
