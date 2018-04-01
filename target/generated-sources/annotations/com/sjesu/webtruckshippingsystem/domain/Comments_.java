package com.sjesu.webtruckshippingsystem.domain;

import java.util.Date;
import javax.annotation.Generated;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="EclipseLink-2.5.2.v20140319-rNA", date="2017-11-14T17:00:35")
@StaticMetamodel(Comments.class)
public class Comments_ { 

    public static volatile SingularAttribute<Comments, Date> date;
    public static volatile SingularAttribute<Comments, Integer> custId;
    public static volatile SingularAttribute<Comments, String> description;
    public static volatile SingularAttribute<Comments, Integer> id;
    public static volatile SingularAttribute<Comments, Date> time;
    public static volatile SingularAttribute<Comments, String> type;

}