package agenda.tech_academy.repository;

import java.util.List;

import agenda.tech_academy.model.Person;

public interface PersonRepository {
    public List <Person> getAll();
    public Person get(String personId);
    public Person save(Person person);
    public Person delete (String personId);
}
