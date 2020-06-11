package com.example.demo;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import org.springframework.stereotype.Service;

@Service    
public class LocationService {
    Location l1 = new Location("l1","lagos");
    Location l2 = new Location("l2","Abasa");
    
    List<Location> locations = Arrays.asList(l1,l2);
    List<Location> locations2 = new ArrayList<>(locations);

    public List<Location>getAllLocatios(){
        return this.locations2;
    }

    public Location getLocation(String id){
        Location location = locations2.stream().filter(l -> id.equals(l.getId())).findFirst().orElse(null);
        return location;
    }

    public void addLocation(Location location){
        locations2.add(location);
    }

    public void updateLocation(String id,Location location){
        for(int i=0;i<locations2.size();i++){
            Location aux = locations2.get(i);
            if(aux.getId().equals(id)){
                locations2.set(i, location);
                break;
            }
        }
    }

    public void deleteLocation(String id){
        locations2.removeIf(l -> l.getId().equals(id));
    }
}