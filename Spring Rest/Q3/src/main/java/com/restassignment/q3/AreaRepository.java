package com.restassignment.q3;

import org.springframework.stereotype.Repository;
import java.util.ArrayList;
import java.util.List;

@Repository
public class AreaRepository {
    List<Area> areas = new ArrayList<>();

    public List<Area> getAreas() {
        areas.add(new Area(99501,"AK","ANCHORAGE","US"));
        areas.add(new Area(522001,"AP","Guntur","IN"));
        areas.add(new Area(98765,"ZY","Unknown","Pak"));
        return areas;
    }

    public Area findbyZip(long zip){
        for (Area a : getAreas()) {
            if(a.getZipcode()==zip)
                return a;
        }
        return null;
    }
}
