package com.xwork.z.patientapp;

import com.xwork.z.patientapp.address.Address;
import com.xwork.z.patientapp.area.Area;
import com.xwork.z.patientapp.city.City;
import com.xwork.z.patientapp.constants.BloodGroup;
import com.xwork.z.patientapp.constants.Gender;
import com.xwork.z.patientapp.country.Country;
import com.xwork.z.patientapp.hospital.Hospital;
import com.xwork.z.patientapp.hospital.JayadevaHospital;
import com.xwork.z.patientapp.patient.Patient;
import com.xwork.z.patientapp.state.State;
import com.xwork.z.patientapp.street.Street;

public class PatientRunner {


    public static void main(String[] args) {

        Street street = new Street();
        street.streetNo = 223;
        street.streetName = "3rd Main Road";
        Area area  = new Area(street);
        area.areaName = "Maruthinagar";
        City city =  new City(area);
        city.cityName = "Bengaluru";
        State state  = new State(city);
        state.stateName = "Karnataka";
        Country country = new Country(state);
        country.countryName = "India";
        Address address = new Address(country);
        Patient patient  =new Patient(address);
        patient.gender = Gender.MALE;
        patient.bloodGroup =BloodGroup.APOSITIVE;
        patient.age = 67;
        patient.patientName = "Baba";
        patient.patientId = 1;


        JayadevaHospital hospital = new JayadevaHospital();
        // hospital has patient
        hospital.addPatient(patient);
        hospital.getPatient();

    }
}
