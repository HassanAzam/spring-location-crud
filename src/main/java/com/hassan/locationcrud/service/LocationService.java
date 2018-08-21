package com.hassan.locationcrud.service;

import java.util.List;

import com.hassan.locationcrud.entities.Location;

public interface LocationService {

	Location saveLocation(Location location);
	Location updateLocation(Location location);
	Location getLocationById(int id);
	void deleteLocation(Location location);
	List<Location> getAllLocations();
}
