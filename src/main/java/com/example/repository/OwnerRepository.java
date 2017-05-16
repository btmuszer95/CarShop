package com.example.repository;

import com.example.classes.Owner;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

/**
 * Created by Bartixon on 2017-05-08.
 */

@Repository
public interface OwnerRepository extends JpaRepository<Owner , Integer>{
}
