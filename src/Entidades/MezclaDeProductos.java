package Modelo.Entidades;

import java.io.Serializable;
import java.math.BigDecimal;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;

@Entity
@Table(name = "MezclaDeProductos")
@NamedQueries({
    @NamedQuery(name = "MezclaDeProductos.findAll", query = "SELECT m FROM MezclaDeProductos m"),
    @NamedQuery(name = "MezclaDeProductos.findByIdMezcla", query = "SELECT m FROM MezclaDeProductos m WHERE m.idMezcla = :idMezcla"),
    @NamedQuery(name = "MezclaDeProductos.findByIdMezclaPorIds", query = "SELECT m FROM MezclaDeProductos m WHERE m.idProducto = :idProducto and m.iProductoMezcla = :iProductoMezcla"),
    @NamedQuery(name = "MezclaDeProductos.findByCantidadUsada", query = "SELECT m FROM MezclaDeProductos m WHERE m.cantidadUsada = :cantidadUsada"),
    @NamedQuery(name = "MezclaDeProductos.findByRendimiento", query = "SELECT m FROM MezclaDeProductos m WHERE m.rendimiento = :rendimiento")})
public class MezclaDeProductos implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "idMezcla")
    private Integer idMezcla;
    // @Max(value=?)  @Min(value=?)//if you know range of your decimal fields consider using these annotations to enforce field validation
    @Basic(optional = false)
    @Column(name = "cantidadUsada")
    private BigDecimal cantidadUsada;
    @Basic(optional = false)
    @Column(name = "rendimiento")
    private BigDecimal rendimiento;
    @JoinColumn(name = "idProducto", referencedColumnName = "idProducto")
    @ManyToOne(optional = false)
    private Producto idProducto;
    @JoinColumn(name = "iProductoMezcla", referencedColumnName = "idProducto")
    @ManyToOne(optional = false)
    private Producto iProductoMezcla;

    public MezclaDeProductos() {
    }

    public MezclaDeProductos(Integer idMezcla) {
        this.idMezcla = idMezcla;
    }

    public MezclaDeProductos(Integer idMezcla, BigDecimal cantidadUsada, BigDecimal rendimiento) {
        this.idMezcla = idMezcla;
        this.cantidadUsada = cantidadUsada;
        this.rendimiento = rendimiento;
    }

    public Integer getIdMezcla() {
        return idMezcla;
    }

    public void setIdMezcla(Integer idMezcla) {
        this.idMezcla = idMezcla;
    }

    public BigDecimal getCantidadUsada() {
        return cantidadUsada;
    }

    public void setCantidadUsada(BigDecimal cantidadUsada) {
        this.cantidadUsada = cantidadUsada;
    }

    public BigDecimal getRendimiento() {
        return rendimiento;
    }

    public void setRendimiento(BigDecimal rendimiento) {
        this.rendimiento = rendimiento;
    }

    public Producto getIdProducto() {
        return idProducto;
    }

    public void setIdProducto(Producto idProducto) {
        this.idProducto = idProducto;
    }

    public Producto getIProductoMezcla() {
        return iProductoMezcla;
    }

    public void setIProductoMezcla(Producto iProductoMezcla) {
        this.iProductoMezcla = iProductoMezcla;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (idMezcla != null ? idMezcla.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof MezclaDeProductos)) {
            return false;
        }
        MezclaDeProductos other = (MezclaDeProductos) object;
        if ((this.idMezcla == null && other.idMezcla != null) || (this.idMezcla != null && !this.idMezcla.equals(other.idMezcla))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "Modelo.Entidades.MezclaDeProductos[ idMezcla=" + idMezcla + " ]";
    }

}
