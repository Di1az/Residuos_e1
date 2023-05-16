/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Dominio;

import org.bson.types.ObjectId;

/**
 *
 * @author hoshi
 */
public class Gobierno {
    //Atributo id
    private ObjectId id;
    
    /**
     * Constructor vacio de la clase.
     */
    public Gobierno(){
        
    }

    /**
     * Método constructor que inicializa los atributos de la clase.
     * @param id parámetro id
     */
    public Gobierno(ObjectId id) {
        this.id = id;
    }
    
    /**
     * Método que obtiene el id de la clase.
     * @return regresa id
     */
    public ObjectId getId() {
        return id;
    }

    /**
     * Método que ingresa el id de la clase.
     * @param id parámetro id
     */
    public void setId(ObjectId id) {
        this.id = id;
    }

    
    
}
