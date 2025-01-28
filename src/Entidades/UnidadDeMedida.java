package Modelo.Entidades;

import java.io.Serializable;
import java.util.Collection;
import javax.persistence.Basic;
import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(name = "UnidadDeMedida")
@NamedQueries({
    @NamedQuery(name = "UnidadDeMedida.findAll", query = "SELECT u FROM UnidadDeMedida u ORDER BY u.descripcionUnidad"),
    @NamedQuery(name = "UnidadDeMedida.findByIdUnidadMedida", query = "SELECT u FROM UnidadDeMedida u WHERE u.idUnidadMedida = :idUnidadMedida"),
    @NamedQuery(name = "UnidadDeMedida.findByDescripcionUnidad", query = "SELECT u FROM UnidadDeMedida u WHERE u.descripcionUnidad = :descripcionUnidad")})
public class UnidadDeMedida implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "idUnidadMedida")
    private Integer idUnidadMedida;
    @Basic(optional = false)
    @Column(name = "descripcionUnidad")
    private String descripcionUnidad;
    @OneToMany(cascade = CascadeType.DETACH, mappedBy = "idUnidadDeMedida")
    private Collection<Producto> productoCollection;
    @OneToMany(cascade = CascadeType.DETACH, mappedBy = "idUnidadMedida")
    private Collection<Ingrediente> ingredienteCollection;

    public UnidadDeMedida() {
    }

    public UnidadDeMedida(Integer idUnidadMedida) {
        this.idUnidadMedida = idUnidadMedida;
    }

    public UnidadDeMedida(Integer idUnidadMedida, String descripcionUnidad) {
        this.idUnidadMedida = idUnidadMedida;
        this.descripcionUnidad = descripcionUnidad;
    }

    public Integer getIdUnidadMedida() {
        return idUnidadMedida;
    }

    public void setIdUnidadMedida(Integer idUnidadMedida) {
        this.idUnidadMedida = idUnidadMedida;
    }

    public String getDescripcionUnidad() {
        return descripcionUnidad;
    }

    public void setDescripcionUnidad(String descripcionUnidad) {
        this.descripcionUnidad = descripcionUnidad;
    }

    public Collection<Producto> getProductoCollection() {
        return productoCollection;
    }

    public void setProductoCollection(Collection<Producto> productoCollection) {
        this.productoCollection = productoCollection;
    }

    public Collection<Ingrediente> getIngredienteCollection() {
        return ingredienteCollection;
    }

    public void setIngredienteCollection(Collection<Ingrediente> ingredienteCollection) {
        this.ingredienteCollection = ingredienteCollection;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (idUnidadMedida != null ? idUnidadMedida.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof UnidadDeMedida)) {
            return false;
        }
        UnidadDeMedida other = (UnidadDeMedida) object;
        if ((this.idUnidadMedida == null && other.idUnidadMedida != null) || (this.idUnidadMedida != null && !this.idUnidadMedida.equals(other.idUnidadMedida))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "Modelo.Entidades.UnidadDeMedida[ idUnidadMedida=" + idUnidadMedida + " ]";
    }

}
