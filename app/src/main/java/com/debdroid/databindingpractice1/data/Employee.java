package com.debdroid.databindingpractice1.data;

/**
 * Created by debashispaul on 15/12/2017.
 */

public class Employee {
    private final String firstName;
    private final String lastName;
    private final String age;

    public Employee(String firstName, String lastName, int age) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.age = Integer.toString(age);
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public String getAge() {
        return age;
    }
}
