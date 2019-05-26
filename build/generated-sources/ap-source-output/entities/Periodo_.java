package entities;

import entities.Envio;
import javax.annotation.Generated;
import javax.persistence.metamodel.CollectionAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="EclipseLink-2.5.2.v20140319-rNA", date="2019-05-25T19:03:39")
@StaticMetamodel(Periodo.class)
public class Periodo_ { 

    public static volatile SingularAttribute<Periodo, Long> idperiodo;
    public static volatile CollectionAttribute<Periodo, Envio> envioCollection;
    public static volatile SingularAttribute<Periodo, String> mes;
    public static volatile SingularAttribute<Periodo, String> anio;

}