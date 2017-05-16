package com.example.repository;

import com.example.classes.Car;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

/**
 * Created by Bartixon on 2017-05-04.
 */

@Repository
public interface CarRepository extends JpaRepository<Car , Integer> {
}
