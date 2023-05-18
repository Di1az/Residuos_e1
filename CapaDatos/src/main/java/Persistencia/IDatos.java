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
import com.mongodb.client.MongoCollection;
import java.util.List;

/**
 *
 * @author oscar
 */
public interface IDatos {
    /**
     * Método guardar producto.
     * @param producto parametro producto
     */
    public void guardarProducto(Producto producto);
    /**
     * Método lista producto.
     * @return regresa una lista de productos
     */
    public List<Producto> listaProducto();
    
    /**
     * Método guardar empresa.
     * @param empresa_transportista parámetro empresa transportista
     */
    public void guardarEmpresa(Empresa_transportista empresa_transportista);
    /**
     * Método lista empresa.
     * @return regresa una lista de empresas
     */
    public List<Empresa_transportista> listaEmpresas();
    
    /**
     * Método guardar productor.
     * @param productor parámetro productor
     */
    public void guardarProductor(Productor productor);
    /**
     * Método lista productor.
     * @return regresa una lista de productores
     */
    public List<Productor> listaProductor();
    
    /**
     * Método guardar residuo.
     * @param residuo parámetro residuo
     */
    public void guardarResiduo(Residuo residuo);
    /**
     * Método lista residuo.
     * @return regresa una lista de residuo
     */
    public List<Residuo> listaResiduo();
    
    /**
     * Método guardar traslado.
     * @param traslado parámetro traslado
     */
    public void guardarTraslado(Traslado traslado);
    /**
     * Método lista traslado.
     * @return regresa una lista de traslado
     */
    public List<Traslado> listaTraslado();
    
    /**
     * Método verificar productor.
     * @param nombre parámetro nombre
     * @param numero parámetro número
     * @return regresa un booleano de verdadero o falso
     */
    public boolean verificarProductorNombreId(String nombre, int numero);
    
    
    
    
}
