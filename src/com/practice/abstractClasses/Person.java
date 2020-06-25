package com.practice.abstractClasses;

import com.practice.inherited.Employee;

import java.time.LocalDate;

public abstract class Person {
    public abstract String getDescription();

    private String name;

    public Person(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }
}
