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
import java.util.List;

/**
 *
 * @author oscar
 */
public class FachadaDatos implements IDatos {

    @Override
    public void guardarProducto(Producto producto) {
        ProductoDAO productoDao = new ProductoDAO();
        productoDao.guardar(producto);
    }

    @Override
    public List<Producto> listaProducto() {
        ProductoDAO productoDao = new ProductoDAO();
        return productoDao.buscarTodos();
    }

    @Override
    public void guardarEmpresa(Empresa_transportista empresa_transportista) {
        empresaDAO empresaDao = new empresaDAO();
        empresaDao.guardar(empresa_transportista);
    }

    @Override
    public List<Empresa_transportista> listaEmpresas() {
        empresaDAO empresa = new empresaDAO();
        return empresa.buscarTodos();
    }

    @Override
    public void guardarProductor(Productor productor) {
        ProductorDAO productorDao = new ProductorDAO();
        productorDao.guardar(productor);

    }

    @Override
    public List<Productor> listaProductor() {
        ProductorDAO productorDao = new ProductorDAO();
        return productorDao.buscarTodos();
    }

    @Override
    public void guardarResiduo(Residuo residuo) {
        ResiduosDAO residuosDAO = new ResiduosDAO();
        residuosDAO.guardar(residuo);
    }

    @Override
    public List<Residuo> listaResiduo() {
        ResiduosDAO residuosDAO = new ResiduosDAO();
        return residuosDAO.buscarTodos();
    }

    @Override
    public void guardarTraslado(Traslado traslado) {
        TrasladoDAO trasladoDAO=new TrasladoDAO();
        trasladoDAO.guardar(traslado);
    }

    @Override
    public List<Traslado> listaTraslado() {
        TrasladoDAO trasladoDAO=new TrasladoDAO();
        return trasladoDAO.buscarTodos();
    }

}
