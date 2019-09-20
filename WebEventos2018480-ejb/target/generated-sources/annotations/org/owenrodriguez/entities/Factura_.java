package org.owenrodriguez.entities;

import javax.annotation.Generated;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;
import org.owenrodriguez.entities.FacturaPK;

@Generated(value="EclipseLink-2.5.2.v20140319-rNA", date="2019-09-19T17:23:49")
@StaticMetamodel(Factura.class)
public class Factura_ { 

    public static volatile SingularAttribute<Factura, String> descripcion;
    public static volatile SingularAttribute<Factura, String> tarifa;
    public static volatile SingularAttribute<Factura, FacturaPK> facturaPK;
    public static volatile SingularAttribute<Factura, String> fechainicial;
    public static volatile SingularAttribute<Factura, String> fechafinal;

}