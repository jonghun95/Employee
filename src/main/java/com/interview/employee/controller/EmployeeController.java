package com.interview.employee.controller;

import com.interview.employee.model.Employee;
import com.interview.employee.service.EmployeeService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import java.util.List;

/**
 * Main controller to process CRUD for employees
 */
@RestController
public class EmployeeController
{
    Logger logger = LoggerFactory.getLogger(EmployeeController.class);

    EmployeeService service;

    @GetMapping(
        value = "/employees",
        produces = { "application/json"}
    )
    public List<Employee> getEmployees()
    {
        return service.getEmployees();
    }

    @GetMapping(
        value = "/employees/{id}",
        produces = { "application/json"}
    )
    public Employee getEmployees(@PathVariable int id)
    {
        logger.info("Get employee {}", id);
        return service.getEmployee(id);
    }

    @PostMapping(value = "/employees",
        produces = { "application/json"}
        )
    public Employee newEmployee(@RequestBody @Valid Employee newEmployee) {
        logger.info("Create {}", newEmployee);
        return service.createEmployee(newEmployee);
    }

    @PutMapping(value = "/employees/{id}",
        produces = { "application/json"}
        )
    public Employee updateEmployee(@RequestBody @Valid Employee updatedEmployee, @PathVariable int id) {
        logger.info("Update {} {}", id, updatedEmployee);
        return service.updatedEmployee(id, updatedEmployee);
    }

    @DeleteMapping("/employees/{id}")
    public void deleteEmployee(@PathVariable int id) {
        logger.info("Delete {}", id);
        service.deleteEmployee(id);
    }

    @Autowired
    public void setService(EmployeeService service)
    {
        this.service = service;
    }
}
