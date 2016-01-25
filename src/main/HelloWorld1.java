package main;

import java.net.SocketException;

import org.eclipse.californium.core.CoapServer;
import org.eclipse.californium.core.server.resources.CoapExchange;

public class HelloWorld1 {

    public static void main(String[] args) {

        // binds on UDP port 5683
        CoapServer server = new CoapServer();
        server.start();
        
        // TODO :)
    }

    class HelloWorldRessource {
    	
    	public HelloWorldRessource( ) {

	    	super("helloWorld");
	    	
	    	setRessourceTitle("Hello-world Ressource");
    	}
    	
    }
    
    @Override
    public void performGET(GETRequest request ) {
}
