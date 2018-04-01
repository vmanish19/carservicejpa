package com.sjesu.webtruckshippingsystem.domain;

import com.group9.truckshippingsystem.security.Group;
import javax.annotation.Generated;
import javax.persistence.metamodel.ListAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="EclipseLink-2.5.2.v20140319-rNA", date="2017-11-14T17:00:35")
@StaticMetamodel(User.class)
public class User_ { 

    public static volatile SingularAttribute<User, String> password;
    public static volatile ListAttribute<User, Group> groups;
    public static volatile SingularAttribute<User, Integer> id;
    public static volatile SingularAttribute<User, String> userType;
    public static volatile SingularAttribute<User, String> userName;

}