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
    private IDatos datos;
    public void guardarEmpresa(Empresa_transportista empresa){
       datos = new FachadaDatos();
       datos.guardarEmpresa(empresa);
    }
    public List<Empresa_transportista> buscarTodos(){
         datos = new FachadaDatos();
         return datos.listaEmpresas();
    }
}
