package Modelo.ConexionBd;

import Modelo.Entidades.ActualizaEntidadBd;
import Modelo.Entidades.Producto;
import Modelo.Excepcion.EntidadNoExisteException;
import Modelo.Excepcion.EntidadYaExisteException;
import java.util.List;
import javax.persistence.EntityManager;
import javax.persistence.TypedQuery;

public class ProductoBd {

    private EntityManager em;
    private Producto entidad;

    public ProductoBd(EntityManager eManager, Producto producto) {
        em = eManager;
        entidad = producto;
    }

    public void incluirProducto(Producto producto)
            throws EntidadYaExisteException {
        ActualizaEntidadBd.insertarRegistro(em, producto);
    }

    public void eliminarProducto(Producto producto)
            throws EntidadYaExisteException, EntidadNoExisteException {
        ActualizaEntidadBd.eliminarRegistro(em, entidad,
                producto.getIdProducto());
    }

    public List<Producto> consultarProductos() {
        TypedQuery<Producto> listaDeProductos = em.createNamedQuery("Producto.findAll", Producto.class);
        List<Producto> lista = listaDeProductos.getResultList();
        return lista;
    }

    public List<Producto> consultarUnProducto(Producto producto) {
        TypedQuery<Producto> resultado = em.createNamedQuery("Producto.findByIdProducto", Producto.class);
        resultado.setParameter("idProducto", producto.getIdProducto());
        List<Producto> lista = resultado.getResultList();
        return lista;
    }

    public List<Producto> consultarUnProductoPorNombre(Producto producto) {
        TypedQuery<Producto> resultado = em.createNamedQuery("Producto.findByNombreProducto", Producto.class);
        resultado.setParameter("nombreProducto", producto.getNombreProducto());
        List<Producto> lista = resultado.getResultList();
        return lista;
    }
}
