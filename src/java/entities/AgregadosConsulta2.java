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
@Table(name = "AGREGADOS_CONSULTA2")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "AgregadosConsulta2.findAll", query = "SELECT a FROM AgregadosConsulta2 a"),
    @NamedQuery(name = "AgregadosConsulta2.findById", query = "SELECT a FROM AgregadosConsulta2 a WHERE a.id = :id"),
    @NamedQuery(name = "AgregadosConsulta2.findByHemisferio", query = "SELECT a FROM AgregadosConsulta2 a WHERE a.hemisferio = :hemisferio"),
    @NamedQuery(name = "AgregadosConsulta2.findByAnio", query = "SELECT a FROM AgregadosConsulta2 a WHERE a.anio = :anio"),
    @NamedQuery(name = "AgregadosConsulta2.findByCantidadTotal", query = "SELECT a FROM AgregadosConsulta2 a WHERE a.cantidadTotal = :cantidadTotal"),
    @NamedQuery(name = "AgregadosConsulta2.findBySecuencia", query = "SELECT a FROM AgregadosConsulta2 a WHERE a.secuencia = :secuencia")})
public class AgregadosConsulta2 implements Serializable {
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
    @Column(name = "HEMISFERIO")
    private String hemisferio;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 20)
    @Column(name = "ANIO")
    private String anio;
    @Basic(optional = false)
    @NotNull
    @Column(name = "CANTIDAD_TOTAL")
    private BigInteger cantidadTotal;
    @Basic(optional = false)
    @NotNull
    @Column(name = "SECUENCIA")
    private BigInteger secuencia;

    public AgregadosConsulta2() {
    }

    public AgregadosConsulta2(BigDecimal id) {
        this.id = id;
    }

    public AgregadosConsulta2(BigDecimal id, String hemisferio, String anio, BigInteger cantidadTotal, BigInteger secuencia) {
        this.id = id;
        this.hemisferio = hemisferio;
        this.anio = anio;
        this.cantidadTotal = cantidadTotal;
        this.secuencia = secuencia;
    }

    public BigDecimal getId() {
        return id;
    }

    public void setId(BigDecimal id) {
        this.id = id;
    }

    public String getHemisferio() {
        return hemisferio;
    }

    public void setHemisferio(String hemisferio) {
        this.hemisferio = hemisferio;
    }

    public String getAnio() {
        return anio;
    }

    public void setAnio(String anio) {
        this.anio = anio;
    }

    public BigInteger getCantidadTotal() {
        return cantidadTotal;
    }

    public void setCantidadTotal(BigInteger cantidadTotal) {
        this.cantidadTotal = cantidadTotal;
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
        if (!(object instanceof AgregadosConsulta2)) {
            return false;
        }
        AgregadosConsulta2 other = (AgregadosConsulta2) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "entities.AgregadosConsulta2[ id=" + id + " ]";
    }
    
}
