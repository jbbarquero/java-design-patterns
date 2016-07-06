package com.malsolo.design.patterns.structural.adapter;

import java.util.Arrays;
import java.util.List;

public class EmployeeCsvToPrincipalAdapter implements Principal {

    private final static String DEFAULT_AUTHORITY = "employee";

    private final EmployeeCSV employeeCSV;

    public EmployeeCsvToPrincipalAdapter(EmployeeCSV employeeCSV) {
        this.employeeCSV = employeeCSV;
    }

    @Override
    public String getId() {
        return String.valueOf(this.employeeCSV.getId());
    }

    @Override
    public String getName() {
        return this.employeeCSV.getFirstname() + " " + this.employeeCSV.getLastname();
    }

    @Override
    public String getEmail() {
        return this.employeeCSV.getEmail();
    }

    @Override
    public List<String> getAuthorities() {
        return Arrays.asList(DEFAULT_AUTHORITY);
    }

}
