package com.sjesu.webtruckshippingsystem.domain;

import java.util.Date;
import javax.annotation.Generated;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="EclipseLink-2.5.2.v20140319-rNA", date="2017-11-14T17:00:35")
@StaticMetamodel(Transaction.class)
public class Transaction_ { 

    public static volatile SingularAttribute<Transaction, Integer> tranId;
    public static volatile SingularAttribute<Transaction, Date> date;
    public static volatile SingularAttribute<Transaction, Double> amount;
    public static volatile SingularAttribute<Transaction, Integer> orderId;
    public static volatile SingularAttribute<Transaction, String> employeeId;
    public static volatile SingularAttribute<Transaction, Integer> priceId;

}