package com.emsBackend.Ems.service.impl;

import com.emsBackend.Ems.dto.EmployeeDto;
import com.emsBackend.Ems.entity.Employee;
import com.emsBackend.Ems.exception.ResourceNotFoundException;
import com.emsBackend.Ems.mapper.EmployeeMapper;
import com.emsBackend.Ems.repository.EmployeeRepository;
import com.emsBackend.Ems.service.EmployeeService;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.PostMapping;

import java.util.List;
import java.util.stream.Collectors;

@AllArgsConstructor
@Service
public class EmployeeServiceImpl implements EmployeeService {
    private EmployeeRepository employeeRepository;

    @Override
    public EmployeeDto createEmployee(EmployeeDto employeeDto) {
        Employee employee= EmployeeMapper.mapToEmployee(employeeDto);
       Employee savedEmployee= employeeRepository.save(employee);
        return EmployeeMapper.mapToEmployeeDto(savedEmployee);
    }

    @Override
    public EmployeeDto getEmployeeById(Long employeeId) {

       Employee employee= employeeRepository.findById(  employeeId).orElseThrow(()-> new ResourceNotFoundException("Employees not found with the given id: "+employeeId));
        return EmployeeMapper.mapToEmployeeDto(employee);
    }

    @Override
    public List<EmployeeDto> getallEmployee() {
        List<Employee> employees=employeeRepository.findAll();
        return employees.stream().map((employee)->EmployeeMapper.mapToEmployeeDto(employee)).collect(Collectors.toList());
    }



    @Override
        public EmployeeDto updateEmployee(Long employeeId, EmployeeDto updatedEmployee) {
        Employee employee= employeeRepository.findById(employeeId).orElseThrow(()->new ResourceNotFoundException("Employee is not exits with the given id: "+ employeeId));
//        employee.setId(updatedEmployee.getId());
        employee.setFirstName(updatedEmployee.getFirstName());
        employee.setLastName(updatedEmployee.getLastName());
        employee.setEmail(updatedEmployee.getEmail());
    Employee updatedEmployeeObj=employeeRepository.save(employee);
        return EmployeeMapper.mapToEmployeeDto(updatedEmployeeObj);
    }

    @Override
    public void deleteEmployee(Long employeeId) {
        Employee employee=employeeRepository.findById(employeeId).orElseThrow(()->new ResourceNotFoundException("Employee not Found with this id: "+ employeeId));
        employeeRepository.deleteById(employeeId);
    }


}
