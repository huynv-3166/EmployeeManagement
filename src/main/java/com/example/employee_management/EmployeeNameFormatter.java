package com.example.employee_management;

public class EmployeeNameFormatter {

    public String format(String name) {
        return name.trim().replaceAll("\\s+", " ");
    }
}
