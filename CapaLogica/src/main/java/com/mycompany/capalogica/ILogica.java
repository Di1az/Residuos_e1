/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package com.mycompany.capalogica;

import Dominio.Productor;
import Dominio.Residuo;
import Dominio.Traslado;
import java.util.List;

/**
 *
 * @author oscar
 */
public interface ILogica {
    public void guardarTraslado(Traslado traslado);
    public void registrarInformacion();
    public void guardarProductor(Productor productor);
    
    
}
