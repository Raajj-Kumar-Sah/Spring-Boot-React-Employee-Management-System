package com.emsBackend.Ems.mapper;

import com.emsBackend.Ems.dto.EmployeeDto;
import com.emsBackend.Ems.entity.Employee;

public class EmployeeMapper {

    //It will map employee jpa entity to employee dto.....
    public static EmployeeDto mapToEmployeeDto(Employee employee){
        return  new EmployeeDto(
                employee.getId(),
                employee.getFirstName(),
                employee.getLastName(),
                employee.getEmail()
        );
    }
    public static Employee mapToEmployee(EmployeeDto employeeDto){
        return new Employee(
                employeeDto.getId(),
                employeeDto.getFirstName(),
                employeeDto.getLastName(),
                employeeDto.getEmail()
        );
    }
}
