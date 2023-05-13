/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package Logica;

import com.mongodb.client.MongoDatabase;

/**
 *
 * @author oscar
 */
public interface IConexionDAO {
    /**
     * Metodo que se encarga de la conexion a la base
     * de datos
     * @param connectionString
     * @param databaseName
     * @return conexion
     */
    MongoDatabase conexion(String connectionString, String databaseName);

}
