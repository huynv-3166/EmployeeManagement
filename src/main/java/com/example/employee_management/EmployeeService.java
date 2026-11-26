package com.example.employee_management;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Service;

@Service
public class EmployeeService {

    private final List<Employee> employees = new ArrayList<>();
    private final UtilityService utilityService;

    public EmployeeService(UtilityService utilityService) {
        this.utilityService = utilityService;
    }

    public List<Employee> getAllEmployees() {
        return List.copyOf(employees);
    }

    public Employee addEmployee(Employee employee) {
        employee.setName(utilityService.formatEmployeeName(employee.getName()));
        employees.add(employee);
        return employee;
    }
}
