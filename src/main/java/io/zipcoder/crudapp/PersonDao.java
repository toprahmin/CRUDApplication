package io.zipcoder.crudapp;

import org.springframework.stereotype.Repository;
import java.util.Collection;
import java.util.Map;

@Repository
public class PersonDao {

    private static Map<Long, Person> people;

    public Collection<Person> getAllPeople(){
        return this.people.values();
    }

    public Person getPersonById(long id){
        return this.people.get(id);
    }

    public void removePersonById(long id){
        this.people.remove(id);
    }

    public void updatePerson(Person person){
        Person p = people.get(person.getId());
        p.setAge(person.getAge());
        p.setName(person.getName());
    }

    public void insertPersonToDb(Person person){
        this.people.put(person.getId(), person);
    }
}
