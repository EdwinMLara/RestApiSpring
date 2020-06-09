package com.example.demo;

import java.util.Arrays;
import java.util.List;
import org.springframework.stereotype.Service;

@Service    
public class LocationService {
    Location l1 = new Location("l1","lagos");
    Location l2 = new Location("l1","Abasa");
    
    List<Location> locations = Arrays.asList(l1,l2);

    public List<Location>getAllLocatios(){
        return this.locations;
    }

    public Location getLocation(String id){
        Location location = locations.stream().filter(l -> id.equals(l.getId())).findFirst().orElse(null);
        return location;
    }

    public void addLocation(Location location){
        locations.add(location);
    }
}