/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mohawkcollege.cr;

import java.io.Serializable;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;
import javax.xml.bind.annotation.XmlRootElement;

/**
 *
 * @author chloe
 */
@Entity
@Table(name = "TRIPS")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Trips.findAll", query = "SELECT t FROM Trips t"),
    @NamedQuery(name = "Trips.findById", query = "SELECT t FROM Trips t WHERE t.id = :id"),
    @NamedQuery(name = "Trips.findByMileageStart", query = "SELECT t FROM Trips t WHERE t.mileageStart = :mileageStart"),
    @NamedQuery(name = "Trips.findByMileageEnd", query = "SELECT t FROM Trips t WHERE t.mileageEnd = :mileageEnd"),
    @NamedQuery(name = "Trips.findByGasUsed", query = "SELECT t FROM Trips t WHERE t.gasUsed = :gasUsed")})
public class Trips implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "ID")
    private Integer id;
    @Basic(optional = false)
    @NotNull
    @Column(name = "MILEAGE_START")
    private int mileageStart;
    @Basic(optional = false)
    @NotNull
    @Column(name = "MILEAGE_END")
    private int mileageEnd;
    @Basic(optional = false)
    @NotNull
    @Column(name = "GAS_USED")
    private float gasUsed;
    @JoinColumn(name = "CAR_ID", referencedColumnName = "ID")
    @ManyToOne(optional = false)
    private Cars carId;

    public Trips() {
    }

    public Trips(Integer id) {
        this.id = id;
    }

    public Trips(Integer id, int mileageStart, int mileageEnd, float gasUsed) {
        this.id = id;
        this.mileageStart = mileageStart;
        this.mileageEnd = mileageEnd;
        this.gasUsed = gasUsed;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public int getMileageStart() {
        return mileageStart;
    }

    public void setMileageStart(int mileageStart) {
        this.mileageStart = mileageStart;
    }

    public int getMileageEnd() {
        return mileageEnd;
    }

    public void setMileageEnd(int mileageEnd) {
        this.mileageEnd = mileageEnd;
    }

    public float getGasUsed() {
        return gasUsed;
    }

    public void setGasUsed(float gasUsed) {
        this.gasUsed = gasUsed;
    }

    public Cars getCarId() {
        return carId;
    }

    public void setCarId(Cars carId) {
        this.carId = carId;
    }
    
    public int getTripLength(){
        return mileageEnd - mileageStart;
    }
    
    public float getFuelEconomy(){
        return gasUsed / getTripLength() * 100;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (id != null ? id.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Trips)) {
            return false;
        }
        Trips other = (Trips) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.mohawkcollege.cr.Trips[ id=" + id + " ]";
    }
    
}
