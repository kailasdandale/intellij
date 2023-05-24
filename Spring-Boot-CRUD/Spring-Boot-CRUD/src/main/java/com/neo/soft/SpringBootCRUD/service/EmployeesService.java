package com.neo.soft.SpringBootCRUD.service;

import com.neo.soft.SpringBootCRUD.model.Employees;

import java.util.List;

public interface EmployeesService {
    Employees createEmployees(Employees employees);

    List<Employees> getAllEmployees();

    Employees getByName(String name);

    String deleteById(String id);

    Employees updateEmployees(String id, Employees employees);

    Employees getById(String id);
}
