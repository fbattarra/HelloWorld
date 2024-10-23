package be.abis.helloworld.service;

import be.abis.helloworld.model.Person;
import org.springframework.stereotype.Component;

@Component
public class AbisPersonService implements PersonService {

    public AbisPersonService(){}

    @Override
    public Person findPersonById(int id){
        return new Person("Sandy", 42);
    }
}
