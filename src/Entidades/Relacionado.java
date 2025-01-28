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
@Table(name = "Relacionado")
@NamedQueries({
    @NamedQuery(name = "Relacionado.findAll", query = "SELECT r FROM Relacionado r ORDER BY r.apellidos, r.nombres"),
    @NamedQuery(name = "Relacionado.findByAlias", query = "SELECT r FROM Relacionado r WHERE r.alias = :alias"),
    @NamedQuery(name = "Relacionado.findByTipoPersona", query = "SELECT r FROM Relacionado r WHERE r.tipoPersona = :tipoPersona"),
    @NamedQuery(name = "Relacionado.findByIdentificacion", query = "SELECT r FROM Relacionado r WHERE r.identificacion = :identificacion"),
    @NamedQuery(name = "Relacionado.findByApellidos", query = "SELECT r FROM Relacionado r WHERE r.apellidos = :apellidos"),
    @NamedQuery(name = "Relacionado.findByNombres", query = "SELECT r FROM Relacionado r WHERE r.nombres = :nombres"),
    @NamedQuery(name = "Relacionado.findByDireccion", query = "SELECT r FROM Relacionado r WHERE r.direccion = :direccion")})
public class Relacionado implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @Column(name = "alias")
    private String alias;
    @Basic(optional = false)
    @Column(name = "tipoPersona")
    private String tipoPersona;
    @Basic(optional = false)
    @Column(name = "identificacion")
    private int identificacion;
    @Basic(optional = false)
    @Column(name = "apellidos")
    private String apellidos;
    @Basic(optional = false)
    @Column(name = "nombres")
    private String nombres;
    @Basic(optional = false)
    @Column(name = "direccion")
    private String direccion;

    public Relacionado() {
    }

    public Relacionado(String alias) {
        this.alias = alias;
    }

    public Relacionado(String alias, String tipoPersona, int identificacion, String apellidos, String nombres, String direccion) {
        this.alias = alias;
        this.tipoPersona = tipoPersona;
        this.identificacion = identificacion;
        this.apellidos = apellidos;
        this.nombres = nombres;
        this.direccion = direccion;
    }

    public String getAlias() {
        return alias;
    }

    public void setAlias(String alias) {
        this.alias = alias;
    }

    public String getTipoPersona() {
        return tipoPersona;
    }

    public void setTipoPersona(String tipoPersona) {
        this.tipoPersona = tipoPersona;
    }

    public int getIdentificacion() {
        return identificacion;
    }

    public void setIdentificacion(int identificacion) {
        this.identificacion = identificacion;
    }

    public String getApellidos() {
        return apellidos;
    }

    public void setApellidos(String apellidos) {
        this.apellidos = apellidos;
    }

    public String getNombres() {
        return nombres;
    }

    public void setNombres(String nombres) {
        this.nombres = nombres;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (alias != null ? alias.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Relacionado)) {
            return false;
        }
        Relacionado other = (Relacionado) object;
        if ((this.alias == null && other.alias != null) || (this.alias != null && !this.alias.equals(other.alias))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "Modelo.Entidades.Relacionado[ alias=" + alias + " ]";
    }

}
