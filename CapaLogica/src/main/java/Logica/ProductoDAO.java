/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Logica;


import Dominio.Producto;
import com.mongodb.MongoClient;
import com.mongodb.client.MongoCollection;
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
    
    public ProductoDAO() {
        MongoClient mongoClient = new MongoClient("localhost", 27017);
        MongoDatabase database = mongoClient.getDatabase("Residuos");
        MongoCollection<Document> collection = database.getCollection("producto");
    }

    /**
     * Guarda una entidad de tipo User en la base de datos MongoDB.
     *
     * @param entidad La entidad a guardar.
     */
    @Override
    public void guardar(Producto entidad) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    /**
     * Metodo que elimina la entidad guardada
     *
     * @param entidad
     * @throws DAOException
     */
    @Override
    public void eliminar(Producto entidad) throws DAOException {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    /**
     * Actualiza una entidad en la base de datos MongoDB.
     *
     * @param entidad La entidad a actualizar.
     * @throws DAOException Si ocurre un error durante la actualización.
     */
    @Override
    public void actualizar(Producto entidad) throws DAOException {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

     /**
     * Busca una entidad en la base de datos MongoDB por su ID.
     *
     * @param id El ID de la entidad a buscar.
     * @return Entidad encontrada, o null si no se encuentra.
     */
    @Override
    public Producto buscarPorID(ObjectId id) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    /**
     * Busca todas las entidades en la base de datos MongoDB.
     *
     * @return Una lista de todas las entidades encontradas.
     */
    @Override
    public ArrayList<Producto> buscarTodos() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    /**
     * Coleccion de la entidad
     *
     * @return collection
     */
    @Override
    public MongoCollection<Producto> getCollection() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
}
