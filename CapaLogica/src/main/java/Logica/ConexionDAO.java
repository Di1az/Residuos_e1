/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Logica;

import com.mongodb.MongoClient;
import com.mongodb.MongoClientURI;
import com.mongodb.client.MongoDatabase;

/**
 *
 * @author oscar
 */
public class ConexionDAO implements IConexionDAO{

    /**
     * Metodo que se encarga de la conexion a la base
     * de datos
     * @param connectionString
     * @param databaseName
     * @return conexion
     */
    @Override
    public MongoDatabase conexion(String connectionString, String databaseName) {
        connectionString = "mongodb://localhost:27017/Residuos";
        MongoClientURI uri = new MongoClientURI(connectionString);
        MongoClient mongoClient = new MongoClient(uri);
        return mongoClient.getDatabase(databaseName);
    }
    
}
