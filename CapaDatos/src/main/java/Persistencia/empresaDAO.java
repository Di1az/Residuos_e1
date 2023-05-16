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

    @Override
    public void guardar(Empresa_transportista entidad) {
       MongoCollection<Empresa_transportista> empresa= this.getCollection();
       empresa.insertOne(entidad);
    }

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

    @Override
    public MongoCollection<Empresa_transportista> getCollection() {
         MongoDatabase db= Conexion.getInstance();
        MongoCollection<Empresa_transportista> empresa = db.getCollection("empresa_transportista", Empresa_transportista.class);
        return empresa;
    }
    
    public ArrayList<Empresa_transportista> buscarTipoTraslado() {
        MongoCollection<Empresa_transportista> coleccionE = this.getCollection();
        MongoCursor<Empresa_transportista> coleccionEm = coleccionE.find().iterator();
        ArrayList<Empresa_transportista> listaE = new ArrayList<>();
        while (coleccionEm.hasNext()) {
            listaE.add(coleccionEm.next());
        }
        return listaE;
    }
    
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
