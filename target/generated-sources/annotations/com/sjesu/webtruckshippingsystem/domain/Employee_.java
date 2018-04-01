package com.sjesu.webtruckshippingsystem.domain;

import com.sjesu.webtruckshippingsystem.domain.Address;
import com.sjesu.webtruckshippingsystem.domain.ContactDetails;
import java.util.Date;
import javax.annotation.Generated;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="EclipseLink-2.5.2.v20140319-rNA", date="2017-11-14T17:00:35")
@StaticMetamodel(Employee.class)
public class Employee_ { 

    public static volatile SingularAttribute<Employee, String> empLastName;
    public static volatile SingularAttribute<Employee, String> role;
    public static volatile SingularAttribute<Employee, Address> address;
    public static volatile SingularAttribute<Employee, Date> dateHired;
    public static volatile SingularAttribute<Employee, Date> dob;
    public static volatile SingularAttribute<Employee, String> empFirstName;
    public static volatile SingularAttribute<Employee, Integer> id;
    public static volatile SingularAttribute<Employee, Integer> ssn;
    public static volatile SingularAttribute<Employee, ContactDetails> cotactDetails;

}