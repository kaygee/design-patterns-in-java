package com.kevingann.patterns.structural.adapter;

import org.junit.Test;

import java.util.List;

import static org.junit.Assert.assertEquals;

public class AdapterPatternTest {

    @Test
    public void testThatAdapterPatternWorks() {
        // This example is of a client that's pulling employee data from multiple locations and returning it.
        EmployeeClient client = new EmployeeClient();

        List<Employee> employees = client.getEmployeeList();

        assertEquals(employees.size(), 3);

        System.out.println(employees);
    }

}
