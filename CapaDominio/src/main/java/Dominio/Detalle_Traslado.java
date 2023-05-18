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
public class Detalle_Traslado {
    //Atributo de clase id
    private ObjectId id;
    //Atributo de clase numeroVehiculos
    private int numeroVehiculos;
    //Atributo de clase totalProductos
    private int totalProductos;
    //Atributo de Transporte transporte
    private Transporte transporte;
    //Atributo Empresa transportista transportista
    private Empresa_transportista empresa;
    
    /**
     * Método constructor vacío de la clase.
     */
    public Detalle_Traslado(){
        
    }

    /**
     * Método constructor que inicializa los atributos.
     * @param id parámetro id
     * @param numeroVehiculos párametro numeroVehiculos
     * @param totalProductos párametro totalProductos
     * @param transporte parámetros transporte
     * @param empresa parámetro empresa
     */
    public Detalle_Traslado(ObjectId id, int numeroVehiculos, int totalProductos, Transporte transporte, Empresa_transportista empresa) {
        this.id = id;
        this.numeroVehiculos = numeroVehiculos;
        this.totalProductos = totalProductos;
        this.transporte = transporte;
        this.empresa = empresa;
    }

    /**
     * Método que obtiene el id.
     * @return regresa id
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
     * Método que obtiene el número de vehiculos
     * @return regresa numeroVehiculos
     */
    public int getNumeroVehiculos() {
        return numeroVehiculos;
    }

    /**
     * Método que ingresa el número de vehiculos
     * @param numeroVehiculos párametro de numero de Vehiculos
     */
    public void setNumeroVehiculos(int numeroVehiculos) {
        this.numeroVehiculos = numeroVehiculos;
    }

    /**
     * Método que obtiene el número total de productos.
     * @return regresa el número total de productos.
     */
    public int getTotalProductos() {
        return totalProductos;
    }

    /**
     * Método que ingresa el número total de productos.
     * @param totalProductos párametro del número total de productos
     */
    public void setTotalProductos(int totalProductos) {
        this.totalProductos = totalProductos;
    }

    /**
     * Método que obtiene el transporte.
     * @return regresa un transporte
     */
    public Transporte getTransporte() {
        return transporte;
    }

    /**
     * Método que ingresa el transporte.
     * @param transporte parámetro transporte
     */
    public void setTransporte(Transporte transporte) {
        this.transporte = transporte;
    }

    /**
     * Método que obtiene la empresa.
     * @return regresa empresa
     */
    public Empresa_transportista getEmpresa() {
        return empresa;
    }

    /**
     * Método que ingresa la empresa.
     * @param empresa parámetro empresa
     */
    public void setEmpresa(Empresa_transportista empresa) {
        this.empresa = empresa;
    }
    
    
    
}
