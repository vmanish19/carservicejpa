package com.sjesu.webtruckshippingsystem.domain;

import java.util.Date;
import javax.annotation.Generated;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="EclipseLink-2.5.2.v20140319-rNA", date="2017-11-14T17:00:35")
@StaticMetamodel(Ticket.class)
public class Ticket_ { 

    public static volatile SingularAttribute<Ticket, Date> date;
    public static volatile SingularAttribute<Ticket, Boolean> isPaid;
    public static volatile SingularAttribute<Ticket, Integer> driverId;
    public static volatile SingularAttribute<Ticket, Double> fine;
    public static volatile SingularAttribute<Ticket, Integer> id;
    public static volatile SingularAttribute<Ticket, String> desc;

}