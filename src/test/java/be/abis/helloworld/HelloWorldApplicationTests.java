package be.abis.helloworld;

import be.abis.helloworld.model.Person;
import be.abis.helloworld.service.PersonService;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import static org.junit.jupiter.api.Assertions.assertEquals;

@SpringBootTest
class HelloWorldApplicationTests {

    @Autowired
    PersonService personService;

    @Test
    void person1IsSandy(){
        Person p = personService.findPersonById(1);
        System.out.println(p.getFirstName());
        assertEquals("Sandy", p.getFirstName());
    }

}
