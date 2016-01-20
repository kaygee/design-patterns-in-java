package com.kevingann.patterns.adapter;

import java.util.ArrayList;
import java.util.List;

public class EmployeeClient {

    public List<Employee> getEmployeeList() {
        List<Employee> employees = new ArrayList<>();
        Employee employeeFromDB = new EmployeeDB("1234", "Kevin", "Gann", "kaygee@gmail.com");
        employees.add(employeeFromDB);

        // This is where the adapter comes into play!
        EmployeeLdap employeeLdap = new EmployeeLdap("hansolo", "solo", "han", "han@solo.com");
        employees.add(new EmployeeAdapterLdap(employeeLdap));

        // Another adapter.
        EmployeeCSV employeeCSV = new EmployeeCSV("567,Luke,Skywalker,luke@skywalker.com");
        employees.add(new EmployeeAdapterCSV(employeeCSV));

        return employees;
    }

}
