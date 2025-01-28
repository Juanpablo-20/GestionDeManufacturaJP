package Modelo.ConexionBd;

import Modelo.Entidades.ActualizaEntidadBd;
import Modelo.Entidades.UnidadDeMedida;
import Modelo.Excepcion.EntidadNoExisteException;
import Modelo.Excepcion.EntidadYaExisteException;
import java.util.List;
import javax.persistence.EntityManager;
import javax.persistence.TypedQuery;

public class UnidadDeMedidaBd {

    private EntityManager em;
    private UnidadDeMedida entidad;

    public UnidadDeMedidaBd(EntityManager eManager,
            UnidadDeMedida unidadDeMedida) {
        em = eManager;
        entidad = unidadDeMedida;
    }

    public void incluirUnidadDeMedida(UnidadDeMedida unidadDeMedida)
            throws EntidadYaExisteException {
        ActualizaEntidadBd.insertarRegistro(em, unidadDeMedida);
    }

    public void eliminarUnidadDeMedida(UnidadDeMedida unidadDeMedida)
            throws EntidadYaExisteException, EntidadNoExisteException {
        ActualizaEntidadBd.eliminarRegistro(em, entidad,
                unidadDeMedida.getIdUnidadMedida());
    }

    public List<UnidadDeMedida> consultarUnidadesDeMedida() {
        TypedQuery<UnidadDeMedida> listaDeUnidadesDeMedida = em.createNamedQuery("UnidadDeMedida.findAll", UnidadDeMedida.class);
        List<UnidadDeMedida> lista = listaDeUnidadesDeMedida.getResultList();
        return lista;
    }

    public List<UnidadDeMedida> consultarUnaUnidadDeMedida(UnidadDeMedida unidadDeMedida) {
        TypedQuery<UnidadDeMedida> resultado = em.createNamedQuery("UnidadDeMedida.findByIdUnidadDeMedida", UnidadDeMedida.class);
        resultado.setParameter("idUnidadDeMedida",
                unidadDeMedida.getIdUnidadMedida());
        List<UnidadDeMedida> lista = resultado.getResultList();
        return lista;
    }

    public List<UnidadDeMedida> consultarUnidadDeMedidaPorNombre(UnidadDeMedida unidadDeMedida) {
        TypedQuery<UnidadDeMedida> resultado = em.createNamedQuery("UnidadDeMedida.findByDescripcionUnidad", UnidadDeMedida.class);
        resultado.setParameter("descripcionUnidad",
                unidadDeMedida.getDescripcionUnidad());
        List<UnidadDeMedida> lista = resultado.getResultList();
        return lista;
    }
}
