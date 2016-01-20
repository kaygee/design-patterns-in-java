package com.kevingann.patterns.adapter;

import org.junit.Test;

import java.util.List;

import static org.junit.Assert.assertEquals;

public class AdapterTest {

    @Test
    public void demoAdapter() {
        EmployeeClient client = new EmployeeClient();

        List<Employee> employees = client.getEmployeeList();

        System.out.println(employees);
        assertEquals(employees.size(), 3);
    }

}
