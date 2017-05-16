package com.example.services;

import com.example.Dtos.OwnerDto;
import com.example.classes.Owner;
import com.example.repository.CarRepository;
import com.example.repository.OwnerRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * Created by Bartixon on 2017-05-08.
 */

@Service
public class OwnerService {

    @Autowired
    private OwnerRepository ownerRepository;


    public Integer save(OwnerDto ownerDto) {
        Owner owner = new Owner();

        owner.setName(ownerDto.getName());
        owner.setSurname(ownerDto.getSurname());
        owner.setAddress(ownerDto.getAddress());
        owner.setCity(ownerDto.getCity());
        owner.setPhoneNumber(ownerDto.getPhoneNumber());
        owner.setEmailAddress(ownerDto.getEmailAddress());

        return ownerRepository.save(owner).getId();


    }

}
