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

    public void updateLocation(String id,Location location){
        for(int i=0;i<locations.size();i++){
            Location aux = locations.get(i);
            if(aux.getId().equals(id)){
                locations.set(i, location);
                break;
            }
        }
    }

    public void deleteLocation(String id){
        locations.removeIf(l -> l.getId().equals(id));
    }
}