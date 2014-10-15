package com.mohawkcollege.cr;

import com.mohawkcollege.cr.Trips;
import javax.annotation.Generated;
import javax.persistence.metamodel.ListAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="EclipseLink-2.5.2.v20140319-rNA", date="2014-10-15T15:36:52")
@StaticMetamodel(Cars.class)
public class Cars_ { 

    public static volatile ListAttribute<Cars, Trips> tripsList;
    public static volatile SingularAttribute<Cars, String> model;
    public static volatile SingularAttribute<Cars, Integer> id;
    public static volatile SingularAttribute<Cars, String> modelYear;
    public static volatile SingularAttribute<Cars, String> make;

}