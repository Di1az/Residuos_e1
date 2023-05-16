/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.capalogica;

import Dominio.Empresa_transportista;
import Dominio.Producto;
import Dominio.Productor;
import Dominio.Residuo;
import Dominio.Traslado;
import Persistencia.Conexion;
import com.mongodb.client.MongoCollection;
import com.mongodb.client.MongoDatabase;
import static com.mongodb.client.model.Filters.eq;

/**
 *
 * @author oscar
 */
public class FachadaLogica implements ILogica{

    
    @Override
    public void guardarTraslado(Traslado traslado) {
        ControlTraslado ct= new ControlTraslado();
        ct.guardarTraslado(traslado);
    }
    
    @Override
    public void guardarProductor(Productor productor) {
        ControlProductor cp= new ControlProductor();
        cp.guardarProductor(productor);
    }
    

    @Override
    public void registrarInformacion() {
        ControlEmpresa me= new ControlEmpresa();
        ControlProducto mp= new ControlProducto();
        ControlResiduos mr=new ControlResiduos();
        Empresa_transportista empresa1= new Empresa_transportista("AMEX BUSINESS CLASS", "Por partes", 35.90f);
        me.guardarEmpresa(empresa1);
        Empresa_transportista empresa2= new Empresa_transportista("L'ORÉAL", "Total", 37.30f);
        me.guardarEmpresa(empresa2);
        Empresa_transportista empresa3= new Empresa_transportista("Lujo Descalzo", "Por partes", 33.20f);
        me.guardarEmpresa(empresa3);
        Empresa_transportista empresa4= new Empresa_transportista("Microsoft", "Total", 40.70f);
        me.guardarEmpresa(empresa4);
        Empresa_transportista empresa5= new Empresa_transportista("UKG", "Total", 29.45f);
        me.guardarEmpresa(empresa5);
        
        Productor productor=new Productor("Unilever", "Oscar Valenzuela", 100503);
        Residuo residuo1= new Residuo(1111, "Plomo", "Metal pesado", productor);
        mr.guardarResiduo(residuo1);
    }
    
    @Override
    public MongoCollection<Productor> obtenerColeccion() {
        MongoDatabase db = Conexion.getInstance();
        MongoCollection<Productor> coleccionContinentes = db.getCollection("Productor", Productor.class);
        return coleccionContinentes;
    }
    
    @Override
    public Productor buscarPorID(Object id) {
        Productor productor = obtenerColeccion().find(eq("_id", id)).first();
        return productor;
    }

    @Override
    public Productor buscarPorNum(Object numeroIdentificador ) {
        Productor productor = obtenerColeccion().find(eq("numeroIdentificador", numeroIdentificador)).first();
        return productor;
    }

    @Override
    public Productor buscarPorNombre(Object nombreEncargado) {
        Productor productor = obtenerColeccion().find(eq("nombreEncargado", nombreEncargado)).first();
        return productor;
    }

    
    
}
