package com.example.classes;

import com.example.classes.Owner;

import javax.persistence.*;
import java.math.BigDecimal;

/**
 * Created by Bartixon on 2017-05-04.
 */

@Entity
public class Car {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    @Column
    private String quality;

    @Column
    private String bodyNumber;

    @Column
    private Integer productionYear;

    @Column
    private String brand;

    @Column
    private String model;

    @Column
    private String ocNumber;

    @Column
    private String registrationNumber;

    @Column
    private String fuelType;

    @Column
    private Integer mileage;

    @Column
    private String engine;

    @Column
    private String power;

    @Column
    private String gearBox;

    @Column
    private boolean isAvailable;

    @Column
    private BigDecimal price;

    @ManyToOne
    @JoinColumn(name = "owner_id")
    private Owner owner;




    public Car() {
    }

    public Car(String bodyNumber, Integer productionYear, String brand, String model, String ocNumber, String registrationNumber, String fuelType, Integer mileage, String engine, String power, String gearBox, boolean isAvailable, BigDecimal price, String carCond) {
        this.bodyNumber = bodyNumber;
        this.productionYear = productionYear;
        this.brand = brand;
        this.model = model;
        this.ocNumber = ocNumber;
        this.registrationNumber = registrationNumber;
        this.fuelType = fuelType;
        this.mileage = mileage;
        this.engine = engine;
        this.power = power;
        this.gearBox = gearBox;
        this.isAvailable = isAvailable;
        this.price = price;
        this.quality = carCond;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getBodyNumber() {
        return bodyNumber;
    }

    public void setBodyNumber(String bodyNumber) {
        this.bodyNumber = bodyNumber;
    }

    public Integer getProductionYear() {
        return productionYear;
    }

    public void setProductionYear(Integer productionYear) {
        this.productionYear = productionYear;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public String getOcNumber() {
        return ocNumber;
    }

    public void setOcNumber(String ocNumber) {
        this.ocNumber = ocNumber;
    }

    public String getRegistrationNumber() {
        return registrationNumber;
    }

    public void setRegistrationNumber(String registrationNumber) {
        this.registrationNumber = registrationNumber;
    }

    public String getFuelType() {
        return fuelType;
    }

    public void setFuelType(String fuelType) {
        this.fuelType = fuelType;
    }

    public Integer getMileage() {
        return mileage;
    }

    public void setMileage(Integer mileage) {
        this.mileage = mileage;
    }

    public String getEngine() {
        return engine;
    }

    public void setEngine(String engine) {
        this.engine = engine;
    }

    public String getPower() {
        return power;
    }

    public void setPower(String power) {
        this.power = power;
    }

    public String getGearBox() {
        return gearBox;
    }

    public void setGearBox(String gearBox) {
        this.gearBox = gearBox;
    }

    public boolean isAvailable() {
        return isAvailable;
    }

    public void setAvailable(boolean available) {
        isAvailable = available;
    }

    public BigDecimal getPrice() {
        return price;
    }

    public void setPrice(BigDecimal price) {
        this.price = price;
    }

    public String getQuality() {
        return quality;
    }

    public void setQuality(String quality) {
        this.quality = quality;
    }

    public Owner getOwner() {
        return owner;
    }

    public void setOwner(Owner owner) {
        this.owner = owner;
    }
}
