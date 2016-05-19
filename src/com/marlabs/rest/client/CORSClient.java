package com.marlabs.rest.client;

import javax.ws.rs.core.MediaType;  
import com.sun.jersey.api.client.Client;  
import com.sun.jersey.api.client.ClientResponse;  
import com.sun.jersey.api.client.WebResource;  
import com.sun.jersey.api.client.config.ClientConfig;  
import com.sun.jersey.api.client.config.DefaultClientConfig;  
  
public class CORSClient {  
    static final String REST_URI = "http://localhost:8080/greeting?name=Yuan";  
	
	
    public static void main(String[] args) {  
  
  
        ClientConfig config = new DefaultClientConfig();  
        Client client = Client.create(config);  
        WebResource service = client.resource(REST_URI);  
  
        //WebResource addService = service.path("rest").path("?name=Yuan");
        WebResource addService = service.path("");
        System.out.println("Response data: " + getResponse(addService));  
        System.out.println("---------------------------------------------------");  
  
    }  
  
    private static String getResponse(WebResource service) {  
        //return service.accept(MediaType.APPLICATION_JSON).get(ClientResponse.class).toString();  
    	return service.accept(MediaType.APPLICATION_JSON).get(String.class);
    }  
  
    private static String getOutputAsXML(WebResource service) {  
        return service.accept(MediaType.TEXT_XML).get(String.class);  
    }  
}  