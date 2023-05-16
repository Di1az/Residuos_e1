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
public class Productor {
    
    //Atributo id
    private ObjectId id;
    //Atributo nombreEmpresa
    private String nombreEmpresa;
    //Atributo nombreEncargado
    private String nombreEncargado;
    //Atributo numeroIdentificador
    private int numeroIdentificador;
    
    /**
     * Constructor vacío.
     */
    public Productor(){
        
    }

    /**
     * Método constructor vacío que inicializa los atributos de la clase.
     * @param id parámetro id
     * @param nombreEmpresa parámetro nombreEmpresa
     * @param nombreEncargado parámetro nombreEncargado
     * @param numeroIdentificador parámetro numeroIdentificador
     */
    public Productor(ObjectId id, String nombreEmpresa, String nombreEncargado, int numeroIdentificador) {
        this.id = id;
        this.nombreEmpresa = nombreEmpresa;
        this.nombreEncargado = nombreEncargado;
        this.numeroIdentificador = numeroIdentificador;
    }

    /**
     * Método constructor que inicializa los atributos de la clase menos el id.
     * @param nombreEmpresa parámetro nombreEmpresa
     * @param nombreEncargado parámetro nombreEncargado
     * @param numeroIdentificador parámetro numeroIdentificador
     */
    public Productor(String nombreEmpresa, String nombreEncargado, int numeroIdentificador) {
        this.nombreEmpresa = nombreEmpresa;
        this.nombreEncargado = nombreEncargado;
        this.numeroIdentificador = numeroIdentificador;
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
     * Método que obtiene el nombre de la empresa.
     * @return regresa nombreEmpresa
     */
    public String getNombreEmpresa() {
        return nombreEmpresa;
    }

    /**
     * Método que ingresa el nombre de la empresa.
     * @param nombreEmpresa parámetro nombreEmpresa
     */
    public void setNombreEmpresa(String nombreEmpresa) {
        this.nombreEmpresa = nombreEmpresa;
    }

    /**
     * Método que obtiene el nombre del encargado.
     * @return regresa nombreEncargado
     */
    public String getNombreEncargado() {
        return nombreEncargado;
    }

    /**
     * Método que ingresa el nombre del encargado.
     * @param nombreEncargado parámetro nombreEncargado
     */
    public void setNombreEncargado(String nombreEncargado) {
        this.nombreEncargado = nombreEncargado;
    }

    /**
     * Método que obtiene el número identificador.
     * @return regresa numeroIdentificador
     */
    public int getNumeroIdentificador() {
        return numeroIdentificador;
    }

    /**
     * Método que ingresa el número identificador.
     * @param numeroIdentificador parámetro numeroIdentificador
     */
    public void setNumeroIdentificador(int numeroIdentificador) {
        this.numeroIdentificador = numeroIdentificador;
    }
    
    
}
