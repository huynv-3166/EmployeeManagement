package com.example.employee_management;

import org.springframework.stereotype.Service;

@Service
public class UtilityService {

    private final EmployeeNameFormatter employeeNameFormatter;

    public UtilityService(EmployeeNameFormatter employeeNameFormatter) {
        this.employeeNameFormatter = employeeNameFormatter;
    }

    public String formatEmployeeName(String name) {
        return employeeNameFormatter.format(name);
    }
}
