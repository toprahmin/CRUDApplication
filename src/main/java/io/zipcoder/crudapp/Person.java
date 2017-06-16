package io.zipcoder.crudapp;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

/**
 * Created by rahmirford on 6/16/17.
 */

@Entity
public class Person {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private final long id;
    private final String name;

    public Person(long id, String name){
        this.id = id;
        this.name= name;
    }

    public long getId() {
        return id;
    }

    public String getName() {
        return name;
    }
}
