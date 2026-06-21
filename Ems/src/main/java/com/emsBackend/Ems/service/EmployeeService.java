package com.emsBackend.Ems.service;

import com.emsBackend.Ems.dto.EmployeeDto;

import java.util.List;

public interface EmployeeService {
    EmployeeDto createEmployee(EmployeeDto employeeDto);
    EmployeeDto getEmployeeById(Long employeeId);
    List<EmployeeDto> getallEmployee();
    EmployeeDto updateEmployee(Long employeeId, EmployeeDto updatedEmployee);
    void deleteEmployee(Long employeeId);
}
