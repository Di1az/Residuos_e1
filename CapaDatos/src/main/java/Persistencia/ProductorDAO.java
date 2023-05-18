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
import java.util.List;
import org.bson.types.ObjectId;




/**
 *
 * @author hoshi
 */
public class ProductorDAO extends BaseDAO<Productor>{
    
    /**
     * Método guardar que tiene un  parámetro productor, que conecta con la
     * base de datos y la colección e inserta al productor.
     * @param entidad parámetro entidad
     */
    @Override
    public void guardar(Productor entidad) {
       MongoCollection<Productor> productor= this.getCollection();
       productor.insertOne(entidad);
    }

    /**
     * Método que busca todos los datos de la colección de traslados y la 
     * inserta en un arraylist.
     * @return regresa una lista de productores
     */
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
    
    /**
     * Método que realiza la conexión con la base de datos y obtiene la colección
     * de la misma la cual regresa.
     * @return regresa una coleccion de productores
     */
   @Override
    public MongoCollection<Productor> getCollection() {
        MongoDatabase db= Conexion.getInstance();
        MongoCollection<Productor> colleccionProductor = db.getCollection("productor", Productor.class);
        return colleccionProductor;
    }
    
    /**
     * Método que tiene parámetros string e int, que busca todos los productores
     * que tengan el mismo nombre ingresado y el mmismo número identificador.
     * @param nombre parámetro nombre
     * @param numero parámetro  número
     * @return regresa un booleano verdadero o falso
     */
    public boolean buscarPorNombreID(String nombre, int numero) {
    Productor productor = getCollection()
        .find(and(eq("nombreEncargado", nombre), eq("numeroIdentificador", numero)))
        .first();
    return productor!=null;
}
    /**
     * Método que busca un productor por su número identificador que es el id.
     * @param numero parámetro numero
     * @return regresa una lista de productores
     */
    public List<Productor> buscarNumeroEmpresa(int numero) {
        List<Productor> productores = new ArrayList<>();

        MongoCursor<Productor> cursor = getCollection()
                .find(eq("numeroIdentificador", numero)).iterator();

        while (cursor.hasNext()) {
            Productor productor = cursor.next();
            productores.add(productor);
        }

        return productores;
    }
    
    /**
     * Método que busca un productor por el nombre de su empresa.
     * @param nombre parámetro nombre
     * @return regresa una lista de productores
     */
    public List<Productor> buscarNombreEmpresa(String nombre) {
        List<Productor> productores = new ArrayList<>();

        MongoCursor<Productor> cursor = getCollection()
                .find(eq("nombreEmpresa", nombre)).iterator();

        while (cursor.hasNext()) {
            Productor productor = cursor.next();
            productores.add(productor);
        }

        return productores;
    }

}
