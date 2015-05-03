
package com.ps.tutorial.clients;

import com.ps.tutorial.model.Country;
import com.ps.tutorial.model.ObjectFactory;

import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebResult;
import javax.jws.WebService;
import javax.jws.soap.SOAPBinding;
import javax.xml.bind.annotation.XmlSeeAlso;


/**
 * Country endpoint (auto-generated)
 */
@WebService(name = "CountryEndpoint", targetNamespace = "http://services.tutorial.ps.com/")
@SOAPBinding(style = SOAPBinding.Style.RPC)
@XmlSeeAlso({
    ObjectFactory.class
})
public interface CountryEndpoint {


    /**
     * Get country
     *
     * @param country Country name
     * @return Country
     */
    @WebMethod
    @WebResult(partName = "return")
    public Country getCountry(
            @WebParam(name = "arg0", partName = "arg0")
            String country);

}
