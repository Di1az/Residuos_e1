/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Persistencia;

import Dominio.Empresa_transportista;
import Dominio.Producto;
import Dominio.Productor;
import Dominio.Residuo;
import Dominio.Traslado;
import com.mongodb.client.MongoCollection;
import com.mongodb.client.MongoDatabase;
import static com.mongodb.client.model.Filters.eq;
import java.util.List;

/**
 *
 * @author oscar
 */
public class FachadaDatos implements IDatos {

    /**
     * 
     * @param producto parámetro producto
     */
    @Override
    public void guardarProducto(Producto producto) {
        ProductoDAO productoDao = new ProductoDAO();
        productoDao.guardar(producto);
    }

    /**
     * 
     * @return regresa una lista de productos dao.
     */
    @Override
    public List<Producto> listaProducto() {
        ProductoDAO productoDao = new ProductoDAO();
        return productoDao.buscarTodos();
    }

    /**
     * 
     * @param empresa_transportista parámetro empresa transportista
     */
    @Override
    public void guardarEmpresa(Empresa_transportista empresa_transportista) {
        empresaDAO empresaDao = new empresaDAO();
        empresaDao.guardar(empresa_transportista);
    }

    /**
     * 
     * @return regresa una lista de empresas transportistas.
     */
    @Override
    public List<Empresa_transportista> listaEmpresas() {
        empresaDAO empresa = new empresaDAO();
        return empresa.buscarTodos();
    }

    /**
     * 
     * @param productor parámetro productor.
     */
    @Override
    public void guardarProductor(Productor productor) {
        ProductorDAO productorDao = new ProductorDAO();
        productorDao.guardar(productor);

    }

    /**
     * 
     * @return regresa una lista de productores dao.
     */
    @Override
    public List<Productor> listaProductor() {
        ProductorDAO productorDao = new ProductorDAO();
        return productorDao.buscarTodos();
    }

    /**
     * 
     * @param residuo parámetro residuo
     */
    @Override
    public void guardarResiduo(Residuo residuo) {
        ResiduosDAO residuosDAO = new ResiduosDAO();
        residuosDAO.guardar(residuo);
    }

    /**
     * 
     * @return regresas una lista de residuos dao
     */
    @Override
    public List<Residuo> listaResiduo() {
        ResiduosDAO residuosDAO = new ResiduosDAO();
        return residuosDAO.buscarTodos();
    }

    /**
     * 
     * @param traslado parámetro traslado
     */
    @Override
    public void guardarTraslado(Traslado traslado) {
        TrasladoDAO trasladoDAO=new TrasladoDAO();
        trasladoDAO.guardar(traslado);
    }

    /**
     * 
     * @return regresas una lista de trasladosdao
     */
    @Override
    public List<Traslado> listaTraslado() {
        TrasladoDAO trasladoDAO=new TrasladoDAO();
        return trasladoDAO.buscarTodos();
    }
    
    /**
     * 
     * @param nombre parámetro nombre
     * @param numero parámetro número
     * @return regresa un booleano verdadero o falso
     */
    @Override
    public boolean verificarProductorNombreId(String nombre, int numero) {
        ProductorDAO pdao= new ProductorDAO();
        return pdao.buscarPorNombreID(nombre, numero);
    }

    
    

    
    
}
