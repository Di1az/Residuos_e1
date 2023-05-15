/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package Persistencia;

import Dominio.Empresa_transportista;
import Dominio.Producto;
import Dominio.Productor;
import Dominio.Residuo;
import Dominio.Traslado;
import java.util.List;

/**
 *
 * @author oscar
 */
public interface IDatos {
    public void guardarProducto(Producto producto);
    public List<Producto> listaProducto();
    
    public void guardarEmpresa(Empresa_transportista empresa_transportista);
    public List<Empresa_transportista> listaEmpresas();
    
    public void guardarProductor(Productor productor);
    public List<Productor> listaProductor();
    
    public void guardarResiduo(Residuo residuo);
    public List<Residuo> listaResiduo();
    
    public void guardarTraslado(Traslado traslado);
    public List<Traslado> listaTraslado();
    
    
}
