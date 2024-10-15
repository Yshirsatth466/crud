package com.example.demo.serviceempl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.Expception.ResourcenotfoundException;

import com.example.demo.model.Employee;
import com.example.demo.repository.EmployeeRepository;
import com.example.demo.serviceI.Emplservice;

@Service
public class Serviceimpl implements Emplservice {

    @Autowired
    private EmployeeRepository employeeRepository;

    @Override
    public Employee createEmployee(Employee employee) {
        return employeeRepository.save(employee);
    }

    @Override
    public List<Employee> getAllEmployees() {
        return employeeRepository.findAll();
    }

    @Override
    public Employee getEmployeeById(long id) {
        return employeeRepository.findById(id)
                .orElseThrow(() -> new  ResourcenotfoundException("Employee does not exist with id: " + id));
    }

    @Override
    public Employee updateEmployeeById(long id, Employee employeeDetails) {
        Employee employee = employeeRepository.findById(id)
                .orElseThrow(() -> new ResourcenotfoundException("Employee does not exist with id: " + id));

        employee.setFirstname(employeeDetails.getFirstname());
        employee.setLastName(employeeDetails.getLastName());
        employee.setEmail(employeeDetails.getEmail());
        // Save the updated employee
        return employeeRepository.save(employee);
    }

    @Override
    public boolean existsById(long id) {
        return employeeRepository.existsById(id);
    }
   
    @Override
    public void deleteEmployeeById(long id) {
        if (!existsById(id)) {
            throw new  ResourcenotfoundException("Employee does not exist with id: " + id);
        }
        employeeRepository.deleteById(id);
    }

    @Override
    public void deleteAllEmployees() {
        employeeRepository.deleteAll();
    }
}
