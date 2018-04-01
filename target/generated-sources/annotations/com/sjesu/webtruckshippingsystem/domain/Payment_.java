package com.sjesu.webtruckshippingsystem.domain;

import javax.annotation.Generated;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="EclipseLink-2.5.2.v20140319-rNA", date="2017-11-14T17:00:35")
@StaticMetamodel(Payment.class)
public class Payment_ { 

    public static volatile SingularAttribute<Payment, String> date;
    public static volatile SingularAttribute<Payment, Double> amount;
    public static volatile SingularAttribute<Payment, String> payType;
    public static volatile SingularAttribute<Payment, Integer> orderId;
    public static volatile SingularAttribute<Payment, Integer> payId;
    public static volatile SingularAttribute<Payment, String> cardNo;
    public static volatile SingularAttribute<Payment, String> expDate;

}