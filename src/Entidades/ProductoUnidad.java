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
@Table(name = "ProductoUnidad")
@NamedQueries({
    @NamedQuery(name = "ProductoUnidad.findAll", query = "SELECT p FROM ProductoUnidad p"),
    @NamedQuery(name = "ProductoUnidad.findByProducto", query = "SELECT p FROM ProductoUnidad p WHERE p.producto = :producto"),
    @NamedQuery(name = "ProductoUnidad.findByUm", query = "SELECT p FROM ProductoUnidad p WHERE p.um = :um"),
    @NamedQuery(name = "ProductoUnidad.findByIdUnidadDeMedida", query = "SELECT p FROM ProductoUnidad p WHERE p.idUnidadDeMedida = :idUnidadDeMedida"),
    @NamedQuery(name = "ProductoUnidad.findByIdProducto", query = "SELECT p FROM ProductoUnidad p WHERE p.idProducto = :idProducto")})
public class ProductoUnidad implements Serializable {

    private static final long serialVersionUID = 1L;
    @Basic(optional = false)
    @Column(name = "Producto")
    private String producto;
    @Column(name = "UM")
    private String um;
    @Basic(optional = false)
    @Column(name = "idUnidadDeMedida")
    private int idUnidadDeMedida;
    @Basic(optional = false)
    @Column(name = "idProducto")
    @Id
    private int idProducto;

    public ProductoUnidad() {
    }

    public String getProducto() {
        return producto;
    }

    public void setProducto(String producto) {
        this.producto = producto;
    }

    public String getUm() {
        return um;
    }

    public void setUm(String um) {
        this.um = um;
    }

    public int getIdUnidadDeMedida() {
        return idUnidadDeMedida;
    }

    public void setIdUnidadDeMedida(int idUnidadDeMedida) {
        this.idUnidadDeMedida = idUnidadDeMedida;
    }

    public int getIdProducto() {
        return idProducto;
    }

    public void setIdProducto(int idProducto) {
        this.idProducto = idProducto;
    }

}
