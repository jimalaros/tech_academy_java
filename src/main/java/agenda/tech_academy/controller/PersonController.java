package agenda.tech_academy.controller;

import java.util.List;

import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import agenda.tech_academy.model.Person;
import agenda.tech_academy.service.PersonService;

@RestController
@RequestMapping({"person"})
public class PersonController {
    private final PersonService personService;

    public PersonController(PersonService personService) {
        this.personService = personService;
    }

    @GetMapping("")
    public List<Person> getAll(){
        return personService.getAll();
    }

    @GetMapping("/{personId}")
    public Person get(@PathVariable String personId){
        return personService.get(personId);
    }

    @PostMapping("")
    public Person addPerson(@RequestBody Person person){
        return personService.addPerson(person);
    }

    @PutMapping("/{personId}")
    public Person addPerson(@PathVariable String personId, @RequestBody Person person){
        return personService.updatePerson(personId, person);
    }

    @DeleteMapping("/{personId}")
    public Person addPerson(@PathVariable String personId){
        return personService.deletePerson(personId);
    }
}
