package com.hassan.locationcrud.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import com.hassan.locationcrud.entities.Location;
import com.hassan.locationcrud.service.LocationService;

@Controller

public class LocationController {
	
	@Autowired
	LocationService service;
	
	@RequestMapping("/showCreate")
	public String showCreate() {
		return "createLocation";
	}
	
	@RequestMapping("/saveLocation")
	public String saveLocation(@ModelAttribute("location") Location location, ModelMap model) {
		
		Location savedloc = service.saveLocation(location);
		model.put("msg","Location saved with id" + savedloc.getId());
		return "createLocation";
	}
	
	@RequestMapping("/displayLocations")
	public String displayLocations(ModelMap model) {
		
		List<Location> locations = service.getAllLocations();
		model.addAttribute("locations", locations);
		
		return "displayLocations";
	}
	
	@RequestMapping("/deleteLocation")
	public String deleteLocation(@RequestParam("id") int id, ModelMap model) {
		service.deleteLocationById(id);
		List<Location> locations = service.getAllLocations();
		model.addAttribute("locations", locations);
		
		return "displayLocations";
		
	}
	
	@RequestMapping("/editLocation")
	public String showUpdate(@RequestParam int id, ModelMap model) {
		Location location = service.getLocationById(id);
		model.addAttribute("location", location);
		return "editLocation";
	}
	
	@RequestMapping("/updateLocation")
	public String updateLocation(@ModelAttribute("location") Location location, ModelMap model) {
		service.updateLocation(location);
		List<Location> locations = service.getAllLocations();
		model.put("locations",locations);
		return "displayLocations";
	}
}
 