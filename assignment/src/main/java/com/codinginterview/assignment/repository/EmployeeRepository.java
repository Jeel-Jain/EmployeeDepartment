package com.codinginterview.assignment.repository;

import com.codinginterview.assignment.modal.Employee;
import org.springframework.data.jpa.repository.JpaRepository;

public interface EmployeeRepository extends JpaRepository<Employee,String> {
}
