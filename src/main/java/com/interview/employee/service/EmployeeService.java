package com.interview.employee.service;

import com.interview.employee.model.Employee;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.atomic.AtomicInteger;

/**
 * Service layer to process business logic
 */
@Service
public class EmployeeService
{
    private static Map<Integer, Employee> employeeStorage = new ConcurrentHashMap<>();
    private static AtomicInteger idCounter = new AtomicInteger(0);

    public Employee getEmployee(int id)
    {
        return employeeStorage.get(id);
    }

    public List<Employee> getEmployees()
    {
        return new ArrayList<>(employeeStorage.values());
    }

    public Employee createEmployee(Employee newEmployee)
    {
        Integer newId = idCounter.incrementAndGet();
        newEmployee.setId(newId);
        employeeStorage.put(newId, newEmployee);
        return newEmployee;
    }

    public Employee updatedEmployee(Integer id, Employee updatedEmployee)
    {
        if(!employeeStorage.containsKey(id))
        {
            return null;
        }
        updatedEmployee.setId(id);
        employeeStorage.put(id, updatedEmployee);
        return updatedEmployee;
    }

    public void deleteEmployee(Integer deletedEmployee)
    {
        employeeStorage.remove(deletedEmployee);
    }
}
