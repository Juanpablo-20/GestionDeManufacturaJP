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
@Table(name = "IngredienteUnidad")
@NamedQueries({
    @NamedQuery(name = "IngredienteUnidad.findAll", query = "SELECT i FROM IngredienteUnidad i"),
    @NamedQuery(name = "IngredienteUnidad.findByIngrediente", query = "SELECT i FROM IngredienteUnidad i WHERE i.ingrediente = :ingrediente"),
    @NamedQuery(name = "IngredienteUnidad.findByUm", query = "SELECT i FROM IngredienteUnidad i WHERE i.um = :um"),
    @NamedQuery(name = "IngredienteUnidad.findByIdUnidadMedida", query = "SELECT i FROM IngredienteUnidad i WHERE i.idUnidadMedida = :idUnidadMedida"),
    @NamedQuery(name = "IngredienteUnidad.findByIdIngrediente", query = "SELECT i FROM IngredienteUnidad i WHERE i.idIngrediente = :idIngrediente")})
public class IngredienteUnidad implements Serializable {

    private static final long serialVersionUID = 1L;
    @Basic(optional = false)
    @Column(name = "Ingrediente")
    private String ingrediente;
    @Column(name = "UM")
    private String um;
    @Basic(optional = false)
    @Column(name = "idUnidadMedida")
    private int idUnidadMedida;
    @Basic(optional = false)
    @Column(name = "idIngrediente")
    @Id
    private int idIngrediente;

    public IngredienteUnidad() {
    }

    public String getIngrediente() {
        return ingrediente;
    }

    public void setIngrediente(String ingrediente) {
        this.ingrediente = ingrediente;
    }

    public String getUm() {
        return um;
    }

    public void setUm(String um) {
        this.um = um;
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
