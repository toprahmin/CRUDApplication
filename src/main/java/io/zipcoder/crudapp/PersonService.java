package io.zipcoder.crudapp;
import io.zipcoder.crudapp.PersonDao;
import io.zipcoder.crudapp.Person;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Collection;

@Service
public class PersonService {

    @Autowired
    private PersonDao personDao;

    public Collection<Person> getAllPeople(){
        return this.personDao.getAllPeople();
    }

    public Person getPersonById(long id){
        return this.personDao.getPersonById(id);
    }

    public void removePersonById(long id) {
        this.personDao.removePersonById(id);
    }

    public void updatePerson(Person person){
        this.personDao.updatePerson(person);
    }

    public void insertPerson(Person person){
        this.personDao.insertPersonToDb(person);
    }
}
