/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Persistencia;


import Dominio.Producto;
import com.mongodb.MongoClient;
import com.mongodb.client.MongoCollection;
import com.mongodb.client.MongoCursor;
import com.mongodb.client.MongoDatabase;
import exceptions.DAOException;
import java.util.ArrayList;
import org.bson.Document;
import org.bson.types.ObjectId;




/**
 *
 * @author hoshi
 */
public class ProductoDAO extends BaseDAO<Producto>{
    
    /**
     * Guarda una entidad de tipo User en la base de datos MongoDB.
     *
     * @param entidad La entidad a guardar.
     */
    @Override
    public void guardar(Producto entidad) {
        MongoCollection<Producto> coleccionP = this.getCollection();
        coleccionP.insertOne(entidad);
    }

    /**
     * Busca todas las entidades en la base de datos MongoDB.
     *
     * @return Una lista de todas las entidades encontradas.
     */
    @Override
    public ArrayList<Producto> buscarTodos() {
        MongoCollection<Producto> coleccionP = this.getCollection();
        MongoCursor<Producto> resultadoConsulta = coleccionP.find().iterator();
        ArrayList<Producto> listaP = new ArrayList<>();
        while (resultadoConsulta.hasNext()) {
            listaP.add(resultadoConsulta.next());
        }
        return listaP;
    }

    /**
     * Coleccion de la entidad
     *
     * @return collection
     */
    @Override
    public MongoCollection<Producto> getCollection() {
        MongoDatabase db= Conexion.getInstance();
        MongoCollection<Producto> colleccionProductos = db.getCollection("producto", Producto.class);
        return colleccionProductos;
    }
    
}
