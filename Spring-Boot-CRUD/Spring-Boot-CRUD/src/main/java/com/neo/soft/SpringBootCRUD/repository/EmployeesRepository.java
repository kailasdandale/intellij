package com.neo.soft.SpringBootCRUD.repository;

import com.neo.soft.SpringBootCRUD.model.Employees;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface EmployeesRepository extends JpaRepository<Employees,String> {
   Optional<Employees> findByName(String name);
}
