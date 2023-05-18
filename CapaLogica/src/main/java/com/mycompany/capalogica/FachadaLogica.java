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
        Empresa_transportista empresa1= new Empresa_transportista("AMEX BUSINESS CLASS", "Por partes", 35.90f,"carmen.hernandez240210@potros.itson.edu.mx");
        me.guardarEmpresa(empresa1);
        Empresa_transportista empresa2= new Empresa_transportista("L'ORÉAL", "Total", 37.30f,"oscar.valenzuela233089@potros.itson.edu.mx");
        me.guardarEmpresa(empresa2);
        Empresa_transportista empresa3= new Empresa_transportista("Lujo Descalzo", "Por partes", 33.20f,"daniel.almada233121@potros.itson.edu.mx");
        me.guardarEmpresa(empresa3);
        Empresa_transportista empresa4= new Empresa_transportista("Microsoft", "Total", 40.70f,"michell.cedano233230@potros.itson.edu.mx");
        me.guardarEmpresa(empresa4);
        Empresa_transportista empresa5= new Empresa_transportista("UKG", "Total", 29.45f,"adrian.macias@itson.edu.mx");
        me.guardarEmpresa(empresa5);
        
        Residuo residuo1= new Residuo(1, "Amoniaco", "gas incoloro con un olor característico");
        mr.guardarResiduo(residuo1);
        
        
//        Productor productor=new Productor("Unilever", "Oscar Valenzuela", 100503);
//        Residuo residuo1= new Residuo(1111, "Plomo", "Metal pesado", productor);
//        mr.guardarResiduo(residuo1);
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
    public Productor verificarProductor(String nombre, int numero) {
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

    

    /**
     * Método correoTexto que llama al mmétodo correoTexto de la clase control correo
     * y manda los parámetrod obtenidos de la solicitud traslado para enviar el 
     * correo que recibira la empresa productora.
     * @param direccion parámetro dirección
     * @param empresa parámetro empresa
     * @param km parámetro km
     * @param productor parámetro productor
     * @param residuo parámetro residuo
     * @param cantRes parámetro cantRes
     * @param fecha_estimada parámetro fecha_estimada
     * @param tipoTras parámetro tipo traslado
     * @return regresa el método correoTexto
     */
   
    
  
}
