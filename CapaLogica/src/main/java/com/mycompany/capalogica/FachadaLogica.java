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
import java.util.List;

/**
 *
 * @author oscar
 */
public class FachadaLogica implements ILogica{

    /**
     * Método que guarda traslados, creando una instancia de controltraslado
     * que llama al método de guardar traslado e ingresa un parámetro traslado.
     * @param traslado parámetro traslado
     */
    @Override
    public void guardarTraslado(Traslado traslado) {
        ControlTraslado ct= new ControlTraslado();
        ct.guardarTraslado(traslado);
    }
    
    /**
     * Método que guarda productores, creando una instancia de controlproductor
     * que llama al método de guardar productor e ingresa un parámetro productor.
     * @param productor parámetro productor
     */
    @Override
    public void guardarProductor(Productor productor) {
        ControlProductor cp= new ControlProductor();
        cp.guardarProductor(productor);
    }
    
    /**
     * Método que registra la información de cada empresa, en este caso
     * Ya hay algunas empresas preescritas.
     * Crea tres instancias de controlEmpresa, controlProducto y controlResiduos
     */
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

    /**
     * Método que verifica los productores si es que existen o no, con una 
     * instancia de controproductor que llama al método verificar productor de
     * la clase.
     * @param nombre parámetro nombre
     * @param numero parámetro número
     * @return regresa un booleano verdadero o falso
     */
    @Override
    public boolean verificarProductor(String nombre, int numero) {
        ControlProductor conp = new ControlProductor();
        return conp.verificarProductor(nombre, numero);
    }
    
    /**
     * Método que busca todos los datos de la empresa, crea una instancia de 
     * controlempresa y llama al método buscarTodos de la clase.
     * @return regresa una lista de empresa transportista
     */
    public List<Empresa_transportista> buscarTodos(){
         ControlEmpresa cone = new ControlEmpresa();
         return cone.buscarTodos();
    }
    
  
}
