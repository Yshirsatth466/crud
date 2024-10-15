package com.example.demo.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import com.example.demo.model.Employee;
import com.example.demo.serviceI.Emplservice;


@RestController
@RequestMapping("/api/emp/data")
public class EmployeeController {
    
    @Autowired
    private Emplservice emplService;
    
    // Display all employees
    @GetMapping
    public List<Employee> getAllEmp() {
        return emplService.getAllEmployees();
    }
    
    // Create a new employee
    @PostMapping
    public Employee createEmployee(@RequestBody Employee employee) {
        return emplService.createEmployee(employee);
    }

    
    // Get an employee by ID
    @GetMapping("/{id}")
    public ResponseEntity<Employee> getEmployeeById(@PathVariable long id) {
        Employee employee = emplService.getEmployeeById(id);
        return ResponseEntity.ok(employee);
    }
    
    // Update an employee by ID
 // Update an existing employee by ID
    @PutMapping("/{id}")
    public ResponseEntity<Employee> updateEmployeeById(@PathVariable long id, @RequestBody Employee employeeDetails) {
        Employee updatedEmployee = emplService.updateEmployeeById(id, employeeDetails);
        return ResponseEntity.ok(updatedEmployee);
    }

    
    // Delete an employee by ID
 // Delete an employee by ID
    @DeleteMapping("/{id}")
    public ResponseEntity<String> deleteEmployeeById(@PathVariable("id") long id) {
        if (!emplService.existsById(id)) {
            return ResponseEntity.status(HttpStatus.NOT_FOUND).body("Employee not found");
        }
        emplService.deleteEmployeeById(id);
        return ResponseEntity.ok("Employee deleted successfully.");
    }

    @DeleteMapping("/delete")
    public ResponseEntity<String> deleteAllEmployees() {
        emplService.deleteAllEmployees();
        return ResponseEntity.ok("All employees deleted successfully.");
    }
}
