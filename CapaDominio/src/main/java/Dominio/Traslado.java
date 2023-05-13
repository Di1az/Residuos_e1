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
    private ObjectId id;
    private String codigoVehiculo;
    private Residuo residuo;
    private int coste;
    private int numeroVehiculo;
    private Producto producto;
    private int cantidad_residuos;
    private Date fecha_estimada;
    private int lote;
    private float kilometros;
    
    public Traslado(){
        
    }

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

    public ObjectId getId() {
        return id;
    }

    public void setId(ObjectId id) {
        this.id = id;
    }

    public String getCodigoVehiculo() {
        return codigoVehiculo;
    }

    public void setCodigoVehiculo(String codigoVehiculo) {
        this.codigoVehiculo = codigoVehiculo;
    }

    public Residuo getResiduo() {
        return residuo;
    }

    public void setResiduo(Residuo residuo) {
        this.residuo = residuo;
    }

    public int getCoste() {
        return coste;
    }

    public void setCoste(int coste) {
        this.coste = coste;
    }

    public int getNumeroVehiculo() {
        return numeroVehiculo;
    }

    public void setNumeroVehiculo(int numeroVehiculo) {
        this.numeroVehiculo = numeroVehiculo;
    }

    public Producto getProducto() {
        return producto;
    }

    public void setProducto(Producto producto) {
        this.producto = producto;
    }

    public int getCantidad_residuos() {
        return cantidad_residuos;
    }

    public void setCantidad_residuos(int cantidad_residuos) {
        this.cantidad_residuos = cantidad_residuos;
    }

    public Date getFecha_estimada() {
        return fecha_estimada;
    }

    public void setFecha_estimada(Date fecha_estimada) {
        this.fecha_estimada = fecha_estimada;
    }

    public int getLote() {
        return lote;
    }

    public void setLote(int lote) {
        this.lote = lote;
    }

    public float getKilometros() {
        return kilometros;
    }

    public void setKilometros(float kilometros) {
        this.kilometros = kilometros;
    }
    
    
}
