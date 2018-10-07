package pl.jch.tests.jaxws.server;

import java.util.HashMap;
import java.util.Map;
import javax.jws.WebService;

@WebService(endpointInterface = "pl.jch.tests.jaxws.server.PersonService")
public class PersonServiceImpl implements PersonService {

    private static final Map<Integer, Person> persons = new HashMap<>();

    @Override
    public boolean addPerson(Person person) {
        synchronized (persons) {
            if (persons.containsKey(person.getId())) {
                return false;
            }
            persons.put(person.getId(), person);

            return true;
        }
    }

    @Override
    public boolean deletePerson(int id) {
        synchronized (persons) {
            return persons.remove(id) != null;
        }
    }

    @Override
    public Person getPerson(int id) {
        synchronized (persons) {
            return persons.get(id);
        }
    }

    @Override
    public Person[] getAllPersons() {
        synchronized (persons) {
            return persons.values().toArray(new Person[0]);
        }
    }
}
