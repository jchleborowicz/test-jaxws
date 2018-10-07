package pl.jch.tests.jaxws.client;

import java.util.stream.Collectors;

import pl.jch.tests.jaxws.server.PersonService;
import pl.jch.tests.jaxws.server.PersonServiceImplService;

public class TestPersonService {

    public static void main(String[] args) {
        final PersonServiceImplService serviceImpl = new PersonServiceImplService();

        final PersonService personService = serviceImpl.getPersonServiceImplPort();

        System.out.println(
                personService.getAllPersons().getItem()
                        .stream()
                        .map(person -> person.getId() + ":" + person.getName() + ":" + person.getAge())
                        .collect(Collectors.joining("\n* ", "* ", ""))
        );

    }
}
