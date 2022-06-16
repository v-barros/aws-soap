package com.org.example.cli;

import com.org.example.models.CountryInfoService;
import com.org.example.models.CountryInfoServiceSoapType;

public class Main {
    public static void main(String[] args) {
        CountryInfoService service = new CountryInfoService();
        CountryInfoServiceSoapType countryService = service.getCountryInfoServiceSoap();
        System.out.println(countryService.countryCurrency("US").getSName());
        countryService.listOfContinentsByName().getTContinent().forEach(continent-> System.out.println(continent.getSName()));

    }

}
