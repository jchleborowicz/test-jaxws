package pl.jch.tests.jaxws.server;

import javax.xml.ws.Endpoint;

public class SOAPPublisher {

    public static void main(String[] args) {
        Endpoint.publish("http://localhost:8888/ws/person", new PersonServiceImpl());

        System.out.println("Web Service has been started");
    }

}
