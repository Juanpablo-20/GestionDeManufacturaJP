package Modelo.Entidades;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Collection;
import javax.persistence.Basic;
import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(name = "Producto")
@NamedQueries({
    @NamedQuery(name = "Producto.findAll", query = "SELECT p FROM Producto p ORDER BY p.nombreProducto"),
    @NamedQuery(name = "Producto.findByIdProducto", query = "SELECT p FROM Producto p WHERE p.idProducto = :idProducto"),
    @NamedQuery(name = "Producto.findByNombreProducto", query = "SELECT p FROM Producto p WHERE p.nombreProducto = :nombreProducto"),
    @NamedQuery(name = "Producto.findByProcedimiento", query = "SELECT p FROM Producto p WHERE p.procedimiento = :procedimiento"),
    @NamedQuery(name = "Producto.findByExistenciaProducto", query = "SELECT p FROM Producto p WHERE p.existenciaProducto = :existenciaProducto")})
public class Producto implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "idProducto")
    private Integer idProducto;
    @Basic(optional = false)
    @Column(name = "nombreProducto")
    private String nombreProducto;
    @Basic(optional = false)
    @Column(name = "procedimiento")
    private String procedimiento;
    // @Max(value=?)  @Min(value=?)//if you know range of your decimal fields consider using these annotations to enforce field validation
    @Basic(optional = false)
    @Column(name = "existenciaProducto")
    private BigDecimal existenciaProducto;
    @JoinColumn(name = "idUnidadDeMedida", referencedColumnName = "idUnidadMedida")
    @ManyToOne(optional = false)
    private UnidadDeMedida idUnidadDeMedida;
    @OneToMany(cascade = CascadeType.DETACH, mappedBy = "idProducto")
    private Collection<Receta> recetaCollection;
    @OneToMany(cascade = CascadeType.DETACH, mappedBy = "idProducto")
    private Collection<MezclaDeProductos> mezclaDeProductosCollection;
    @OneToMany(cascade = CascadeType.DETACH, mappedBy = "iProductoMezcla")
    private Collection<MezclaDeProductos> mezclaDeProductosCollection1;

    public Producto() {
    }

    public Producto(Integer idProducto) {
        this.idProducto = idProducto;
    }

    public Producto(Integer idProducto, String nombreProducto, String procedimiento, BigDecimal existenciaProducto) {
        this.idProducto = idProducto;
        this.nombreProducto = nombreProducto;
        this.procedimiento = procedimiento;
        this.existenciaProducto = existenciaProducto;
    }

    public Integer getIdProducto() {
        return idProducto;
    }

    public void setIdProducto(Integer idProducto) {
        this.idProducto = idProducto;
    }

    public String getNombreProducto() {
        return nombreProducto;
    }

    public void setNombreProducto(String nombreProducto) {
        this.nombreProducto = nombreProducto;
    }

    public String getProcedimiento() {
        return procedimiento;
    }

    public void setProcedimiento(String procedimiento) {
        this.procedimiento = procedimiento;
    }

    public BigDecimal getExistenciaProducto() {
        return existenciaProducto;
    }

    public void setExistenciaProducto(BigDecimal existenciaProducto) {
        this.existenciaProducto = existenciaProducto;
    }

    public UnidadDeMedida getIdUnidadDeMedida() {
        return idUnidadDeMedida;
    }

    public void setIdUnidadDeMedida(UnidadDeMedida idUnidadDeMedida) {
        this.idUnidadDeMedida = idUnidadDeMedida;
    }

    public Collection<Receta> getRecetaCollection() {
        return recetaCollection;
    }

    public void setRecetaCollection(Collection<Receta> recetaCollection) {
        this.recetaCollection = recetaCollection;
    }

    public Collection<MezclaDeProductos> getMezclaDeProductosCollection() {
        return mezclaDeProductosCollection;
    }

    public void setMezclaDeProductosCollection(Collection<MezclaDeProductos> mezclaDeProductosCollection) {
        this.mezclaDeProductosCollection = mezclaDeProductosCollection;
    }

    public Collection<MezclaDeProductos> getMezclaDeProductosCollection1() {
        return mezclaDeProductosCollection1;
    }

    public void setMezclaDeProductosCollection1(Collection<MezclaDeProductos> mezclaDeProductosCollection1) {
        this.mezclaDeProductosCollection1 = mezclaDeProductosCollection1;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (idProducto != null ? idProducto.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Producto)) {
            return false;
        }
        Producto other = (Producto) object;
        if ((this.idProducto == null && other.idProducto != null) || (this.idProducto != null && !this.idProducto.equals(other.idProducto))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "Modelo.Entidades.Producto[ idProducto=" + idProducto + " ]";
    }

}
