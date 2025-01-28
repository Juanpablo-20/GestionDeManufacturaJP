package Modelo.ConexionBd;

import Modelo.Entidades.ActualizaEntidadBd;
import Modelo.Entidades.Ingrediente;
import Modelo.Excepcion.EntidadNoExisteException;
import Modelo.Excepcion.EntidadYaExisteException;
import java.util.List;
import javax.persistence.EntityManager;
import javax.persistence.TypedQuery;

public class IngredienteBd {

    private EntityManager em;
    private Ingrediente entidad;

    public IngredienteBd(EntityManager eManager, Ingrediente ingrediente) {
        em = eManager;
        entidad = ingrediente;
    }

    public void incluirIngrediente(Ingrediente ingrediente)
            throws EntidadYaExisteException {
        ActualizaEntidadBd.insertarRegistro(em, ingrediente);
    }

    public void eliminarIngrediente(Ingrediente ingrediente)
            throws EntidadYaExisteException, EntidadNoExisteException {
        ActualizaEntidadBd.eliminarRegistro(em, entidad,
                ingrediente.getIdIngrediente());
    }

    public List<Ingrediente> consultarIngredientes() {
        TypedQuery<Ingrediente> listaDeIngredientes = em.createNamedQuery("Ingrediente.findAll", Ingrediente.class);
        List<Ingrediente> lista = listaDeIngredientes.getResultList();
        return lista;
    }

    public List<Ingrediente> consultarUnIngrediente(Ingrediente ingrediente) {
        TypedQuery<Ingrediente> resultado = em.createNamedQuery("Ingrediente.findByIdIngrediente", Ingrediente.class);
        resultado.setParameter("idIngrediente", ingrediente.getIdIngrediente());
        List<Ingrediente> lista = resultado.getResultList();
        return lista;
    }

    public List<Ingrediente> consultarUnIngredientePorNombre(Ingrediente ingrediente) {
        TypedQuery<Ingrediente> resultado = em.createNamedQuery("Ingrediente.findByNombreIngrediente", Ingrediente.class);
        resultado.setParameter("nombreIngrediente",
                ingrediente.getNombreIngrediente());
        List<Ingrediente> lista = resultado.getResultList();
        return lista;
    }
}
