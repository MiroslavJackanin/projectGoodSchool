package sk.itsovy.jackanin.goodSchool;

abstract public class Person {
    private String firstName;
    private String lastName;

    //CONSTRUCTOR
    public Person(String firstName, String lastName) {
        this.firstName = firstName;
        this.lastName = lastName;
    }

    //GETTER
    public String getFirstName() {
        return firstName;
    }
    public String getLastName() {
        return lastName;
    }

    //METHOD
    public String getFullName(){
        return firstName + " " + lastName;
    }
}
