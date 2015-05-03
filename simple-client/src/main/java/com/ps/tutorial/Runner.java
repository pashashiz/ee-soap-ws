package com.ps.tutorial;

import com.ps.tutorial.clients.CountryEndpoint;
import com.ps.tutorial.clients.CountryEndpointImplService;
import com.ps.tutorial.model.Country;
import org.apache.log4j.Logger;

public class Runner {

    private static Logger log = Logger.getLogger(Runner.class);

    public static void main(String[] args) {
        CountryEndpoint client = new CountryEndpointImplService().getCountryEndpointImplPort();
        Country country = client.getCountry("Ukraine");
        log.debug(country);
    }

}
