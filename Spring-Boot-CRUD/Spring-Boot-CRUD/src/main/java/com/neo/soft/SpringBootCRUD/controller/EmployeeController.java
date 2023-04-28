package com.neo.soft.SpringBootCRUD.controller;

import com.neo.soft.SpringBootCRUD.model.Employees;
import com.neo.soft.SpringBootCRUD.service.EmployeesService;
import jakarta.validation.Valid;
import lombok.Builder;
import lombok.Data;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@Slf4j
@RequestMapping("/api/v1")
public class EmployeeController {

    @Autowired
    private EmployeesService employeesService;

    @PostMapping
    public Employees createEmployees(@RequestBody @Valid Employees employees) {
        return this.employeesService.createEmployees(employees);
    }

    @GetMapping
    public List<Employees> getAllEmployees() {

        return this.employeesService.getAllEmployees();
    }

    @GetMapping("/{name}")
    public Employees getBtName(@PathVariable String name) {

        return this.employeesService.getByName(name);
    }

    @DeleteMapping("/{id}")
    public String deleteById(@PathVariable String id) {

        return this.employeesService.deleteById(id);
    }

    @PutMapping("/{id}")
    public Employees updateEmployees(@PathVariable String id, @RequestBody Employees employees) {

        return this.employeesService.updateEmployees(id, employees);
    }




}
