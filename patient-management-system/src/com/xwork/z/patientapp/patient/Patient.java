package com.xwork.z.patientapp.patient;

import com.xwork.z.patientapp.address.Address;
import com.xwork.z.patientapp.constants.BloodGroup;
import com.xwork.z.patientapp.constants.Gender;

public class Patient {

           public  int patientId;
            public String patientName;

            public int age;
            public  Gender gender;
            public   BloodGroup bloodGroup;
            Address address;

             public Patient(Address address){
                 this.address = address;
             }

         public  void displayPatientAddress(){
                this.address.getAddressDetails();
            }

}
