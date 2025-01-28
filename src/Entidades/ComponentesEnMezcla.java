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
@Table(name = "ComponentesEnMezcla")
@NamedQueries({
    @NamedQuery(name = "ComponentesEnMezcla.findAll", query = "SELECT c FROM ComponentesEnMezcla c"),
    @NamedQuery(name = "ComponentesEnMezcla.findByIdMezcla", query = "SELECT c FROM ComponentesEnMezcla c WHERE c.idMezcla = :idMezcla"),
    @NamedQuery(name = "ComponentesEnMezcla.findByComponente", query = "SELECT c FROM ComponentesEnMezcla c WHERE c.componente = :componente"),
    @NamedQuery(name = "ComponentesEnMezcla.findByCantidad", query = "SELECT c FROM ComponentesEnMezcla c WHERE c.cantidad = :cantidad"),
    @NamedQuery(name = "ComponentesEnMezcla.findByUnidad", query = "SELECT c FROM ComponentesEnMezcla c WHERE c.unidad = :unidad"),
    @NamedQuery(name = "ComponentesEnMezcla.findByRendimiento", query = "SELECT c FROM ComponentesEnMezcla c WHERE c.rendimiento = :rendimiento"),
    @NamedQuery(name = "ComponentesEnMezcla.findByIProductoMezcla", query = "SELECT c FROM ComponentesEnMezcla c WHERE c.iProductoMezcla = :iProductoMezcla"),
    @NamedQuery(name = "ComponentesEnMezcla.findByIdUnidadMedida", query = "SELECT c FROM ComponentesEnMezcla c WHERE c.idUnidadMedida = :idUnidadMedida")})
public class ComponentesEnMezcla implements Serializable {

    private static final long serialVersionUID = 1L;
    @Basic(optional = false)
    @Column(name = "idMezcla")
    @Id
    private int idMezcla;
    @Basic(optional = false)
    @Column(name = "Componente")
    private String componente;
    //@Max(value=999999999.99) @Min(value=0)
    @Basic(optional = false)
    @Column(name = "Cantidad")
    private BigDecimal cantidad;
    @Basic(optional = false)
    @Column(name = "Unidad")
    private String unidad;
    @Basic(optional = false)
    @Column(name = "Rendimiento %")
    private BigDecimal rendimiento;
    @Basic(optional = false)
    @Column(name = "iProductoMezcla")
    private int iProductoMezcla;
    @Basic(optional = false)
    @Column(name = "idUnidadMedida")
    private int idUnidadMedida;

    public ComponentesEnMezcla() {
    }

    public int getIdMezcla() {
        return idMezcla;
    }

    public void setIdMezcla(int idMezcla) {
        this.idMezcla = idMezcla;
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

    public int getIProductoMezcla() {
        return iProductoMezcla;
    }

    public void setIProductoMezcla(int iProductoMezcla) {
        this.iProductoMezcla = iProductoMezcla;
    }

    public int getIdUnidadMedida() {
        return idUnidadMedida;
    }

    public void setIdUnidadMedida(int idUnidadMedida) {
        this.idUnidadMedida = idUnidadMedida;
    }

}
