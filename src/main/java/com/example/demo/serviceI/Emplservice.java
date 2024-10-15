package com.example.demo.serviceI;

import java.util.List;
import com.example.demo.model.Employee;

public interface Emplservice {
    
    
    Employee createEmployee(Employee employee);
    
   
    List<Employee> getAllEmployees();
    
    
    Employee getEmployeeById(long id);
    
    
    Employee updateEmployeeById(long id, Employee employeeDetails);
    
    boolean existsById(long id);
    void deleteEmployeeById(long id); 
    
    void deleteAllEmployees();
}
