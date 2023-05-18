/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Persistencia;

import Dominio.Empresa_transportista;
import Dominio.Residuo;
import com.mongodb.client.MongoCollection;
import com.mongodb.client.MongoCursor;
import com.mongodb.client.MongoDatabase;
import java.util.ArrayList;

/**
 *
 * @author oscar
 */
public class empresaDAO extends BaseDAO<Empresa_transportista>{
    
    /**
     * Método guardar que tiene un  parámetro empresa_transportista, que conecta 
     * con la base de datos y la colección e inserta la empresa_transportista.
     * @param entidad parámetro entidad
     */
    @Override
    public void guardar(Empresa_transportista entidad) {
       MongoCollection<Empresa_transportista> empresa= this.getCollection();
       empresa.insertOne(entidad);
    }

    /**
     * Método que busca todos los datos de la colección de traslados y la 
     * inserta en un arraylist.
     * @return regresa una lista de empresas
     */
    @Override
    public ArrayList<Empresa_transportista> buscarTodos() {
        MongoCollection<Empresa_transportista> coleccionE = this.getCollection();
        MongoCursor<Empresa_transportista> coleccionEm = coleccionE.find().iterator();
        ArrayList<Empresa_transportista> listaE = new ArrayList<>();
        while (coleccionEm.hasNext()) {
            listaE.add(coleccionEm.next());
        }
        return listaE;
    }

    /**
     * Método que realiza la conexión con la base de datos y obtiene la colección
     * de la misma la cual regresa.
     * @return regresa una empresaa
     */
    @Override
    public MongoCollection<Empresa_transportista> getCollection() {
         MongoDatabase db= Conexion.getInstance();
        MongoCollection<Empresa_transportista> empresa = db.getCollection("empresa_transportista", Empresa_transportista.class);
        return empresa;
    }
    
    /**
     * Método que busca el tipo de traslado de las empresas si es que es poor
     * partes o total.
     * @return regresa una lista de empresas transportistas
     */
    public ArrayList<Empresa_transportista> buscarTipoTraslado() {
        MongoCollection<Empresa_transportista> coleccionE = this.getCollection();
        MongoCursor<Empresa_transportista> coleccionEm = coleccionE.find().iterator();
        ArrayList<Empresa_transportista> listaE = new ArrayList<>();
        while (coleccionEm.hasNext()) {
            listaE.add(coleccionEm.next());
        }
        return listaE;
    }
    
    /**
     * Método que busca los costos por kilometros de una empresa transportista
     * y regresa la lista.
     * @return regresa una lista de empresas transportistas
     */
    public ArrayList<Empresa_transportista> buscarCostoKm() {
        MongoCollection<Empresa_transportista> coleccionE = this.getCollection();
        MongoCursor<Empresa_transportista> coleccionEm = coleccionE.find().iterator();
        ArrayList<Empresa_transportista> listaE = new ArrayList<>();
        while (coleccionEm.hasNext()) {
            listaE.add(coleccionEm.next());
        }
        return listaE;
    }
    
}
