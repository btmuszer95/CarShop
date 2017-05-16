package com.example.services;

import com.example.Dtos.CarDto;
import com.example.repository.CarRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.math.BigDecimal;
import java.util.List;
import java.util.stream.Collectors;

/**
 * Created by Bartixon on 2017-05-04.
 */

@Service
public class CarService {

    BigDecimal minPriceValue = new BigDecimal(5000);

    @Autowired
    private CarRepository carRepository;


    public List<Car> getCarList() {
        return carRepository.findAll();
    }

    public boolean save(CarDto carDto) {
        Car car = new Car();
        car.setBodyNumber(carDto.getBodyNumber());
        car.setBrand(carDto.getBrand());
        car.setEngine(carDto.getEngine());
        car.setFuelType(carDto.getFuelType());
        car.setGearBox(carDto.getGearBox());
        car.setMileage(carDto.getMileage());
        car.setModel(carDto.getModel());
        car.setOcNumber(carDto.getOcNumber());
        car.setPower(carDto.getPower());
        car.setProductionYear(carDto.getProductionYear());
        car.setRegistrationNumber(carDto.getRegistrationNumber());
        car.setQuality(carDto.getQuality());
        car.setAvailable(true);

        BigDecimal price =carDto.getPrice();
        if( price.compareTo(minPriceValue) > 0 ) {
            car.setPrice(carDto.getPrice());
        }
        else {
            return false;
        }

        car.setOwner(carDto.getOwner());

        carRepository.save(car);

        return true;
    }

    public void buyCar(Car car) {
        car.setAvailable(false);
    }

    public void setAsSold(Integer id) {
        Car car = carRepository.findOne(id);
        car.setAvailable(false);
        carRepository.save(car);
    }

    public List<Car> showSoldCars () {
        List<Car> all = carRepository.findAll();
        List<Car> soldCars = all.stream().filter(s->s.isAvailable()==false).collect(Collectors.toList());

        return soldCars;
    }

    public List<Car> showAvailableCars () {
        List<Car> all = carRepository.findAll();
        List<Car> soldCars = all.stream().filter(s->s.isAvailable()==true).collect(Collectors.toList());

        return soldCars;
    }

    public Car viewThisCar(Integer id) {
        Car car = carRepository.findOne(id);
        car.getBrand();
        car.getModel();
        car.getQuality();
        car.getProductionYear();
        car.getEngine();
        car.getGearBox();
        car.getPower();
        car.getFuelType();
        car.getMileage();
        car.getOcNumber();
        car.getRegistrationNumber();
        car.getPrice();

        return car;
    }






}
