/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package servicios;

import entities.AgregadosConsulta1;
import entities.AgregadosConsulta2;
import entities.AgregadosConsulta3;
import entities.AgregadosConsulta4;
import entities.AgregadosConsulta5;
import entities.Usuario;
import facades.ConsultasDB;
import java.util.List;
import javax.ejb.EJB;
import javax.jws.WebService;
import javax.ejb.Stateless;
import javax.jws.WebMethod;
import javax.jws.WebParam;

/**
 *
 * @author andre
 */
@WebService(serviceName = "WSConsultasDB")
@Stateless()
public class WSConsultasDB {
    @EJB
    private ConsultasDB ejbRef;// Add business logic below. (Right-click in editor and choose
    // "Insert Code > Add Web Service Operation")

    @WebMethod(operationName = "totalHemisferioContinente")
    public List<AgregadosConsulta1> totalHemisferioContinente() {
        return ejbRef.totalHemisferioContinente();
    }

    @WebMethod(operationName = "totalPorAnio")
    public List<AgregadosConsulta2> totalPorAnio() {
        return ejbRef.totalPorAnio();
    }

    @WebMethod(operationName = "porcentajeParticipacionPorContinente")
    public List<AgregadosConsulta3> porcentajeParticipacionPorContinente() {
        return ejbRef.porcentajeParticipacionPorContinente();
    }

    @WebMethod(operationName = "ranking_continentes")
    public List<AgregadosConsulta4> ranking_continentes() {
        return ejbRef.ranking_continentes();
    }

    @WebMethod(operationName = "cantidades_hemisferios")
    public List<AgregadosConsulta5> cantidades_hemisferios() {
        return ejbRef.cantidades_hemisferios();
    }

    @WebMethod(operationName = "datosGrades")
    public List<String> datosGrades() {
        return ejbRef.datosGrades();
    }

    @WebMethod(operationName = "login")
    public List<Usuario> login(@WebParam(name = "username") String username, @WebParam(name = "password") String password) {
        return ejbRef.login(username, password);
    }
    
    @WebMethod(operationName = "obtener_grades_idEstudiante")
    public List<String> gradesxIDEstudiante(@WebParam(name = "idEstudiante") int id) {
        return ejbRef.getDatosGradexStudentID(id);
    }
    
}
