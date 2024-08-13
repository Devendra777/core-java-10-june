package com.xwork.z.patientapp.address;

import com.xwork.z.patientapp.country.Country;

public class Address {

            Country country ;

            public Address(Country country){
              this.country  =  country;
            }
    public void getAddressDetails(){
        this.country.getCountryDetails();
    }
}
