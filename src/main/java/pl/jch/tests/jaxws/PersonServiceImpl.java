package pl.jch.tests.jaxws;

public class PersonServiceImpl implements PersonService {
    @Override
    public boolean addPerson(Person person) {
        return false;
    }

    @Override
    public boolean deletePerson(int id) {
        return false;
    }

    @Override
    public Person getPerson(int id) {
        return null;
    }

    @Override
    public Person[] getAllPersons() {
        return new Person[0];
    }
}
