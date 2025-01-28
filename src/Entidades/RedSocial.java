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
@Table(name = "RedSocial")
@NamedQueries({
    @NamedQuery(name = "RedSocial.findAll", query = "SELECT r FROM RedSocial r ORDER BY r.nombreRedSocial"),
    @NamedQuery(name = "RedSocial.findByIdRedSocial", query = "SELECT r FROM RedSocial r WHERE r.idRedSocial = :idRedSocial"),
    @NamedQuery(name = "RedSocial.findByNombreRedSocial", query = "SELECT r FROM RedSocial r WHERE r.nombreRedSocial = :nombreRedSocial"),
    @NamedQuery(name = "RedSocial.findByURLRedSocial", query = "SELECT r FROM RedSocial r WHERE r.uRLRedSocial = :uRLRedSocial")})
public class RedSocial implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @Column(name = "idRedSocial")
    private Integer idRedSocial;
    @Basic(optional = false)
    @Column(name = "nombreRedSocial")
    private String nombreRedSocial;
    @Column(name = "URLRedSocial")
    private String uRLRedSocial;

    public RedSocial() {
    }

    public RedSocial(Integer idRedSocial) {
        this.idRedSocial = idRedSocial;
    }

    public RedSocial(Integer idRedSocial, String nombreRedSocial) {
        this.idRedSocial = idRedSocial;
        this.nombreRedSocial = nombreRedSocial;
    }

    public Integer getIdRedSocial() {
        return idRedSocial;
    }

    public void setIdRedSocial(Integer idRedSocial) {
        this.idRedSocial = idRedSocial;
    }

    public String getNombreRedSocial() {
        return nombreRedSocial;
    }

    public void setNombreRedSocial(String nombreRedSocial) {
        this.nombreRedSocial = nombreRedSocial;
    }

    public String getURLRedSocial() {
        return uRLRedSocial;
    }

    public void setURLRedSocial(String uRLRedSocial) {
        this.uRLRedSocial = uRLRedSocial;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (idRedSocial != null ? idRedSocial.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof RedSocial)) {
            return false;
        }
        RedSocial other = (RedSocial) object;
        if ((this.idRedSocial == null && other.idRedSocial != null) || (this.idRedSocial != null && !this.idRedSocial.equals(other.idRedSocial))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "Modelo.Entidades.RedSocial[ idRedSocial=" + idRedSocial + " ]";
    }

}
