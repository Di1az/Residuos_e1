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
    
    private ObjectId id;
    private String nombreEmpresa;
    private String nombreEncargado;
    private int numeroIdentificador;
    
    public Productor(){
        
    }

    public Productor(ObjectId id, String nombreEmpresa, String nombreEncargado, int numeroIdentificador) {
        this.id = id;
        this.nombreEmpresa = nombreEmpresa;
        this.nombreEncargado = nombreEncargado;
        this.numeroIdentificador = numeroIdentificador;
    }

    public Productor(String nombreEmpresa, String nombreEncargado, int numeroIdentificador) {
        this.nombreEmpresa = nombreEmpresa;
        this.nombreEncargado = nombreEncargado;
        this.numeroIdentificador = numeroIdentificador;
    }
    

    public ObjectId getId() {
        return id;
    }

    public void setId(ObjectId id) {
        this.id = id;
    }

    public String getNombreEmpresa() {
        return nombreEmpresa;
    }

    public void setNombreEmpresa(String nombreEmpresa) {
        this.nombreEmpresa = nombreEmpresa;
    }

    public String getNombreEncargado() {
        return nombreEncargado;
    }

    public void setNombreEncargado(String nombreEncargado) {
        this.nombreEncargado = nombreEncargado;
    }

    public int getNumeroIdentificador() {
        return numeroIdentificador;
    }

    public void setNumeroIdentificador(int numeroIdentificador) {
        this.numeroIdentificador = numeroIdentificador;
    }
    
    
}
