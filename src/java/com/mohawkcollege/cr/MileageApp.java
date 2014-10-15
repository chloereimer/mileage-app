/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mohawkcollege.cr;

import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.annotation.Resource;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

/**
 *
 * @author chloe
 */
@ManagedBean
@SessionScoped
public class MileageApp {
    @PersistenceContext(unitName = "mileage_appPU")
    private EntityManager em;
    @Resource
    private javax.transaction.UserTransaction utx;
    private int car_id;

    /**
     * Creates a new instance of MileageApp
     */
    public MileageApp() {
    }

    public void persist(Object object) {
        try {
            utx.begin();
            em.persist(object);
            utx.commit();
        } catch (Exception e) {
            Logger.getLogger(getClass().getName()).log(Level.SEVERE, "exception caught", e);
            throw new RuntimeException(e);
        }
    }
    
    /**
     * Obtains a list of all cars in the "Cars" table
     * @return a list of all cars
     * 
     */
    public List<Cars> getCars() {
        // Note : You do not need to specify the query class
        List<Cars> allCars = (List<Cars>) (em.createNamedQuery("Cars.findAll").         
            getResultList());
        return allCars; 
    }
    
    public Cars getCar(){
        Cars car = (Cars) (em.createNamedQuery("Cars.findById").setParameter( "id", car_id ).getSingleResult());
        return car;
    }
    
    public void setCarId(int car_id){
        this.car_id = car_id;
    }
    
}
