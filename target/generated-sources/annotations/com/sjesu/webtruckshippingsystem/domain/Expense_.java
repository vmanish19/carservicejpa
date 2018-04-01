package com.sjesu.webtruckshippingsystem.domain;

import java.util.Date;
import javax.annotation.Generated;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="EclipseLink-2.5.2.v20140319-rNA", date="2017-11-14T17:00:35")
@StaticMetamodel(Expense.class)
public class Expense_ { 

    public static volatile SingularAttribute<Expense, Date> date;
    public static volatile SingularAttribute<Expense, Integer> empId;
    public static volatile SingularAttribute<Expense, Double> amount;
    public static volatile SingularAttribute<Expense, String> category;
    public static volatile SingularAttribute<Expense, Integer> expId;
    public static volatile SingularAttribute<Expense, String> desc;
    public static volatile SingularAttribute<Expense, String> paymentType;

}