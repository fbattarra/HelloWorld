package be.abis.helloworld.model;

public class Person {

    private String firstName;
    private int age;

    public Person() {}

    public Person(String firstName, int age){
        this.firstName = firstName;
        this.age = age;

    }

    public String getFirstName(){
        return this.firstName;
    }
}
