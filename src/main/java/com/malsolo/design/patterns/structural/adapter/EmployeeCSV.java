package com.malsolo.design.patterns.structural.adapter;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class EmployeeCSV {

    private int id;

    private String firstname, lastname, email;

}
