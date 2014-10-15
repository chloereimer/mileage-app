package com.mohawkcollege.cr;

import com.mohawkcollege.cr.Cars;
import javax.annotation.Generated;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="EclipseLink-2.5.2.v20140319-rNA", date="2014-10-15T15:36:52")
@StaticMetamodel(Trips.class)
public class Trips_ { 

    public static volatile SingularAttribute<Trips, Float> gasUsed;
    public static volatile SingularAttribute<Trips, Integer> mileageStart;
    public static volatile SingularAttribute<Trips, Integer> mileageEnd;
    public static volatile SingularAttribute<Trips, Integer> id;
    public static volatile SingularAttribute<Trips, Cars> carId;

}