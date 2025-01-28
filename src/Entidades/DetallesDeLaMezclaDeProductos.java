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
@Table(name = "DetallesDeLaMezclaDeProductos")
@NamedQueries({
    @NamedQuery(name = "DetallesDeLaMezclaDeProductos.findAll", query = "SELECT d FROM DetallesDeLaMezclaDeProductos d"),
    @NamedQuery(name = "DetallesDeLaMezclaDeProductos.findByNombreProducto", query = "SELECT d FROM DetallesDeLaMezclaDeProductos d WHERE d.nombreProducto = :nombreProducto"),
    @NamedQuery(name = "DetallesDeLaMezclaDeProductos.findByComponente", query = "SELECT d FROM DetallesDeLaMezclaDeProductos d WHERE d.componente = :componente"),
    @NamedQuery(name = "DetallesDeLaMezclaDeProductos.findByCantidad", query = "SELECT d FROM DetallesDeLaMezclaDeProductos d WHERE d.cantidad = :cantidad"),
    @NamedQuery(name = "DetallesDeLaMezclaDeProductos.findByUnidad", query = "SELECT d FROM DetallesDeLaMezclaDeProductos d WHERE d.unidad = :unidad"),
    @NamedQuery(name = "DetallesDeLaMezclaDeProductos.findByRendimiento", query = "SELECT d FROM DetallesDeLaMezclaDeProductos d WHERE d.rendimiento = :rendimiento"),
    @NamedQuery(name = "DetallesDeLaMezclaDeProductos.findByCantidadReal", query = "SELECT d FROM DetallesDeLaMezclaDeProductos d WHERE d.cantidadReal = :cantidadReal"),
    @NamedQuery(name = "DetallesDeLaMezclaDeProductos.findByIdMezcla", query = "SELECT d FROM DetallesDeLaMezclaDeProductos d WHERE d.idMezcla = :idMezcla")})
public class DetallesDeLaMezclaDeProductos implements Serializable {

    private static final long serialVersionUID = 1L;
    @Basic(optional = false)
    @Column(name = "nombreProducto")
    private String nombreProducto;
    @Basic(optional = false)
    @Column(name = "Componente")
    private String componente;
    //@Max(value=99) @Min(value=0) //if you know range of your decimal fields consider using these annotations to enforce field validation
    @Basic(optional = false)
    @Column(name = "Cantidad")
    private BigDecimal cantidad;
    @Basic(optional = false)
    @Column(name = "Unidad")
    private String unidad;
    @Basic(optional = false)
    @Column(name = "Rendimiento %")
    private BigDecimal rendimiento;
    @Column(name = "Cantidad Real")
    private BigDecimal cantidadReal;
    @Basic(optional = false)
    @Column(name = "idMezcla")
    @Id
    private int idMezcla;

    public DetallesDeLaMezclaDeProductos() {
    }

    public String getNombreProducto() {
        return nombreProducto;
    }

    public void setNombreProducto(String nombreProducto) {
        this.nombreProducto = nombreProducto;
    }

    public String getComponente() {
        return componente;
    }

    public void setComponente(String componente) {
        this.componente = componente;
    }

    public BigDecimal getCantidad() {
        return cantidad;
    }

    public void setCantidad(BigDecimal cantidad) {
        this.cantidad = cantidad;
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

    public BigDecimal getCantidadReal() {
        return cantidadReal;
    }

    public void setCantidadReal(BigDecimal cantidadReal) {
        this.cantidadReal = cantidadReal;
    }

    public int getIdMezcla() {
        return idMezcla;
    }

    public void setIdMezcla(int idMezcla) {
        this.idMezcla = idMezcla;
    }

}
