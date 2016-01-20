package com.kevingann.patterns.adapter;

// This is the adapter that adapts the EmployeeLdap to the Employee interface.
public class EmployeeAdapterLdap implements Employee {

    private EmployeeLdap instance;

    public EmployeeAdapterLdap(EmployeeLdap employeeLdap) {
        this.instance = employeeLdap;
    }

    @Override
    public String getId() {
        return instance.getCn();
    }

    @Override
    public String getFirstName() {
        return instance.getGivenName();
    }

    @Override
    public String getLastName() {
        return instance.getSurname();
    }

    @Override
    public String getEmail() {
        return instance.getMail();
    }

    // This could be considered as bleeding into a Decorator pattern since it adds additional functionality.
    public String toString() {
        return "ID: " + getId() + " First name: " + getFirstName() + " Last Name: " + getLastName() + " Email: " + getEmail();
    }
}
