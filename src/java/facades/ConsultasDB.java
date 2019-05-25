/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package facades;

import entities.AgregadosConsulta1;
import entities.AgregadosConsulta2;
import entities.AgregadosConsulta3;
import entities.AgregadosConsulta4;
import entities.AgregadosConsulta5;
import entities.Usuario;
import java.math.BigDecimal;
import java.math.BigInteger;
import java.util.ArrayList;
import java.util.List;
import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.ParameterMode;
import javax.persistence.PersistenceContext;
import javax.persistence.StoredProcedureQuery;

/**
 *
 * @author andre
 */
@Stateless
public class ConsultasDB {

    // Add business logic below. (Right-click in editor and choose
    // "Insert Code > Add Business Method")
    @PersistenceContext(unitName = "BasesPU")
    private EntityManager em;

    protected EntityManager getEntityManager() {
        return em;
    }

    public List<AgregadosConsulta1> totalHemisferioContinente() {
        StoredProcedureQuery query = em.createStoredProcedureQuery("envio_tapi.total_hemisferio_continente").registerStoredProcedureParameter(
                1,
                Class.class,
                ParameterMode.REF_CURSOR
        );
        query.execute();
        List<Object[]> multasObjs = query.getResultList();
        List<AgregadosConsulta1> hemisferios = new ArrayList<>();

        for (Object[] m : multasObjs) {
            AgregadosConsulta1 hemisferio = new AgregadosConsulta1();
            hemisferio.setHemisferio(m[0].toString());
            hemisferio.setContinente(m[1].toString());
            hemisferio.setCantidadtotal(m[2].toString());
            hemisferios.add(hemisferio);
        }
        return hemisferios;
    }

    public List<AgregadosConsulta2> totalPorAnio() {
        StoredProcedureQuery query = em.createStoredProcedureQuery("envio_tapi.total_hemisferio_anio").registerStoredProcedureParameter(
                1,
                Class.class,
                ParameterMode.REF_CURSOR
        );
        query.execute();
        List<Object[]> multasObjs = query.getResultList();
        List<AgregadosConsulta2> hemisferios = new ArrayList<>();

        for (Object[] m : multasObjs) {
            AgregadosConsulta2 hemisferio = new AgregadosConsulta2();
            hemisferio.setHemisferio(m[0].toString());
            hemisferio.setAnio(m[1].toString());
            hemisferio.setCantidadTotal(new BigInteger(m[2].toString()));
            hemisferios.add(hemisferio);
        }
        return hemisferios;
    }

    public List<AgregadosConsulta3> porcentajeParticipacionPorContinente() {
        StoredProcedureQuery query = em.createStoredProcedureQuery("envio_tapi.participacion_continente").registerStoredProcedureParameter(
                1,
                Class.class,
                ParameterMode.REF_CURSOR
        );
        query.execute();
        List<Object[]> multasObjs = query.getResultList();
        List<AgregadosConsulta3> hemisferios = new ArrayList<>();

        for (Object[] m : multasObjs) {
            AgregadosConsulta3 hemisferio = new AgregadosConsulta3();
            hemisferio.setContinente(m[0].toString());
            hemisferio.setCantidadtotal(new BigInteger(m[1].toString()));
            hemisferio.setParticipacion(new Double(m[2].toString()));
            hemisferios.add(hemisferio);
        }
        return hemisferios;
    }

    public List<AgregadosConsulta4> ranking_continentes() {
        StoredProcedureQuery query = em.createStoredProcedureQuery("envio_tapi.ranking_continentes").registerStoredProcedureParameter(
                1,
                Class.class,
                ParameterMode.REF_CURSOR
        );
        query.execute();
        List<Object[]> multasObjs = query.getResultList();
        List<AgregadosConsulta4> hemisferios = new ArrayList<>();

        for (Object[] m : multasObjs) {
            AgregadosConsulta4 hemisferio = new AgregadosConsulta4();
            hemisferio.setHemisferio(m[0].toString());
            hemisferio.setContinente(m[1].toString());
            hemisferio.setCantidadtotal(new BigInteger(m[2].toString()));
            hemisferio.setTop(new BigInteger(m[3].toString()));
            hemisferios.add(hemisferio);
        }
        return hemisferios;
    }

    public List<AgregadosConsulta5> cantidades_hemisferios() {
        StoredProcedureQuery query = em.createStoredProcedureQuery("envio_tapi.cantidades_hemisferios").registerStoredProcedureParameter(
                1,
                Class.class,
                ParameterMode.REF_CURSOR
        );
        query.execute();
        List<Object[]> multasObjs = query.getResultList();
        List<AgregadosConsulta5> hemisferios = new ArrayList<>();

        for (Object[] m : multasObjs) {
            AgregadosConsulta5 hemisferio = new AgregadosConsulta5();
            hemisferio.setHemisferio(m[0].toString());
            hemisferio.setYear2012(new BigInteger(m[1].toString()));
            hemisferio.setYear2013(new BigInteger(m[2].toString()));
            hemisferio.setYear2014(new BigInteger(m[3].toString()));
            hemisferio.setYear2015(new BigInteger(m[4].toString()));
            hemisferio.setYear2016(new BigInteger(m[5].toString()));
            hemisferio.setTotal(new BigInteger(m[6].toString()));
            hemisferios.add(hemisferio);
        }
        return hemisferios;
    }

    public List<Usuario> login(String username, String password) {
        StoredProcedureQuery query = em.createStoredProcedureQuery("envio_tapi.login").registerStoredProcedureParameter(
                1,
                String.class,
                ParameterMode.IN
        )
                .registerStoredProcedureParameter(
                        2,
                        String.class,
                        ParameterMode.IN
                )
                .registerStoredProcedureParameter(
                        3,
                        Class.class,
                        ParameterMode.REF_CURSOR
                )
                .setParameter(1, username)
                .setParameter(2, password);

        query.execute();
        List<Object[]> multasObjs = query.getResultList();
        List<Usuario> usuarios = new ArrayList<>();

        for (Object[] m : multasObjs) {
            Usuario usuario = new Usuario();
            usuario.setLogin(m[0].toString());
            usuario.setPwd(m[1].toString());
            usuarios.add(usuario);
        }
        return usuarios;
    }
}
