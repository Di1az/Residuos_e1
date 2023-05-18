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
     * Método que obtiene un atributo de tipo producto y llama al método
     * guardar de la clase productoDAO e inserta el producto a la base de datos.
     * @param producto parámetro producto
     */
    @Override
    public void guardarProducto(Producto producto) {
        ProductoDAO productoDao = new ProductoDAO();
        productoDao.guardar(producto);
    }

    /**
     * Método de tipo lista Producto, que regresa una lista de productos que 
     * crea una instancia de la clase productoDAO y usa su método buscarTodos.
     * @return regresa una lista de productos dao.
     */
    @Override
    public List<Producto> listaProducto() {
        ProductoDAO productoDao = new ProductoDAO();
        return productoDao.buscarTodos();
    }

    /**
     * Método de guardar empresa, que tiene un parámetro de tipo empresa 
     * transportista y usa el método guardar de la clase empresaDAO que 
     * inserta la empresa a la base.
     * @param empresa_transportista parámetro empresa transportista
     */
    @Override
    public void guardarEmpresa(Empresa_transportista empresa_transportista) {
        empresaDAO empresaDao = new empresaDAO();
        empresaDao.guardar(empresa_transportista);
    }

    /**
     * Método de tipo lista empresa_transportista, que regresa una lista de 
     * empresas transportistas que crea una instancia de la clase empresaDAO y 
     * usa su método buscarTodos.
     * @return regresa una lista de empresas transportistas.
     */
    @Override
    public List<Empresa_transportista> listaEmpresas() {
        empresaDAO empresa = new empresaDAO();
        return empresa.buscarTodos();
    }

    /**
     * Método de guarda el productor, que tiene un parámetro de tipo productor 
     * y usa el método guardar de la clase productorDAO que inserta el productor 
     * a la base.
     * @param productor parámetro productor.
     */
    @Override
    public void guardarProductor(Productor productor) {
        ProductorDAO productorDao = new ProductorDAO();
        productorDao.guardar(productor);

    }

    /**
     * Método de tipo lista Productor, que regresa una lista de 
     * productores que crea una instancia de la clase productorDAO y 
     * usa su método buscarTodos.
     * @return regresa una lista de productores dao.
     */
    @Override
    public List<Productor> listaProductor() {
        ProductorDAO productorDao = new ProductorDAO();
        return productorDao.buscarTodos();
    }

    /**
     * Método de guarda el residuo, que tiene un parámetro de tipo residuo 
     * y usa el método guardar de la clase residuosDAO que inserta el residuo 
     * a la base.
     * @param residuo parámetro residuo
     */
    @Override
    public void guardarResiduo(Residuo residuo) {
        ResiduosDAO residuosDAO = new ResiduosDAO();
        residuosDAO.guardar(residuo);
    }

    /**
     * Método de tipo lista residuo, que regresa una lista de 
     * residuos que crea una instancia de la clase residuoDAO y 
     * usa su método buscarTodos.
     * @return regresas una lista de residuos dao
     */
    @Override
    public List<Residuo> listaResiduo() {
        ResiduosDAO residuosDAO = new ResiduosDAO();
        return residuosDAO.buscarTodos();
    }

    /**
     * Método de guarda el traslado, que tiene un parámetro de tipo traslado 
     * y usa el método guardar de la clase trasladoDAO que inserta el traslado 
     * a la base.
     * @param traslado parámetro traslado
     */
    @Override
    public void guardarTraslado(Traslado traslado) {
        TrasladoDAO trasladoDAO=new TrasladoDAO();
        trasladoDAO.guardar(traslado);
    }

    /**
     * Método de tipo lista traslado, que regresa una lista de 
     * traslados que crea una instancia de la clase trasladoDAO y 
     * usa su método buscarTodos.
     * @return regresas una lista de trasladosdao
     */
    @Override
    public List<Traslado> listaTraslado() {
        TrasladoDAO trasladoDAO=new TrasladoDAO();
        return trasladoDAO.buscarTodos();
    }
    
    /**
     * Método que recibe como parámetro un string nombre y un int número que 
     * válidan si el productor existe o no, en dado caso que sea así, regresa
     * un verdadero para decir que puede entrar.
     * @param nombre parámetro nombre
     * @param numero parámetro número
     * @return regresa un booleano verdadero o falso
     */
    @Override
    public Productor verificarProductorNombreId(String nombre, int numero) {
        ProductorDAO pdao= new ProductorDAO();
        return pdao.buscarPorNombreID(nombre, numero);
    }

    
    

    
    
}
