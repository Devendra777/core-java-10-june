package com.xwork.z.patientapp.state;

import com.xwork.z.patientapp.city.City;

public class State {

            City  city ;
           public String stateName;


              public State(City city){
               this.city = city;
              }

    public void getStateDetails(){
        System.out.print(stateName + " ");
        this.city.getCityDetails();
    }
}
