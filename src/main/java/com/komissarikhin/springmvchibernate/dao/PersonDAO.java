package com.komissarikhin.springmvchibernate.dao;

import com.komissarikhin.springmvchibernate.models.Person;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;
@Component
public class PersonDAO {
    private static int PEOPLE_COUNT;
    List<Person> people;

    {
        people = new ArrayList<>();
        people.add(new Person(++PEOPLE_COUNT, "Tom"));
        people.add(new Person(++PEOPLE_COUNT, "Anna"));
        people.add(new Person(++PEOPLE_COUNT, "Bob"));
        people.add(new Person(++PEOPLE_COUNT, "John"));
    }

    public List<Person> index(){
        return people;
    }

    public Person show(int id){
        return people.stream()
                .filter(person -> person.getId() == id)
                .findAny().orElse(null);
    }
}
