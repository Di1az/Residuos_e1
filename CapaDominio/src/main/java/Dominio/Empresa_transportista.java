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
    private String nombre;
    private String tipo_traslado;
    private float costoKM;

    public Empresa_transportista() {
    }

    public Empresa_transportista(ObjectId id, String nombre, String tipo_traslado, float costoKM) {
        this.id = id;
        this.nombre = nombre;
        this.tipo_traslado = tipo_traslado;
        this.costoKM = costoKM;
    }

    public Empresa_transportista(String nombre, String tipo_traslado, float costoKM) {
        this.nombre = nombre;
        this.tipo_traslado = tipo_traslado;
        this.costoKM = costoKM;
    }

    public ObjectId getId() {
        return id;
    }

    public void setId(ObjectId id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getTipo_traslado() {
        return tipo_traslado;
    }

    public void setTipo_traslado(String tipo_traslado) {
        this.tipo_traslado = tipo_traslado;
    }

    public float getCostoKM() {
        return costoKM;
    }

    public void setCostoKM(float costoKM) {
        this.costoKM = costoKM;
    }

}
