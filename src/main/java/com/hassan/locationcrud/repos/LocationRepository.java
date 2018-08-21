package com.hassan.locationcrud.repos;

import org.springframework.data.repository.CrudRepository;

import com.hassan.locationcrud.entities.Location;

public interface LocationRepository extends CrudRepository<Location, Integer> {

}
