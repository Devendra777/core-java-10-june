package com.xwork.z.patientapp.city;

import com.xwork.z.patientapp.area.Area;

public class City {


            Area area ;
           public String cityName;


            public City(Area area){
                this.area = area ;
            }

    public void getCityDetails(){
        System.out.print(cityName + " ");
        this.area.getAreaDetails();
    }
}
