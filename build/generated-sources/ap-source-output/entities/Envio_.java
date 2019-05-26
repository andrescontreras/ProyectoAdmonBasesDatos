package entities;

import entities.Fuente;
import entities.Periodo;
import java.math.BigInteger;
import javax.annotation.Generated;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="EclipseLink-2.5.2.v20140319-rNA", date="2019-05-25T20:58:40")
@StaticMetamodel(Envio.class)
public class Envio_ { 

    public static volatile SingularAttribute<Envio, BigInteger> cantidadenviada;
    public static volatile SingularAttribute<Envio, Fuente> fuenteid;
    public static volatile SingularAttribute<Envio, Periodo> periodoid;
    public static volatile SingularAttribute<Envio, Long> idenvio;

}