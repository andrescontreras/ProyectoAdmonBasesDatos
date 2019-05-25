/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package entities;

import java.io.Serializable;
import java.util.Collection;
import javax.persistence.Basic;
import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlTransient;

/**
 *
 * @author andre
 */
@Entity
@Table(name = "FUENTE")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Fuente.findAll", query = "SELECT f FROM Fuente f"),
    @NamedQuery(name = "Fuente.findByIdfuente", query = "SELECT f FROM Fuente f WHERE f.idfuente = :idfuente"),
    @NamedQuery(name = "Fuente.findByHemisferio", query = "SELECT f FROM Fuente f WHERE f.hemisferio = :hemisferio"),
    @NamedQuery(name = "Fuente.findByContinente", query = "SELECT f FROM Fuente f WHERE f.continente = :continente")})
public class Fuente implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @NotNull
    @Column(name = "IDFUENTE")
    private Long idfuente;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 50)
    @Column(name = "HEMISFERIO")
    private String hemisferio;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 50)
    @Column(name = "CONTINENTE")
    private String continente;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "fuenteid")
    private Collection<Envio> envioCollection;

    public Fuente() {
    }

    public Fuente(Long idfuente) {
        this.idfuente = idfuente;
    }

    public Fuente(Long idfuente, String hemisferio, String continente) {
        this.idfuente = idfuente;
        this.hemisferio = hemisferio;
        this.continente = continente;
    }

    public Long getIdfuente() {
        return idfuente;
    }

    public void setIdfuente(Long idfuente) {
        this.idfuente = idfuente;
    }

    public String getHemisferio() {
        return hemisferio;
    }

    public void setHemisferio(String hemisferio) {
        this.hemisferio = hemisferio;
    }

    public String getContinente() {
        return continente;
    }

    public void setContinente(String continente) {
        this.continente = continente;
    }

    @XmlTransient
    public Collection<Envio> getEnvioCollection() {
        return envioCollection;
    }

    public void setEnvioCollection(Collection<Envio> envioCollection) {
        this.envioCollection = envioCollection;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (idfuente != null ? idfuente.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Fuente)) {
            return false;
        }
        Fuente other = (Fuente) object;
        if ((this.idfuente == null && other.idfuente != null) || (this.idfuente != null && !this.idfuente.equals(other.idfuente))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "entities.Fuente[ idfuente=" + idfuente + " ]";
    }
    
}
