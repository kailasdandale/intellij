package com.neo.soft.SpringBootCRUD.model;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.validation.constraints.NotNull;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Employees {
    @Id
    private String id;
    @NotNull(message = "The Name of the employee is required")
    private String name;
    @NotNull(message = "The Age of the employee is required")
    private int age;
    @NotNull(message = "The Salary of the employee is required")
    private double salary;
}
