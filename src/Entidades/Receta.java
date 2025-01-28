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
@Table(name = "Receta")
@NamedQueries({
    @NamedQuery(name = "Receta.findAll", query = "SELECT r FROM Receta r"),
    @NamedQuery(name = "Receta.findByIdProdIngrediente", query = "SELECT r FROM Receta r WHERE r.idProdIngrediente = :idProdIngrediente"),
    @NamedQuery(name = "Receta.findByIds", query = "SELECT r FROM Receta r WHERE r.idIngrediente = :idIngrediente and r.idProducto = :idProducto"),
    @NamedQuery(name = "Receta.findByCantidadUsada", query = "SELECT r FROM Receta r WHERE r.cantidadUsada = :cantidadUsada"),
    @NamedQuery(name = "Receta.findByRendimiento", query = "SELECT r FROM Receta r WHERE r.rendimiento = :rendimiento")})
public class Receta implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "idProdIngrediente")
    private Integer idProdIngrediente;
    // @Max(value=?)  @Min(value=?)//if you know range of your decimal fields consider using these annotations to enforce field validation
    @Basic(optional = false)
    @Column(name = "cantidadUsada")
    private BigDecimal cantidadUsada;
    @Basic(optional = false)
    @Column(name = "rendimiento")
    private BigDecimal rendimiento;
    @JoinColumn(name = "idIngrediente", referencedColumnName = "idIngrediente")
    @ManyToOne(optional = false)
    private Ingrediente idIngrediente;
    @JoinColumn(name = "idProducto", referencedColumnName = "idProducto")
    @ManyToOne(optional = false)
    private Producto idProducto;

    public Receta() {
    }

    public Receta(Integer idProdIngrediente) {
        this.idProdIngrediente = idProdIngrediente;
    }

    public Receta(Integer idProdIngrediente, BigDecimal cantidadUsada, BigDecimal rendimiento) {
        this.idProdIngrediente = idProdIngrediente;
        this.cantidadUsada = cantidadUsada;
        this.rendimiento = rendimiento;
    }

    public Integer getIdProdIngrediente() {
        return idProdIngrediente;
    }

    public void setIdProdIngrediente(Integer idProdIngrediente) {
        this.idProdIngrediente = idProdIngrediente;
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

    public Ingrediente getIdIngrediente() {
        return idIngrediente;
    }

    public void setIdIngrediente(Ingrediente idIngrediente) {
        this.idIngrediente = idIngrediente;
    }

    public Producto getIdProducto() {
        return idProducto;
    }

    public void setIdProducto(Producto idProducto) {
        this.idProducto = idProducto;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (idProdIngrediente != null ? idProdIngrediente.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Receta)) {
            return false;
        }
        Receta other = (Receta) object;
        if ((this.idProdIngrediente == null && other.idProdIngrediente != null) || (this.idProdIngrediente != null && !this.idProdIngrediente.equals(other.idProdIngrediente))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "Modelo.Entidades.Receta[ idProdIngrediente=" + idProdIngrediente + " ]";
    }

}
