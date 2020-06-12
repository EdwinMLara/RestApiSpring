package com.example.demo;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class LocationControler {
    @Autowired
    public LocationService locationservice;

    @RequestMapping(value="/locations",method=RequestMethod.GET)
    public List<Location> getALLLocations(){
        return locationservice.getAllLocatios();
    }

    @RequestMapping(value="/locations/{id}")
    public Optional<Location> getLocation(@PathVariable final String id) {
        return locationservice.getLocation(id);
    }

    @RequestMapping(value = "/locations", method = RequestMethod.POST)
    public void addLocations(@RequestBody final Location location) {
        locationservice.addLocation(location);
    }

    @RequestMapping(value = "/locations/{id}", method = RequestMethod.PUT)
    public void updateLocation(@RequestBody final Location location, @PathVariable final String id) {
        locationservice.updateLocation(id, location);
    }

    @RequestMapping(value = "/locations/{id}", method = RequestMethod.DELETE)
    public void deleteLocation(@PathVariable final String id) {
        locationservice.deleteLocation(id);
    }
}