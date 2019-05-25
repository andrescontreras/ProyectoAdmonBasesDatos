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
@Table(name = "AGREGADOS_CONSULTA5")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "AgregadosConsulta5.findAll", query = "SELECT a FROM AgregadosConsulta5 a"),
    @NamedQuery(name = "AgregadosConsulta5.findById", query = "SELECT a FROM AgregadosConsulta5 a WHERE a.id = :id"),
    @NamedQuery(name = "AgregadosConsulta5.findByHemisferio", query = "SELECT a FROM AgregadosConsulta5 a WHERE a.hemisferio = :hemisferio"),
    @NamedQuery(name = "AgregadosConsulta5.findByYear2012", query = "SELECT a FROM AgregadosConsulta5 a WHERE a.year2012 = :year2012"),
    @NamedQuery(name = "AgregadosConsulta5.findByYear2013", query = "SELECT a FROM AgregadosConsulta5 a WHERE a.year2013 = :year2013"),
    @NamedQuery(name = "AgregadosConsulta5.findByYear2014", query = "SELECT a FROM AgregadosConsulta5 a WHERE a.year2014 = :year2014"),
    @NamedQuery(name = "AgregadosConsulta5.findByYear2015", query = "SELECT a FROM AgregadosConsulta5 a WHERE a.year2015 = :year2015"),
    @NamedQuery(name = "AgregadosConsulta5.findByYear2016", query = "SELECT a FROM AgregadosConsulta5 a WHERE a.year2016 = :year2016"),
    @NamedQuery(name = "AgregadosConsulta5.findByTotal", query = "SELECT a FROM AgregadosConsulta5 a WHERE a.total = :total"),
    @NamedQuery(name = "AgregadosConsulta5.findBySecuencia", query = "SELECT a FROM AgregadosConsulta5 a WHERE a.secuencia = :secuencia")})
public class AgregadosConsulta5 implements Serializable {
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
    @Column(name = "YEAR_2012")
    private BigInteger year2012;
    @Column(name = "YEAR_2013")
    private BigInteger year2013;
    @Column(name = "YEAR_2014")
    private BigInteger year2014;
    @Column(name = "YEAR_2015")
    private BigInteger year2015;
    @Column(name = "YEAR_2016")
    private BigInteger year2016;
    @Column(name = "TOTAL")
    private BigInteger total;
    @Basic(optional = false)
    @NotNull
    @Column(name = "SECUENCIA")
    private BigInteger secuencia;

    public AgregadosConsulta5() {
    }

    public AgregadosConsulta5(BigDecimal id) {
        this.id = id;
    }

    public AgregadosConsulta5(BigDecimal id, String hemisferio, BigInteger secuencia) {
        this.id = id;
        this.hemisferio = hemisferio;
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

    public BigInteger getYear2012() {
        return year2012;
    }

    public void setYear2012(BigInteger year2012) {
        this.year2012 = year2012;
    }

    public BigInteger getYear2013() {
        return year2013;
    }

    public void setYear2013(BigInteger year2013) {
        this.year2013 = year2013;
    }

    public BigInteger getYear2014() {
        return year2014;
    }

    public void setYear2014(BigInteger year2014) {
        this.year2014 = year2014;
    }

    public BigInteger getYear2015() {
        return year2015;
    }

    public void setYear2015(BigInteger year2015) {
        this.year2015 = year2015;
    }

    public BigInteger getYear2016() {
        return year2016;
    }

    public void setYear2016(BigInteger year2016) {
        this.year2016 = year2016;
    }

    public BigInteger getTotal() {
        return total;
    }

    public void setTotal(BigInteger total) {
        this.total = total;
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
        if (!(object instanceof AgregadosConsulta5)) {
            return false;
        }
        AgregadosConsulta5 other = (AgregadosConsulta5) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "entities.AgregadosConsulta5[ id=" + id + " ]";
    }
    
}
