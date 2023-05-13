/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Logica;

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

    
    @Override
    public void guardar(Residuo entidad) {
       MongoCollection<Residuo> residuo= this.getCollection();
       residuo.insertOne(entidad);
    }

    @Override
    public void eliminar(Residuo entidad) throws DAOException {
       MongoCollection<Residuo> coleccionP = this.getCollection();
        // primera forma de hacerlo como lo habiamos visto
        //Document filtroEliminacion = new Document("_id", entidad.getId());
        //coleccionP.deleteOne(filtroEliminacion);
        //Si lo hacemos directo con los filters:
        coleccionP.deleteOne(Filters.eq("_id", entidad.getId()));
    }

    //FALTA
    @Override
    public void actualizar(Residuo entidad) throws DAOException {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public Residuo buscarPorID(ObjectId id) {
        MongoCollection coleccion = getCollection();
        Residuo r = (Residuo) coleccion.find(Filters.eq("_id", id)).first();
        return r;
    }

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

    @Override
    public MongoCollection<Residuo> getCollection() {
        MongoDatabase db = this.getMongoDB("residuosBD");
        MongoCollection<Residuo> colleccionResiduos = db.getCollection("residuo", Residuo.class);
        return colleccionResiduos;
    }
    
}
