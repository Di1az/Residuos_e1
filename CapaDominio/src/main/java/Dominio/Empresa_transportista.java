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

    //Atributo id de la clase
    private ObjectId id;
    //Atributo nombre de la clase
    private String nombre;
    //Atributo tipo_traslado de la clase
    private String tipo_traslado;
    //Atributo costoKM de la clase
    private float costoKM;
    //Atributo email de la clase
    private String email;

    /**
     * Método constructor vacío de la clase.
     */
    public Empresa_transportista() {
    }

    /**
     * Método constructor que inicializa los atributos de la clase.
     * @param id parámetro id
     * @param nombre parámetro nombre
     * @param tipo_traslado parámetro tipo_traslado
     * @param costoKM parámetro costoKM
     * @param email parámetro email
     */
    public Empresa_transportista(ObjectId id, String nombre, String tipo_traslado, float costoKM, String email) {
        this.id = id;
        this.nombre = nombre;
        this.tipo_traslado = tipo_traslado;
        this.costoKM = costoKM;
        this.email = email;
    }

    /**
     * Método constructor que inicializa los atributos de la clase sin id.
     * @param nombre parámetro nombre
     * @param tipo_traslado parámetro tipo_traslado
     * @param costoKM parámetro costoKM
     * @param email parámetro email
     */
    public Empresa_transportista(String nombre, String tipo_traslado, float costoKM, String email) {
        this.nombre = nombre;
        this.tipo_traslado = tipo_traslado;
        this.costoKM = costoKM;
        this.email = email;
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

    /**
     * Método que obtiene el nombre.
     * @return regresa nombre
     */
    public String getNombre() {
        return nombre;
    }

    /**
     * Método que ingresa el nombre.
     * @param nombre parámetro nombre.
     */
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    /**
     * Método que obtiene el tipo de traslado.
     * @return regresa tipo de traslado
     */
    public String getTipo_traslado() {
        return tipo_traslado;
    }

    /**
     * Método que ingresa el tipo de traslado.
     * @param tipo_traslado parámetro tipo de traslado.
     */
    public void setTipo_traslado(String tipo_traslado) {
        this.tipo_traslado = tipo_traslado;
    }

    /**
     * Método que obtiene el costokm.
     * @return regresa el costo
     */
    public float getCostoKM() {
        return costoKM;
    }

    /**
     * Método que ingresa el costokm.
     * @param costoKM parámetro del costokm
     */
    public void setCostoKM(float costoKM) {
        this.costoKM = costoKM;
    }

    /**
     * Método que obtiene el email.
     * @return regresa email
     */
    public String getEmail() {
        return email;
    }

    /**
     * Método que ingresa el email.
     * @param email parámetro email
     */
    public void setEmail(String email) {
        this.email = email;
    }
}
