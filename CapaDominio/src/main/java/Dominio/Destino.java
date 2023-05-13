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
    private ObjectId id;
    private Date fecha_llegada;
    private String nombre;
    private String tratamiento;
    
    public Destino(){
        
    }

    public Destino(ObjectId id, Date fecha_llegada, String nombre, String tratamiento) {
        this.id = id;
        this.fecha_llegada = fecha_llegada;
        this.nombre = nombre;
        this.tratamiento = tratamiento;
    }

    public ObjectId getId() {
        return id;
    }

    public void setId(ObjectId id) {
        this.id = id;
    }

    public Date getFecha_llegada() {
        return fecha_llegada;
    }

    public void setFecha_llegada(Date fecha_llegada) {
        this.fecha_llegada = fecha_llegada;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getTratamiento() {
        return tratamiento;
    }

    public void setTratamiento(String tratamiento) {
        this.tratamiento = tratamiento;
    }
}
