/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Dominio;


import java.util.Date;
import org.bson.types.ObjectId;

/**
 *
 * @author dany
 */
public class Destino {
    //Atributo de clase id
    private ObjectId id;
    //Atributo de clase fecha_llegada
    private Date fecha_llegada;
    //Atributo de clase nombre
    private String nombre;
    //Atributo de clase tratamiento
    private String tratamiento;
    
    /**
     * Constructor vacío de la clase.
     */
    public Destino(){
        
    }

    /**
     * Constructor que inicializa los parámetros de la clase.
     * @param id atributo id
     * @param fecha_llegada atributo fecha_llegada
     * @param nombre atributo nombre
     * @param tratamiento atributo tratamiento
     */
    public Destino(ObjectId id, Date fecha_llegada, String nombre, String tratamiento) {
        this.id = id;
        this.fecha_llegada = fecha_llegada;
        this.nombre = nombre;
        this.tratamiento = tratamiento;
    }

    /**
     * Método que obtiene el id de la clase.
     * @return regresa id
     */
    public ObjectId getId() {
        return id;
    }

    /**
     * Método que ingresa el valor del id de la clase.
     * @param id parámetro id
     */
    public void setId(ObjectId id) {
        this.id = id;
    }

    /**
     * Método que obtiene la fecha de llegada.
     * @return regresa fecha_llegada
     */
    public Date getFecha_llegada() {
        return fecha_llegada;
    }

    /**
     * Método que ingresa la fecha de llegada.
     * @param fecha_llegada parámetro fecha_llegada
     */
    public void setFecha_llegada(Date fecha_llegada) {
        this.fecha_llegada = fecha_llegada;
    }

    /**
     * Método que obtiene el nombre.
     * @return regresa nombre
     */
    public String getNombre() {
        return nombre;
    }

    /**
     * Método que ingresa el nombre.
     * @param nombre parámetro nombre
     */
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    /**
     * Método que obtiene el tratamiento.
     * @return regresa tratamiento
     */
    public String getTratamiento() {
        return tratamiento;
    }

    /**
     * Método que ingresa el tratamiento.
     * @param tratamiento parámetro tratamiento
     */
    public void setTratamiento(String tratamiento) {
        this.tratamiento = tratamiento;
    }

    /**
     * Método toString que nos da el destino como un texto
     * @return regresa destino
     */
    @Override
    public String toString() {
        return nombre;
    }
    
}
