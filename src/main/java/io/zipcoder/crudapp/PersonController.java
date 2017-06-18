package io.zipcoder.crudapp;
import java.util.Collection;
import java.util.concurrent.atomic.AtomicLong;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/console")
public class PersonController {

    private final AtomicLong counter = new AtomicLong();

    @Autowired
    private PersonService personService;

    @RequestMapping(method = RequestMethod.GET)
    public Collection<Person> getAllPeople(){
        return personService.getAllPeople();
    }

    @RequestMapping(value= "/{id}", method = RequestMethod.GET)
    public Person getPersonById(@PathVariable("id") long id){
        return personService.getPersonById(id);
    }

    @RequestMapping(value = "/{id}", method = RequestMethod.DELETE)
        public void deletePersonById(@PathVariable("id") long id) {
            personService.removePersonById(id);
        }

    @RequestMapping(method = RequestMethod.PUT, consumes = MediaType.APPLICATION_JSON_VALUE)
        public void deletePersonById(@RequestBody Person person){
        personService.updatePerson(person);
    }

    @RequestMapping(method = RequestMethod.POST, consumes = MediaType.APPLICATION_JSON_VALUE)
        public void insertPerson(@RequestBody Person person){
            personService.insertPerson(person);
    }

}
