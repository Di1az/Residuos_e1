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
    //Atributo residuo
    private Residuo residuo;
    //Atributo cantidad resudios
    private int cantidad_residuos;
    //Atributo fecha_traslado
    private Date fecha_traslado;
    //Atributo kilometros
    private float kilometros;
   //Atributo destino
    private Destino destino;
    //Atributo productor
    private Productor productor;
    //Atributo detalle de traslado
    private Detalle_Traslado detalle;
    
    
    /**
     * Método constructor vacío.
     */
    public Traslado(){
        
    }

    /**
     * Método constructor que inicializa los atributos de la clase.
     * @param id parámetro id
     * @param residuo parámetro residuo
     * @param cantidad_residuos parámetro cantidad residuos
     * @param fecha_traslado parámetro fecha estimada
     * @param kilometros parámetro kilometros
     * @param destino parámetro destino
     * @param productor parámetro productor
     * @param detalle parámetro detalle
     */
    public Traslado(ObjectId id, Residuo residuo, int cantidad_residuos, Date fecha_traslado, float kilometros, Destino destino, Productor productor, Detalle_Traslado detalle) {
        this.id = id;
        this.residuo = residuo;
        this.cantidad_residuos = cantidad_residuos;
        this.fecha_traslado = fecha_traslado;
        this.kilometros = kilometros;
        this.destino = destino;
        this.productor = productor;
        this.detalle = detalle;
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
     * Método que obtiene la fecha traslado.
     * @return regresa fecha traslado
     */
    public Date getFecha_traslado() {
        return fecha_traslado;
    }
    
    /**
     * Método que ingresa la fecha traslado.
     * @param fecha_traslado parámetro fecha traslado
     */
    public void setFecha_traslado(Date fecha_traslado) {
        this.fecha_traslado = fecha_traslado;
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
    
    /**
     * Método que obtiene el destino.
     * @return regresa el destino
     */
    public Destino getDestino() {
        return destino;
    }

    /**
     * Método que ingresa el destino.
     * @param destino parámetro destino
     */
    public void setDestino(Destino destino) {
        this.destino = destino;
    }

    /**
     * Método que obtiene el productor.
     * @return regresa productor
     */
    public Productor getProductor() {
        return productor;
    }

    /**
     * Método que ingresa el productor.
     * @param productor parámetro productor
     */
    public void setProductor(Productor productor) {
        this.productor = productor;
    }

    /**
     * Método que obtiene el detalle de traslado.
     * @return regresa el detalle
     */
    public Detalle_Traslado getDetalle() {
        return detalle;
    }

    /**
     * Método que ingresa el detalle de traslado.
     * @param detalle parámetro detalle
     */
    public void setDetalle(Detalle_Traslado detalle) {
        this.detalle = detalle;
    }

    /**
     * Método toString que nos da el destino como un texto
     * @return regresa destino
     */
    @Override
    public String toString() {
        return destino.toString();
    }
    
    
}
