package com.neo.soft.SpringBootCRUD.service;

import com.neo.soft.SpringBootCRUD.exception.EmployeeNotFoundException;
import com.neo.soft.SpringBootCRUD.model.Employees;
import com.neo.soft.SpringBootCRUD.repository.EmployeesRepository;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Objects;
import java.util.UUID;

@Service
@Slf4j
public class EmployeesServiceImpl implements EmployeesService {

    @Autowired
    private EmployeesRepository employeesRepository;

    @Override
    public Employees createEmployees(Employees employees) {
        employees.setId(UUID.randomUUID().toString());
        return employeesRepository.save(employees);
    }

    @Override
    public List<Employees> getAllEmployees() {
        return employeesRepository.findAll();
    }

    @Override
    public Employees getByName(String name) {

        if (employeesRepository.findByName(name).isPresent()) {
            return employeesRepository.findByName(name).get();
        }
        throw new EmployeeNotFoundException("No employees by " + name + " name");
    }

    @Override
    public String deleteById(String id) {
        if (employeesRepository.findById(id).isPresent()) {
            employeesRepository.deleteById(id);
            return "Deleted !!";
        }
        throw new EmployeeNotFoundException("Data not present to delete by Id " + id);
    }

    @Override
    public Employees updateEmployees(String id, Employees employees) {
        employeesRepository.findById(id).flatMap(emp -> {
            emp.setName(Objects.nonNull(employees.getName()) ? employees.getName() : emp.getName());
            emp.setAge(Objects.nonNull(employees.getName()) ? employees.getAge() : emp.getAge());
            emp.setSalary(Objects.nonNull(employees.getAge()) ? employees.getSalary() : emp.getSalary());
            Employees employee = employeesRepository.save(emp);
            log.info("Employees saved " + employee);
            return employeesRepository.findById(id);
        });
        return employeesRepository.findById(id).orElseThrow();
    }

    @Override
    public Employees getById(String id) {

        if (employeesRepository.findById(id).isPresent()) {
            return employeesRepository.findById(id).get();
        }
        throw new EmployeeNotFoundException("No employees present for id " + id);
    }
}