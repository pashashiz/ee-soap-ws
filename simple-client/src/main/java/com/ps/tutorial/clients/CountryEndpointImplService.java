package com.ps.tutorial.clients;

import java.net.MalformedURLException;
import java.net.URL;
import java.util.logging.Logger;
import javax.xml.namespace.QName;
import javax.xml.ws.Service;
import javax.xml.ws.WebEndpoint;
import javax.xml.ws.WebServiceClient;
import javax.xml.ws.WebServiceFeature;

/**
 * Country endpoint service (auto-generated)
 */
@WebServiceClient(name = "CountryEndpointImplService",
        targetNamespace = "http://services.tutorial.ps.com/",
        wsdlLocation = CountryEndpointImplService.PLAIN_WSDL_LOCATION)
public class CountryEndpointImplService extends Service {

    public final static String PLAIN_WSDL_LOCATION = "http://localhost:8080/simple-rpc-service/country?wsdl";
    private final static URL COUNTRYENDPOINTIMPLSERVICE_WSDL_LOCATION;
    private final static Logger logger = Logger.getLogger(CountryEndpointImplService.class.getName());

    static {
        URL url = null;
        try {
            URL baseUrl;
            baseUrl = CountryEndpointImplService.class.getResource(".");
            url = new URL(baseUrl, PLAIN_WSDL_LOCATION);
        } catch (MalformedURLException e) {
            logger.warning("Failed to create URL for the wsdl Location: '" + PLAIN_WSDL_LOCATION +
                    "', retrying as a local file");
            logger.warning(e.getMessage());
        }
        COUNTRYENDPOINTIMPLSERVICE_WSDL_LOCATION = url;
    }

    public CountryEndpointImplService(URL wsdlLocation, QName serviceName) {
        super(wsdlLocation, serviceName);
    }

    public CountryEndpointImplService() {
        super(COUNTRYENDPOINTIMPLSERVICE_WSDL_LOCATION,
                new QName("http://services.tutorial.ps.com/", "CountryEndpointImplService"));
    }

    /**
     * Get country endpoint
     *
     * @return returns CountryEndpoint
     */
    @WebEndpoint(name = "CountryEndpointImplPort")
    public CountryEndpoint getCountryEndpointImplPort() {
        return super.getPort(new QName("http://services.tutorial.ps.com/", "CountryEndpointImplPort"), CountryEndpoint.class);
    }

    /**
     * Get country endpoint
     *
     * @param features A list of {@link WebServiceFeature} to configure on the proxy.
     *                 Supported features not in the <code>features</code> parameter will have their default values.
     * @return returns CountryEndpoint
     */
    @WebEndpoint(name = "CountryEndpointImplPort")
    public CountryEndpoint getCountryEndpointImplPort(WebServiceFeature... features) {
        return super.getPort(new QName("http://services.tutorial.ps.com/", "CountryEndpointImplPort"), CountryEndpoint.class, features);
    }

}
