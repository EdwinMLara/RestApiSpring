package com.example.demo;

import java.util.List;

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
    public Location getLocation(@PathVariable String id){
        return locationservice.getLocation(id);
    }

    @RequestMapping(value="locations",method=RequestMethod.POST)
    public void addLocations(@RequestBody Location location){
        locationservice.addLocation(location);
    }
}