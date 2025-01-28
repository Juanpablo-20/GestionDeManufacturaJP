package Modelo.ConexionBd;

import Modelo.Entidades.ActualizaEntidadBd;
import Modelo.Entidades.MezclaDeProductos;
import Modelo.Entidades.Receta;
import Modelo.Excepcion.EntidadNoExisteException;
import Modelo.Excepcion.EntidadYaExisteException;
import java.util.List;
import javax.persistence.EntityManager;
import javax.persistence.TypedQuery;

public class MezclaDeProductosBd {

    private EntityManager em;
    private MezclaDeProductos entidad;

    public MezclaDeProductosBd(EntityManager eManager,
            MezclaDeProductos mezclaDeProductos) {
        em = eManager;
        entidad = mezclaDeProductos;
    }

    public void incluirMezclaDeProductos(MezclaDeProductos mezclaDeProductos)
            throws EntidadYaExisteException {
        ActualizaEntidadBd.insertarRegistro(em, mezclaDeProductos);
    }

    public void eliminarMezclaDeProductos(MezclaDeProductos mezclaDeProductos)
            throws EntidadYaExisteException, EntidadNoExisteException {
        ActualizaEntidadBd.eliminarRegistro(em, entidad,
                mezclaDeProductos.getIdMezcla());
    }

    public List<MezclaDeProductos> consultarMezcla() {
        TypedQuery<MezclaDeProductos> listaDeMezclas = em.createNamedQuery("MezclaDeProductos.findAll", MezclaDeProductos.class);
        List<MezclaDeProductos> lista = listaDeMezclas.getResultList();
        return lista;
    }

    public List<MezclaDeProductos> consultarUnaMezcla(MezclaDeProductos mezclaDeProductos) {
        TypedQuery<MezclaDeProductos> resultado = em.createNamedQuery("MezclaDeProductos.findByIdMezcla", MezclaDeProductos.class);
        resultado.setParameter("idProdIngrediente", mezclaDeProductos.getIdMezcla());
        List<MezclaDeProductos> lista = resultado.getResultList();
        return lista;
    }

    public List<MezclaDeProductos> consultarUnaMezclaPorIds(MezclaDeProductos mezclaDeProductos) {
        TypedQuery<MezclaDeProductos> resultado = em.createNamedQuery("MezclaDeProductos.findByIdMezclaPorIds", MezclaDeProductos.class);
        resultado.setParameter("idProducto",
                mezclaDeProductos.getIdProducto());
        resultado.setParameter("iProductoMezcla",
                mezclaDeProductos.getIProductoMezcla());
        List<MezclaDeProductos> lista = resultado.getResultList();
        return lista;
    }
}
