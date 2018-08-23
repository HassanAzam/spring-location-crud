package com.hassan.locationcrud.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.hassan.locationcrud.entities.Location;
import com.hassan.locationcrud.repos.LocationRepository;

@Service
public class LocationServiceImpl implements LocationService {

	@Autowired
	private LocationRepository repository; 
	
	@Override
	public Location saveLocation(Location location) {
		return repository.save(location);
	}

	@Override
	public Location updateLocation(Location location) {
		return repository.save(location);
	}

	@Override
	public Location getLocationById(int id) {
		Optional<Location> loc = repository.findById(id);
		return (loc.get());
	}

	@Override
	public void deleteLocation(Location location) {
		repository.delete(location);		
	}
	
	@Override
	public void deleteLocationById(int id) {
		repository.deleteById(id);		
	}

	@Override
	public List<Location> getAllLocations() {
		return repository.findAll();
	}

	public LocationRepository getRepository() {
		return repository;
	}

	public void setRepository(LocationRepository repository) {
		this.repository = repository;
	}

}
