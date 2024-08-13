package com.xwork.z.patientapp.country;

import com.xwork.z.patientapp.state.State;

public class Country {

             State state ;
            public String  countryName;

            public  Country(State state){
                 this.state = state;
            }

    public void getCountryDetails(){
        System.out.print(countryName + " ");
        this.state.getStateDetails();
    }
}
