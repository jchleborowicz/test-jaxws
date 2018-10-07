package pl.jch.tests.jaxws.client;

import java.net.MalformedURLException;
import java.net.URL;
import java.util.Arrays;
import javax.xml.namespace.QName;
import javax.xml.ws.Service;

import pl.jch.tests.jaxws.server.Person;
import pl.jch.tests.jaxws.server.PersonService;

import static java.util.stream.Collectors.joining;

public class SOAPPublisherClient {

    public static void main(String[] args) throws MalformedURLException {
        final URL wsdlUrl = new URL("http://localhost:8888/ws/person?wsdl");

        final QName qName =
                new QName("http://server.jaxws.tests.jch.pl/", "PersonServiceImplService");

        final Service service = Service.create(wsdlUrl, qName);

        final PersonService personService = service.getPort(PersonService.class);

        System.out.println("\nAdding person #1");
        System.out.println(personService.addPerson(
                Person.builder()
                        .id(1)
                        .name("Pankaj")
                        .age(30)
                        .build()
        ));

        System.out.println("\nAdding person #2");
        System.out.println(personService.addPerson(
                Person.builder()
                        .id(2)
                        .name("Meghna")
                        .age(25)
                        .build()
        ));

        System.out.println("\nGetting person #1");
        System.out.println(personService.getPerson(1));

        getAllPersons(personService);

//        System.out.println("\nDeleting person");
//        System.out.println(personService.deletePerson(2));

        getAllPersons(personService);
    }

    private static void getAllPersons(PersonService personService) {
        System.out.println("\nGetting all persons");
        System.out.println(
                Arrays.stream(personService.getAllPersons())
                        .map(Object::toString)
                        .collect(joining("\n* ", "* ", ""))
        );
    }


}
