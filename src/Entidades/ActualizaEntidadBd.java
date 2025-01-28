package Modelo.Entidades;

import Modelo.Excepcion.EntidadNoExisteException;
import Modelo.Excepcion.EntidadYaExisteException;
import java.io.Serializable;
import javax.persistence.EntityManager;

public class ActualizaEntidadBd implements Serializable {

    public ActualizaEntidadBd() {
    }

    public static void insertarRegistro(EntityManager em, Object entidad)
            throws EntidadYaExisteException {
        try {
            em.getTransaction().begin();
            em.persist(entidad);
            em.getTransaction().commit();
        } catch (Exception e) {
            String mensaje = e.getMessage()
                    + "\nImposible insertar el registro. ¿Esta duplicado?"
                    + "\n!!Revise!!";
            throw (new EntidadYaExisteException(mensaje));
        }
    }

    public static void eliminarRegistro(EntityManager em, Object entidad,
            Object clave)
            throws EntidadNoExisteException {
        Class clase = entidad.getClass();
        entidad = em.find(clase, clave);
        String mensaje = "";
        if (entidad != null) {
            try {
                em.getTransaction().begin();
                em.remove(entidad);
                em.getTransaction().commit();
            } catch (Exception e) {
                throw (new EntidadNoExisteException(e.getMessage(),
                        e.getCause()));
            }
        } else {
            mensaje = "Registro con id " + clave + ", de la entidad " + clase
                    + " a elminar, no existe";
            throw (new EntidadNoExisteException(mensaje));
        }
    }
}
