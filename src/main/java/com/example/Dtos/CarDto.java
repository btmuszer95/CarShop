package com.example.Dtos;

import com.example.classes.Owner;
import org.aspectj.lang.annotation.DeclareError;
import org.hibernate.validator.constraints.NotEmpty;
import org.springframework.format.annotation.NumberFormat;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseStatus;

import javax.validation.Valid;
import javax.validation.constraints.Min;
import javax.validation.constraints.NotNull;
import java.math.BigDecimal;

/**
 * Created by Bartixon on 2017-05-04.
 */
public class CarDto {


    private Integer id;

    @NotEmpty(message = "We need to know car's body number to sell it !")
    private String bodyNumber;

    @NotNull(message = "We need to know car's production year to sell it !")
    private Integer productionYear;

    @NotEmpty(message = "We need to know car's brand to sell it !")
    private String brand;

    @NotEmpty(message = "We need to know car's model to sell it !")
    private String model;

    @NotEmpty(message = "We need to know car's OC number to sell it !")
    private String ocNumber;

    @NotEmpty(message = "We need to know car's registration number to sell it !")
    private String registrationNumber;

    private String fuelType;

    @NotNull(message = "We need to know car's mileage to sell it !")
    private Integer mileage;

    @NotEmpty(message = "We need to know car's engine to sell it !")
    private String engine;

    @NotEmpty(message = "We need to know car's power to sell it !")
    private String power;


    private String gearBox;
    //moze tu musi byc declare error ale nie jestem pewny jeszcze teraz
    private boolean isAvailable;

    @Min(value = 5000 , message = "We do not accept cars, which are cheaper than 5000 PLN, sorry !")
    @NotNull(message = "We need to know car's price to sell it !")
    private BigDecimal price;

    @NotEmpty(message = "We need to know car's condition to sell it !")
    private String quality;

    private Owner owner;


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
