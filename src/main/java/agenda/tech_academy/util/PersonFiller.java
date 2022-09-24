package agenda.tech_academy.util;

import javax.annotation.PostConstruct;

import org.springframework.stereotype.Component;

import agenda.tech_academy.model.Person;
import agenda.tech_academy.service.PersonService;

@Component
public class PersonFiller {
    private final PersonService personService;

    public PersonFiller(PersonService personService) {
        this.personService = personService;
    }

    @PostConstruct
    public void init(){
        Person person1 = new Person("Jimmy", "jimmy@gmail.com", "320");
        personService.addPerson(person1);
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {}
        Person person2 = new Person("Alex", "alex@gmail.com", "315");
        personService.addPerson(person2);
    }

}