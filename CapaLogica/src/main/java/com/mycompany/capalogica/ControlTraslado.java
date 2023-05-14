/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.capalogica;

import Dominio.Traslado;
import Persistencia.FachadaDatos;
import Persistencia.IDatos;
import java.util.List;

/**
 *
 * @author oscar
 */
public class ControlTraslado {

    private IDatos datos;

    public void guardarTraslado(Traslado traslado) {
        datos = new FachadaDatos();
        datos.guardarTraslado(traslado);
    }

    public List<Traslado> buscarTodos() {
        datos = new FachadaDatos();
        return datos.listaTraslado();
    }
}
