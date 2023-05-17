/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Persistencia;

import Dominio.Residuo;
import com.mongodb.client.MongoCollection;
import com.mongodb.client.MongoCursor;
import com.mongodb.client.MongoDatabase;
import com.mongodb.client.model.Filters;
import exceptions.DAOException;
import java.util.ArrayList;
import org.bson.types.ObjectId;




/**
 *
 * @author hoshi
 */
public class ResiduosDAO extends BaseDAO<Residuo>{

    /**
     * Método guardar residuo.
     * @param entidad parámetro entidad
     */
    @Override
    public void guardar(Residuo entidad) {
       MongoCollection<Residuo> residuo= this.getCollection();
       residuo.insertOne(entidad);
    }

   
    /**
     * Método que busca todos los residuos de la colección.
     * @return regresa una lista de residuos.
     */
    @Override
    public ArrayList<Residuo> buscarTodos() {
        MongoCollection<Residuo> coleccionR = this.getCollection();
        MongoCursor<Residuo> resultadoConsulta = coleccionR.find().iterator();
        ArrayList<Residuo> listaR = new ArrayList<>();
        while (resultadoConsulta.hasNext()) {
            listaR.add(resultadoConsulta.next());
        }
        return listaR;
    }

    /**
     * Método que crea la colección y conecta la misma con la base de datos.
     * @return regresa una colleccion de residuos
     */
    @Override
    public MongoCollection<Residuo> getCollection() {
         MongoDatabase db= Conexion.getInstance();
        MongoCollection<Residuo> colleccionResiduos = db.getCollection("residuo", Residuo.class);
        return colleccionResiduos;
    }
    
}
