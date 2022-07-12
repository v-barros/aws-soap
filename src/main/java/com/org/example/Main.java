package com.org.example;

import com.org.example.models.CountryInfoService;
import com.org.example.models.CountryInfoServiceSoapType;

public class Main {
    public static void main(String[] args) {
        System.setProperty("http.proxyHost", "127.0.0.1");
        System.setProperty("http.proxyPort", "8888");

        CountryInfoService service = new CountryInfoService();
        CountryInfoServiceSoapType countryService = service.getCountryInfoServiceSoap();
        System.out.println("#############################################################\n\t\tCountry Currency (United States): ");
        System.out.println(countryService.countryCurrency("US").getSName());
        System.out.println("#############################################################\n\t\tContinents list:");
        countryService.listOfContinentsByName().getTContinent().forEach(continent-> System.out.println(continent.getSName()));
        System.out.println("#############################################################\n\t\tCountry Capital (United States):");
        System.out.println(countryService.capitalCity("US"));
    }

}