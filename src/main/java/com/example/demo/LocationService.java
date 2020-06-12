package com.example.demo;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class LocationService {

    @Autowired
    private LocationRepositoy locationrespository;

    public List<Location> getAllLocatios() {
        List<Location> locations = new ArrayList<>();
        locationrespository.findAll().forEach(locations::add);
        return locations;
    }

    public Optional<Location> getLocation(String id) {
        return locationrespository.findById(id);
    }

    public void addLocation(Location location){
        locationrespository.save(location);
    }

    public void updateLocation(String id,Location location){
        locationrespository.save(location);
    }

    public void deleteLocation(String id){
        locationrespository.deleteById(id);
    }
}