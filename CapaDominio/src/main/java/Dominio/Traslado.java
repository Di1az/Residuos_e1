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
public class Traslado {
    //Atributo id
    private ObjectId id;
    //Atributo codigoVehiculo
    private String codigoVehiculo;
    //Atributo residuo
    private Residuo residuo;
    //Atributo coste
    private int coste;
    //Atributo numeroVehiculo
    private int numeroVehiculo;
    //Atributo producto
    private Producto producto;
    //Atributo cantidad resudios
    private int cantidad_residuos;
    //Atributo fecha_estimada
    private Date fecha_estimada;
    //Atributo lote
    private int lote;
    //Atributo kilometros
    private float kilometros;
    
    /**
     * Método constructor vacío.
     */
    public Traslado(){
        
    }

    /**
     * Método constructor que inicializa los atributos de la clase.
     * @param id parámetro id
     * @param codigoVehiculo parámetro codigo vehiculo
     * @param residuo parámetro residuo
     * @param coste  parámetro coste
     * @param numeroVehiculo parámetro numeroVehiculo
     * @param producto parámetro producto
     * @param cantidad_residuos parámetro cantidad residuos
     * @param fecha_estimada parámetro fecha estimada
     * @param lote parámetro lote
     * @param kilometros parámetro kilometros
     */
    public Traslado(ObjectId id, String codigoVehiculo, Residuo residuo, int coste, int numeroVehiculo, Producto producto, int cantidad_residuos, Date fecha_estimada, int lote, float kilometros) {
        this.id = id;
        this.codigoVehiculo = codigoVehiculo;
        this.residuo = residuo;
        this.coste = coste;
        this.numeroVehiculo = numeroVehiculo;
        this.producto = producto;
        this.cantidad_residuos = cantidad_residuos;
        this.fecha_estimada = fecha_estimada;
        this.lote = lote;
        this.kilometros = kilometros;
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
     * Método que obtiene el código de vehiculo.
     * @return regresa codigovehiculo
     */
    public String getCodigoVehiculo() {
        return codigoVehiculo;
    }

    /**
     * Método que ingresa el código de vehiculo
     * @param codigoVehiculo parámetro codigo vehiculo
     */
    public void setCodigoVehiculo(String codigoVehiculo) {
        this.codigoVehiculo = codigoVehiculo;
    }

    /**
     * Método que obtiene el residuo.
     * @return regresa residuo.
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
    
    /**
     * Método que obtiene coste.
     * @return regresa el coste
     */
    public int getCoste() {
        return coste;
    }

    /**
     * Método que ingresa el coste.
     * @param coste parámetro coste
     */
    public void setCoste(int coste) {
        this.coste = coste;
    }

    /**
     * Método que obtiene el número de vehiculos.
     * @return regresa numero de vehiculos
     */
    public int getNumeroVehiculo() {
        return numeroVehiculo;
    }

    /**
     * Método que ingresa el número de vehiculos.
     * @param numeroVehiculo parámetro numero de vehiculo
     */
    public void setNumeroVehiculo(int numeroVehiculo) {
        this.numeroVehiculo = numeroVehiculo;
    }

    /**
     * Métoso que obtiene el producto.
     * @return regresa producto
     */
    public Producto getProducto() {
        return producto;
    }

    /**
     * Método que ingresa el producto.
     * @param producto parámetro producto.
     */
    public void setProducto(Producto producto) {
        this.producto = producto;
    }

    /**
     * Método que obtiene la cantidad de resudios.
     * @return regresa cantidad residuos
     */
    public int getCantidad_residuos() {
        return cantidad_residuos;
    }

    /**
     * Método que setea la cantidad de residuos.
     * @param cantidad_residuos parámetro cantidad de residuos.
     */
    public void setCantidad_residuos(int cantidad_residuos) {
        this.cantidad_residuos = cantidad_residuos;
    }

    /**
     * Método que obtiene la fecha estimada.
     * @return regresa fecha estimada
     */
    public Date getFecha_estimada() {
        return fecha_estimada;
    }
    
    /**
     * Método que ingresa la fecha estimada.
     * @param fecha_estimada parámetro fecha estimada
     */
    public void setFecha_estimada(Date fecha_estimada) {
        this.fecha_estimada = fecha_estimada;
    }

    /**
     * Método que obtiene el lote.
     * @return regresa lote.
     */
    public int getLote() {
        return lote;
    }

    /**
     * Método que ingresa el lote.
     * @param lote parámetro lote
     */
    public void setLote(int lote) {
        this.lote = lote;
    }

    /**
     * Método que obtiene los kilometros.
     * @return regresa kilometros
     */
    public float getKilometros() {
        return kilometros;
    }

    /**
     * Método que ingresa los kilometros.
     * @param kilometros parámetro kilometros.
     */
    public void setKilometros(float kilometros) {
        this.kilometros = kilometros;
    }
    
    
}
