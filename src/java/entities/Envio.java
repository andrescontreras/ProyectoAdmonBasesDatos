/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package entities;

import java.io.Serializable;
import java.math.BigInteger;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;
import javax.xml.bind.annotation.XmlRootElement;

/**
 *
 * @author andre
 */
@Entity
@Table(name = "ENVIO")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Envio.findAll", query = "SELECT e FROM Envio e"),
    @NamedQuery(name = "Envio.findByIdenvio", query = "SELECT e FROM Envio e WHERE e.idenvio = :idenvio"),
    @NamedQuery(name = "Envio.findByCantidadenviada", query = "SELECT e FROM Envio e WHERE e.cantidadenviada = :cantidadenviada")})
public class Envio implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @NotNull
    @Column(name = "IDENVIO")
    private Long idenvio;
    @Basic(optional = false)
    @NotNull
    @Column(name = "CANTIDADENVIADA")
    private BigInteger cantidadenviada;
    @JoinColumn(name = "FUENTEID", referencedColumnName = "IDFUENTE")
    @ManyToOne(optional = false)
    private Fuente fuenteid;
    @JoinColumn(name = "PERIODOID", referencedColumnName = "IDPERIODO")
    @ManyToOne(optional = false)
    private Periodo periodoid;

    public Envio() {
    }

    public Envio(Long idenvio) {
        this.idenvio = idenvio;
    }

    public Envio(Long idenvio, BigInteger cantidadenviada) {
        this.idenvio = idenvio;
        this.cantidadenviada = cantidadenviada;
    }

    public Long getIdenvio() {
        return idenvio;
    }

    public void setIdenvio(Long idenvio) {
        this.idenvio = idenvio;
    }

    public BigInteger getCantidadenviada() {
        return cantidadenviada;
    }

    public void setCantidadenviada(BigInteger cantidadenviada) {
        this.cantidadenviada = cantidadenviada;
    }

    public Fuente getFuenteid() {
        return fuenteid;
    }

    public void setFuenteid(Fuente fuenteid) {
        this.fuenteid = fuenteid;
    }

    public Periodo getPeriodoid() {
        return periodoid;
    }

    public void setPeriodoid(Periodo periodoid) {
        this.periodoid = periodoid;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (idenvio != null ? idenvio.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Envio)) {
            return false;
        }
        Envio other = (Envio) object;
        if ((this.idenvio == null && other.idenvio != null) || (this.idenvio != null && !this.idenvio.equals(other.idenvio))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "entities.Envio[ idenvio=" + idenvio + " ]";
    }
    
}
