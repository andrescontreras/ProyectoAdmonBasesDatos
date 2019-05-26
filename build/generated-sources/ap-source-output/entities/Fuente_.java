package entities;

import entities.Envio;
import javax.annotation.Generated;
import javax.persistence.metamodel.CollectionAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="EclipseLink-2.5.2.v20140319-rNA", date="2019-05-25T17:57:26")
@StaticMetamodel(Fuente.class)
public class Fuente_ { 

    public static volatile SingularAttribute<Fuente, String> continente;
    public static volatile SingularAttribute<Fuente, String> hemisferio;
    public static volatile CollectionAttribute<Fuente, Envio> envioCollection;
    public static volatile SingularAttribute<Fuente, Long> idfuente;

}