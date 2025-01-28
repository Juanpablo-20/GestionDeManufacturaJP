package Modelo.Entidades;

import java.io.Serializable;
import java.math.BigDecimal;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;

@Entity
@Table(name = "RecetasDeProductos")
@NamedQueries({
    @NamedQuery(name = "RecetasDeProductos.findAll", query = "SELECT r FROM RecetasDeProductos r"),
    @NamedQuery(name = "RecetasDeProductos.findByProducto", query = "SELECT r FROM RecetasDeProductos r WHERE r.producto = :producto"),
    @NamedQuery(name = "RecetasDeProductos.findByIngrediente", query = "SELECT r FROM RecetasDeProductos r WHERE r.ingrediente = :ingrediente"),
    @NamedQuery(name = "RecetasDeProductos.findByCantidadUsada", query = "SELECT r FROM RecetasDeProductos r WHERE r.cantidadUsada = :cantidadUsada"),
    @NamedQuery(name = "RecetasDeProductos.findByUnidad", query = "SELECT r FROM RecetasDeProductos r WHERE r.unidad = :unidad"),
    @NamedQuery(name = "RecetasDeProductos.findByRendimiento", query = "SELECT r FROM RecetasDeProductos r WHERE r.rendimiento = :rendimiento"),
    @NamedQuery(name = "RecetasDeProductos.findByPrecioIngrediente", query = "SELECT r FROM RecetasDeProductos r WHERE r.precioIngrediente = :precioIngrediente"),
    @NamedQuery(name = "RecetasDeProductos.findByCosto", query = "SELECT r FROM RecetasDeProductos r WHERE r.costo = :costo"),
    @NamedQuery(name = "RecetasDeProductos.findByIdProducto", query = "SELECT r FROM RecetasDeProductos r WHERE r.idProducto = :idProducto"),
    @NamedQuery(name = "RecetasDeProductos.findByIdUnidadMedida", query = "SELECT r FROM RecetasDeProductos r WHERE r.idUnidadMedida = :idUnidadMedida"),
    @NamedQuery(name = "RecetasDeProductos.findByIdIngrediente", query = "SELECT r FROM RecetasDeProductos r WHERE r.idIngrediente = :idIngrediente")})
public class RecetasDeProductos implements Serializable {

    private static final long serialVersionUID = 1L;
    @Basic(optional = false)
    @Column(name = "Producto")
    private String producto;
    @Basic(optional = false)
    @Column(name = "Ingrediente")
    private String ingrediente;
    // @Max(value=?)  @Min(value=?)//if you know range of your decimal fields consider using these annotations to enforce field validation
    @Basic(optional = false)
    @Column(name = "Cantidad Usada")
    private BigDecimal cantidadUsada;
    @Basic(optional = false)
    @Column(name = "Unidad")
    private String unidad;
    @Basic(optional = false)
    @Column(name = "Rendimiento %")
    private BigDecimal rendimiento;
    @Basic(optional = false)
    @Column(name = "Precio Ingrediente")
    private BigDecimal precioIngrediente;
    @Column(name = "Costo")
    private BigDecimal costo;
    @Basic(optional = false)
    @Column(name = "idProducto")
    @Id
    private int idProducto;
    @Basic(optional = false)
    @Column(name = "idUnidadMedida")
    private int idUnidadMedida;
    @Basic(optional = false)
    @Column(name = "idIngrediente")
    private int idIngrediente;

    public RecetasDeProductos() {
    }

    public String getProducto() {
        return producto;
    }

    public void setProducto(String producto) {
        this.producto = producto;
    }

    public String getIngrediente() {
        return ingrediente;
    }

    public void setIngrediente(String ingrediente) {
        this.ingrediente = ingrediente;
    }

    public BigDecimal getCantidadUsada() {
        return cantidadUsada;
    }

    public void setCantidadUsada(BigDecimal cantidadUsada) {
        this.cantidadUsada = cantidadUsada;
    }

    public String getUnidad() {
        return unidad;
    }

    public void setUnidad(String unidad) {
        this.unidad = unidad;
    }

    public BigDecimal getRendimiento() {
        return rendimiento;
    }

    public void setRendimiento(BigDecimal rendimiento) {
        this.rendimiento = rendimiento;
    }

    public BigDecimal getPrecioIngrediente() {
        return precioIngrediente;
    }

    public void setPrecioIngrediente(BigDecimal precioIngrediente) {
        this.precioIngrediente = precioIngrediente;
    }

    public BigDecimal getCosto() {
        return costo;
    }

    public void setCosto(BigDecimal costo) {
        this.costo = costo;
    }

    public int getIdProducto() {
        return idProducto;
    }

    public void setIdProducto(int idProducto) {
        this.idProducto = idProducto;
    }

    public int getIdUnidadMedida() {
        return idUnidadMedida;
    }

    public void setIdUnidadMedida(int idUnidadMedida) {
        this.idUnidadMedida = idUnidadMedida;
    }

    public int getIdIngrediente() {
        return idIngrediente;
    }

    public void setIdIngrediente(int idIngrediente) {
        this.idIngrediente = idIngrediente;
    }

}
