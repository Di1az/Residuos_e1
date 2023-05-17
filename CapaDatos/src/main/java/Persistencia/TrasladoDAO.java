/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Persistencia;

import Dominio.Productor;
import Dominio.Traslado;
import com.mongodb.client.MongoCollection;
import com.mongodb.client.MongoCursor;
import com.mongodb.client.MongoDatabase;
import static com.mongodb.client.model.Filters.eq;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author oscar
 */
public class TrasladoDAO extends BaseDAO<Traslado>{

    /**
     * 
     * @param entidad parámetro entidad
     */
    @Override
    public void guardar(Traslado entidad) {
        MongoCollection<Traslado> traslado= this.getCollection();
       traslado.insertOne(entidad);
    }

    /**
     * 
     * @return regresa una lista de traslados
     */
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

    /**
     * 
     * @return regresa una coleccion de residuos.
     */
    @Override
    public MongoCollection<Traslado> getCollection() {
        MongoDatabase db= Conexion.getInstance();
        MongoCollection<Traslado> colleccionResiduos = db.getCollection("traslado", Traslado.class);
        return colleccionResiduos;
    }
    
//    public List<Traslado> listaTraslados(int numero){
//        Productor productor = getCollection()
//                .find(eq("numeroIdentificador", numero)).iterator();
//        
//        return productor!=null;
//    }
//    
}
