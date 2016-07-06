package com.malsolo.design.patterns.structural.adapter;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class AdapterDemo {

    public static void main(String[] args) {

        BasicPrincipal basicPrincipal = new BasicPrincipal("1", "Javier", "jbbarquero@gmail.com", Arrays.asList("ADMIN"));
        LdapInfo ldapInfo = new LdapInfo("another", "Anthony", "Other", "another@mail.es", Arrays.asList("user"));
        EmployeeCSV employeeCSV = new EmployeeCSV(2, "Frank", "Grimes", "graimito@homer.dixit");

        List<Principal> principals = new ArrayList<>();

        principals.add(basicPrincipal);
        principals.add(new LdapToPrincipalAdapter(ldapInfo));
        principals.add(new EmployeeCsvToPrincipalAdapter(employeeCSV));

        principals.stream().forEach(System.out::println);

    }

}
