package agenda.tech_academy.service;

import java.util.List;

import org.springframework.stereotype.Service;

import agenda.tech_academy.model.Person;
import agenda.tech_academy.repository.PersonRepository;

@Service
public class PersonService {
    private final PersonRepository personRepository;

    public PersonService(PersonRepository personRepository) {
        this.personRepository = personRepository;
    }

    public List<Person> getAll(){
        return personRepository.getAll();
    }

    public Person get(String personId){
        return personRepository.get(personId);
    }

    public Person addPerson(Person person){
        person.setPersonId(null);
        return personRepository.save(person);
    }

    public Person updatePerson(String personId, Person person){
        Person personToSearch = personRepository.get(personId);
        if(personToSearch == null){
            return null;
        }
        person.setPersonId(personId);
        return personRepository.save(person);
    }

    public Person deletePerson(String personId){
        return personRepository.delete(personId);
    }
}
