/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package entities;

import java.io.Serializable;
import java.math.BigDecimal;
import java.math.BigInteger;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
import javax.xml.bind.annotation.XmlRootElement;

/**
 *
 * @author andre
 */
@Entity
@Table(name = "AGREGADOS_CONSULTA3")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "AgregadosConsulta3.findAll", query = "SELECT a FROM AgregadosConsulta3 a"),
    @NamedQuery(name = "AgregadosConsulta3.findById", query = "SELECT a FROM AgregadosConsulta3 a WHERE a.id = :id"),
    @NamedQuery(name = "AgregadosConsulta3.findByContinente", query = "SELECT a FROM AgregadosConsulta3 a WHERE a.continente = :continente"),
    @NamedQuery(name = "AgregadosConsulta3.findByCantidadtotal", query = "SELECT a FROM AgregadosConsulta3 a WHERE a.cantidadtotal = :cantidadtotal"),
    @NamedQuery(name = "AgregadosConsulta3.findByParticipacion", query = "SELECT a FROM AgregadosConsulta3 a WHERE a.participacion = :participacion"),
    @NamedQuery(name = "AgregadosConsulta3.findBySecuencia", query = "SELECT a FROM AgregadosConsulta3 a WHERE a.secuencia = :secuencia")})
public class AgregadosConsulta3 implements Serializable {
    private static final long serialVersionUID = 1L;
    // @Max(value=?)  @Min(value=?)//if you know range of your decimal fields consider using these annotations to enforce field validation
    @Id
    @Basic(optional = false)
    @NotNull
    @Column(name = "ID")
    private BigDecimal id;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 50)
    @Column(name = "CONTINENTE")
    private String continente;
    @Basic(optional = false)
    @NotNull
    @Column(name = "CANTIDADTOTAL")
    private BigInteger cantidadtotal;
    @Basic(optional = false)
    @NotNull
    @Column(name = "PARTICIPACION")
    private double participacion;
    @Basic(optional = false)
    @NotNull
    @Column(name = "SECUENCIA")
    private BigInteger secuencia;

    public AgregadosConsulta3() {
    }

    public AgregadosConsulta3(BigDecimal id) {
        this.id = id;
    }

    public AgregadosConsulta3(BigDecimal id, String continente, BigInteger cantidadtotal, double participacion, BigInteger secuencia) {
        this.id = id;
        this.continente = continente;
        this.cantidadtotal = cantidadtotal;
        this.participacion = participacion;
        this.secuencia = secuencia;
    }

    public BigDecimal getId() {
        return id;
    }

    public void setId(BigDecimal id) {
        this.id = id;
    }

    public String getContinente() {
        return continente;
    }

    public void setContinente(String continente) {
        this.continente = continente;
    }

    public BigInteger getCantidadtotal() {
        return cantidadtotal;
    }

    public void setCantidadtotal(BigInteger cantidadtotal) {
        this.cantidadtotal = cantidadtotal;
    }

    public double getParticipacion() {
        return participacion;
    }

    public void setParticipacion(double participacion) {
        this.participacion = participacion;
    }

    public BigInteger getSecuencia() {
        return secuencia;
    }

    public void setSecuencia(BigInteger secuencia) {
        this.secuencia = secuencia;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (id != null ? id.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof AgregadosConsulta3)) {
            return false;
        }
        AgregadosConsulta3 other = (AgregadosConsulta3) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "entities.AgregadosConsulta3[ id=" + id + " ]";
    }
    
}
