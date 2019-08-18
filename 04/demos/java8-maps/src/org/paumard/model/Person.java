package org.paumard.model;

/**
 *
 * @author José
 */
public class Person {

    private String name;
    
    private int age;
    
    private String gender;
    
    public Person(){}
    
    public Person(String name, int age, String gender) {
        this.name = name;
        this.age = age;
        this.gender = gender;
    }
    
    public String getName() {
        return this.name;
    }
    
    public int getAge() {
        return this.age;
    }

    public String getGender() {
        return this.gender;
    }
    
    public String toString() {
        return "Person [" + this.name + ", " + this.age + ", " + this.gender + "]";
    }
}
