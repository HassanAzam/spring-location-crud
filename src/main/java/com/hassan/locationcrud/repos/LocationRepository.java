package com.hassan.locationcrud.repos;

import org.springframework.data.jpa.repository.JpaRepository;
import com.hassan.locationcrud.entities.Location;

public interface LocationRepository extends JpaRepository<Location, Integer> {

}
