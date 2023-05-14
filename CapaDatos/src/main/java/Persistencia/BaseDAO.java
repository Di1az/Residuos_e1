/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package Persistencia;

import com.mongodb.MongoClient;
import com.mongodb.MongoClientOptions;
import com.mongodb.client.MongoCollection;
import com.mongodb.client.MongoDatabase;
import exceptions.DAOException;
import java.util.ArrayList;
import static org.bson.codecs.configuration.CodecRegistries.fromProviders;
import static org.bson.codecs.configuration.CodecRegistries.fromRegistries;
import org.bson.codecs.configuration.CodecRegistry;
import org.bson.codecs.pojo.PojoCodecProvider;
import org.bson.types.ObjectId;

/**
 *
 * @author tilin
 */
public abstract class BaseDAO<T> {


    /**
     * Guarda una entidad de tipo User en la base de datos MongoDB.
     *
     * @param entidad La entidad a guardar.
     */
    public abstract void guardar(T entidad);

    


    /**
     * Busca todas las entidades en la base de datos MongoDB.
     *
     * @return Una lista de todas las entidades encontradas.
     */
    public abstract ArrayList<T> buscarTodos();

    /**
     * Coleccion de la entidad
     *
     * @return collection
     */
    public abstract MongoCollection<T> getCollection();
}
