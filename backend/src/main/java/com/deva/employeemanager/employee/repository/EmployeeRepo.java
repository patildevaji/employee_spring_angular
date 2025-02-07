package com.deva.employeemanager.employee.repository;

import com.deva.employeemanager.employee.model.Employee;
import org.springframework.data.jpa.repository.JpaRepository;

public interface EmployeeRepo extends JpaRepository<Employee, Long> {
}
