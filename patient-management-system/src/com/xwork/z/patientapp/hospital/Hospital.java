package com.xwork.z.patientapp.hospital;

import com.xwork.z.patientapp.patient.Patient;

public class Hospital {

        // instance
         Patient patient ;

       // CRUD on Patient
         public    boolean  addPatient(Patient patient){
                 boolean isAdded = false;

                 if(patient != null){
                     if(patient.patientName != null  )
                          this.patient   =   patient ;
                          isAdded = true;
                 }
             return isAdded;
         }


              public  void getPatient(){
                  System.out.println("Fetching Patient Info....");
                  System.out.println("The Patient Name is "+ this.patient.patientName);
                  System.out.println("The Patient Gender is "+ this.patient.gender);
                  System.out.println("The Patient BloodGroup is "+ this.patient.bloodGroup);
                  System.out.println("The Patient Age is "+ this.patient.age);
                  System.out.println("The Patient Address is ");
                  this.patient.displayPatientAddress();
             }
}
