package com.ps.tutorial.services;

import com.ps.tutorial.model.country.Country;
import com.ps.tutorial.repository.CountryRepository;

import javax.jws.WebService;

@WebService(endpointInterface = "com.ps.tutorial.services.CountryWs")
public class CountryWsImpl implements CountryWs {

    private CountryRepository repository = new CountryRepository();

    @Override
    public Country getCountry(String name) {
        return repository.findCountry(name);
    }

}
