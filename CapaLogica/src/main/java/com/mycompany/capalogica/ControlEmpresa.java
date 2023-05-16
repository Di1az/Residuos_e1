/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.capalogica;

import Dominio.Empresa_transportista;
import Dominio.Producto;
import Persistencia.FachadaDatos;
import Persistencia.IDatos;
import java.util.List;

/**
 *
 * @author oscar
 */
public class ControlEmpresa {
    //Atributo Interfaz datos
    private IDatos datos;
    
    /**
     * Método que guarda la empresa transportista ingresada,
     * no regresa nada y es parte de la capa de Fachada datos.
     * @param empresa parámetro empresa
     */
    public void guardarEmpresa(Empresa_transportista empresa){
       datos = new FachadaDatos();
       datos.guardarEmpresa(empresa);
    }
    
    /**
     * Método que buscatodo lo que hay dentro de una lista de empresa 
     * transportista y es parte de la capa de Fachada datos.
     * @return regresa una lista de empresas
     */
    public List<Empresa_transportista> buscarTodos(){
         datos = new FachadaDatos();
         return datos.listaEmpresas();
    }
}
