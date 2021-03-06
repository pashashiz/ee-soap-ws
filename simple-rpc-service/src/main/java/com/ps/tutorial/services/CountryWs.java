package com.ps.tutorial.services;

import com.ps.tutorial.model.country.Country;

import javax.jws.WebMethod;
import javax.jws.WebService;
import javax.jws.soap.SOAPBinding;

@WebService
@SOAPBinding(style = SOAPBinding.Style.RPC)
public interface CountryWs {

    @WebMethod Country getCountry(String name);

}
