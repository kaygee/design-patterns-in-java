package com.kevingann.patterns.adapter;

public class EmployeeAdapterCSV implements Employee {

    private EmployeeCSV instance;

    public EmployeeAdapterCSV(EmployeeCSV instance) {
        this.instance = instance;
    }

    @Override
    public String getId() {
        return String.valueOf(instance.getId());
    }

    @Override
    public String getFirstName() {
        return instance.getFirstName();
    }

    @Override
    public String getLastName() {
        return instance.getLastname();
    }

    @Override
    public String getEmail() {
        return instance.getEmailAddress();
    }

    // This could be considered as bleeding into a Decorator pattern since it adds additional functionality.
    public String toString() {
        return "ID: " + getId() + " First name: " + getFirstName() + " Last Name: " + getLastName() + " Email: " + getEmail();
    }
}
