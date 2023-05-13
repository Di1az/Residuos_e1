/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Logica;


import Dominio.Productor;
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
public class ProductorDAO extends BaseDAO<Productor>{
    
    
    @Override
    public void guardar(Productor entidad) {
       MongoCollection<Productor> productor= this.getCollection();
       productor.insertOne(entidad);
    }

    @Override
    public void eliminar(Productor entidad) throws DAOException {
         MongoCollection<Productor> coleccionP = this.getCollection();
        // primera forma de hacerlo como lo habiamos visto
        //Document filtroEliminacion = new Document("_id", entidad.getId());
        //coleccionP.deleteOne(filtroEliminacion);
        //Si lo hacemos directo con los filters:
        coleccionP.deleteOne(Filters.eq("_id", entidad.getId()));
    }

    @Override
    public void actualizar(Productor entidad) throws DAOException {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public Productor buscarPorID(ObjectId id) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public ArrayList<Productor> buscarTodos() {
        MongoCollection<Productor> coleccionP = this.getCollection();
        MongoCursor<Productor> resultadoConsulta = coleccionP.find().iterator();
        ArrayList<Productor> listaP = new ArrayList<>();
        while (resultadoConsulta.hasNext()) {
            listaP.add(resultadoConsulta.next());
        }
        return listaP;
    }

   @Override
    public MongoCollection<Productor> getCollection() {
        MongoDatabase db = this.getMongoDB("residuosBD");
        MongoCollection<Productor> colleccionProductor = db.getCollection("productor", Productor.class);
        return colleccionProductor;
    }
    
}
