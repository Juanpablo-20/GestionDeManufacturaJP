package Modelo.Entidades;

import java.io.Serializable;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;

@Entity
@Table(name = "ProductosEnMezcla")
@NamedQueries({
    @NamedQuery(name = "ProductosEnMezcla.findAll", query = "SELECT p FROM ProductosEnMezcla p"),
    @NamedQuery(name = "ProductosEnMezcla.findByIdMezcla", query = "SELECT p FROM ProductosEnMezcla p WHERE p.idMezcla = :idMezcla"),
    @NamedQuery(name = "ProductosEnMezcla.findByIdProducto", query = "SELECT p FROM ProductosEnMezcla p WHERE p.idProducto = :idProducto"),
    @NamedQuery(name = "ProductosEnMezcla.findByNombreProducto", query = "SELECT p FROM ProductosEnMezcla p WHERE p.nombreProducto = :nombreProducto")})
public class ProductosEnMezcla implements Serializable {

    private static final long serialVersionUID = 1L;
    @Basic(optional = false)
    @Column(name = "idMezcla")
    @Id
    private int idMezcla;
    @Basic(optional = false)
    @Column(name = "idProducto")
    private int idProducto;
    @Basic(optional = false)
    @Column(name = "nombreProducto")
    private String nombreProducto;

    public ProductosEnMezcla() {
    }

    public int getIdMezcla() {
        return idMezcla;
    }

    public void setIdMezcla(int idMezcla) {
        this.idMezcla = idMezcla;
    }

    public int getIdProducto() {
        return idProducto;
    }

    public void setIdProducto(int idProducto) {
        this.idProducto = idProducto;
    }

    public String getNombreProducto() {
        return nombreProducto;
    }

    public void setNombreProducto(String nombreProducto) {
        this.nombreProducto = nombreProducto;
    }

}
