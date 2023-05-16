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
public class Residuo {
    
    //Atributo id
    private ObjectId id;
    //Atributo código
    private int codigo;
    //Atributo tipo
    private String tipo;
    //Atributo descripción
    private String descripcion;
    //Atributo productor
    private Productor productor;
    
    /**
     * Constructor vacío de la clase.
     */
    public Residuo(){
        
    }

    /**
     * Método constructor que inicializa los atributos de la clase.
     * @param id parámetro id
     * @param codigo parámetro código
     * @param tipo parámetro tipo
     * @param descripcion parámetro descripción
     * @param productor parámetro productor
     */
    public Residuo(ObjectId id, int codigo, String tipo, String descripcion, Productor productor) {
        this.id = id;
        this.codigo = codigo;
        this.tipo = tipo;
        this.descripcion = descripcion;
        this.productor = productor;
    }

    /**
     * Método constructor que inicializa los atributos de la clase menos el id.
     * @param codigo parámetro código
     * @param tipo parámetro tipo
     * @param descripcion parámetro descripción
     * @param productor parámetro productor
     */
    public Residuo(int codigo, String tipo, String descripcion, Productor productor) {
        this.codigo = codigo;
        this.tipo = tipo;
        this.descripcion = descripcion;
        this.productor = productor;
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
     * Método que obtiene el código.
     * @return regresa código
     */
    public int getCodigo() {
        return codigo;
    }

    /**
     * Método que ingresa el código.
     * @param codigo parámetro código
     */
    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    /**
     * Método que obtiene el tipo.
     * @return regresa el tipo
     */
    public String getTipo() {
        return tipo;
    }

    /**
     * Método que ingresa el tipo.
     * @param tipo regresa el tipo
     */
    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    /**
     * Método que obtiene la descripción
     * @return regresa descripción
     */
    public String getDescripcion() {
        return descripcion;
    }

    /**
     * Método que ingresa la descripción
     * @param descripcion parámetro descripción
     */
    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    /**
     * Método que obtiene el productor.
     * @return regresa productor
     */
    public Productor getProductor() {
        return productor;
    }

    /**
     * Método que ingresa el productor
     * @param productor parámetro productor
     */
    public void setProductor(Productor productor) {
        this.productor = productor;
    }
    
    
}
