package com.xwork.z.patientapp.area;

import com.xwork.z.patientapp.street.Street;

public class Area {

          Street street ;
        public  String areaName ;

          public Area(Street street){
              this.street    =   street ;

          }

    public void getAreaDetails(){
        System.out.print(areaName + " ");
        this.street.getStreetDetails();
    }
}
