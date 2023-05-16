/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Persistencia;


import Dominio.Producto;
import Dominio.Productor;
import com.mongodb.client.MongoCollection;
import com.mongodb.client.MongoCursor;
import com.mongodb.client.MongoDatabase;
import com.mongodb.client.model.Filters;
import static com.mongodb.client.model.Filters.and;
import static com.mongodb.client.model.Filters.eq;
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
        MongoDatabase db= Conexion.getInstance();
        MongoCollection<Productor> colleccionProductor = db.getCollection("productor", Productor.class);
        return colleccionProductor;
    }
    
    public boolean buscarPorNombreID(String nombre, int numero) {
    Productor productor = getCollection()
        .find(and(eq("nombreEncargado", nombre), eq("numeroIdentificador", numero)))
        .first();
    return productor!=null;
}

    
}
