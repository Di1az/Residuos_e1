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
    //Método guardarTraslado
    public void guardarTraslado(Traslado traslado);
    //Método registrar Información
    public void registrarInformacion();
    //Método de guardarProductor.
    public void guardarProductor(Productor productor);
    //Método de verificarProductor
    public Productor verificarProductor(String nombre, int numero);
    //Método de lista transportista que busca todos
    public List<Empresa_transportista> buscarTodos();
    //Método de lista traslado que busca todos
    public List<Traslado> buscarTodosT();
    //Método para setear el correo del productor
    public String correoTexto(String direccion, String empresa, String km, String productor, String residuo, String cantRes, String fecha_estimada, String tipoTras);
    //Método para enviar correo
    public void correoEnvio(String receptor, String traslado);
}
