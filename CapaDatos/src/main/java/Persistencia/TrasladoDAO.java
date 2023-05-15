/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Persistencia;

import Dominio.Traslado;
import com.mongodb.client.MongoCollection;
import com.mongodb.client.MongoCursor;
import com.mongodb.client.MongoDatabase;
import java.util.ArrayList;

/**
 *
 * @author oscar
 */
public class TrasladoDAO extends BaseDAO<Traslado>{

    @Override
    public void guardar(Traslado entidad) {
        MongoCollection<Traslado> traslado= this.getCollection();
       traslado.insertOne(entidad);
    }

    @Override
    public ArrayList<Traslado> buscarTodos() {
         MongoCollection<Traslado> coleccionT = this.getCollection();
        MongoCursor<Traslado> resultadoConsulta = coleccionT.find().iterator();
        ArrayList<Traslado> listaT = new ArrayList<>();
        while (resultadoConsulta.hasNext()) {
            listaT.add(resultadoConsulta.next());
        }
        return listaT;
    }

    @Override
    public MongoCollection<Traslado> getCollection() {
        MongoDatabase db= Conexion.getInstance();
        MongoCollection<Traslado> colleccionResiduos = db.getCollection("traslado", Traslado.class);
        return colleccionResiduos;
    }
    
}
