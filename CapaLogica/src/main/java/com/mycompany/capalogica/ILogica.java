/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package com.mycompany.capalogica;

import Dominio.Empresa_transportista;
import Dominio.Productor;
import Dominio.Residuo;
import Dominio.Traslado;
import com.mongodb.client.MongoCollection;
import java.util.List;

/**
 *
 * @author oscar
 */
public interface ILogica {
    //Método registrar Información
    public void registrarInformacion();
    //Método de guardarProductor.
    public void guardarProductor(Productor productor);
    //Método de verificarProductor
    public Productor verificarProductor(String nombre, int numero);
    //Método de lista transportista que busca todos
    public List<Empresa_transportista> buscarTodos();

}
