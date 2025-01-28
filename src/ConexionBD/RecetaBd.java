package Modelo.ConexionBd;

import Modelo.Entidades.ActualizaEntidadBd;
import Modelo.Entidades.Producto;
import Modelo.Entidades.Receta;
import Modelo.Excepcion.EntidadNoExisteException;
import Modelo.Excepcion.EntidadYaExisteException;
import java.util.List;
import javax.persistence.EntityManager;
import javax.persistence.TypedQuery;

public class RecetaBd {

    private EntityManager em;
    private Receta entidad;

    public RecetaBd(EntityManager eManager, Receta receta) {
        em = eManager;
        entidad = receta;
    }

    public void incluirReceta(Receta receta)
            throws EntidadYaExisteException {
        ActualizaEntidadBd.insertarRegistro(em, receta);
    }

    public void eliminarReceta(Receta receta)
            throws EntidadYaExisteException, EntidadNoExisteException {
        ActualizaEntidadBd.eliminarRegistro(em, entidad,
                receta.getIdProdIngrediente());
    }

    public List<Receta> consultarRecetas() {
        TypedQuery<Receta> listaDeRecetas = em.createNamedQuery("Receta.findAll", Receta.class);
        List<Receta> lista = listaDeRecetas.getResultList();
        return lista;
    }

    public List<Receta> consultarUnaReceta(Receta receta) {
        TypedQuery<Receta> resultado = em.createNamedQuery("Receta.findByIdProdIngrediente", Receta.class);
        resultado.setParameter("idProdIngrediente", receta.getIdProdIngrediente());
        List<Receta> lista = resultado.getResultList();
        return lista;
    }

    public List<Receta> consultarUnaRecetaPorIds(Receta receta) {
        TypedQuery<Receta> resultado = em.createNamedQuery("Receta.findByIds", Receta.class);
        resultado.setParameter("idIngrediente",
                receta.getIdIngrediente().getIdIngrediente());
        resultado.setParameter("idProducto",
                receta.getIdProducto().getIdProducto());
        List<Receta> lista = resultado.getResultList();
        return lista;
    }
}
