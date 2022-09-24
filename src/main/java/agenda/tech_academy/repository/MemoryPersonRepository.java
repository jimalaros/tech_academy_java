package agenda.tech_academy.repository;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.stereotype.Repository;

import agenda.tech_academy.model.Person;

@Repository
public class MemoryPersonRepository implements PersonRepository {
    private Map<String, Person> peopleMap;

    MemoryPersonRepository() {
        peopleMap = new HashMap<>();
    }

    @Override
    public List<Person> getAll() {
        List<Person> list = new ArrayList<>();
        list.addAll(peopleMap.values());
        return list;
    }

    @Override
    public Person get(String personId) {
        return peopleMap.get(personId);
    }

    @Override
    public Person save(Person person) {
        if(person.getPersonId() == null){
            person.setPersonId(String.valueOf(System.currentTimeMillis()));
        }
        return peopleMap.put(person.getPersonId(), person);
    }

    @Override
    public Person delete(String personId) {
        return peopleMap.remove(personId);
    }
        
}
