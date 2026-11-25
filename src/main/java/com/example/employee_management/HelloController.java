package com.example.employee_management;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {

    private final UtilityService utilityService;

    public HelloController(UtilityService utilityService) {
        this.utilityService = utilityService;
    }

    @GetMapping("/hello")
    public String hello() {
        return utilityService.formatEmployeeName("  Hello   World  ");
    }
}
