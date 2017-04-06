package rest.client;

import java.io.IOException;
import java.net.URI;


import javax.ws.rs.client.Client;
import javax.ws.rs.client.ClientBuilder;
import javax.ws.rs.client.WebTarget;
import javax.ws.rs.core.Response;
import javax.ws.rs.core.UriBuilder;

import org.glassfish.jersey.client.ClientConfig;

public class DeleteEndpoint {

	public static void main(String[] args) throws IOException {
	    ClientConfig config = new ClientConfig();
	    Client client = ClientBuilder.newClient(config);

	    URI baseURI = UriBuilder.fromUri("http://localhost:8080/").build();
	    
	    WebTarget target = client.target( baseURI );
	    
	    Response response = target.path("/contacts/2406135B57AC571D76BFACB0F3F79C50").request().delete();
	    
	    System.out.println(response.getStatus());
	}
}
