package com.emsBackend.Ems.controller;

import com.emsBackend.Ems.dto.EmployeeDto;
import com.emsBackend.Ems.mapper.EmployeeMapper;
import com.emsBackend.Ems.service.EmployeeService;
import lombok.AllArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.List;

//@Corontller
@RestController
@RequestMapping("/api/employees")
@AllArgsConstructor
public class EmployeeController {

    private EmployeeService employeeService;

    //Build Add Employee REST API
    @PostMapping
    public ResponseEntity<EmployeeDto> createEmployee(@RequestBody  EmployeeDto employeeDto){
      EmployeeDto savedEmployee=  employeeService.createEmployee(employeeDto);
      return new ResponseEntity<>(savedEmployee, HttpStatus.CREATED);
    }
    @GetMapping("/{id}")
    public  ResponseEntity<EmployeeDto> getEmployeeById(@PathVariable("id") Long employeeId){
       EmployeeDto employeeDto= employeeService.getEmployeeById(employeeId);
        return ResponseEntity.ok(employeeDto);
    }
    @GetMapping()
    public ResponseEntity<List<EmployeeDto>> getEmployee(){
        List<EmployeeDto> employees=employeeService.getallEmployee();
    return ResponseEntity.ok(employees);
    }
    @PutMapping("{id}")
    public ResponseEntity<EmployeeDto> udpatedEmployee(@PathVariable("id") Long employeeId, @RequestBody EmployeeDto updateEmployee){
     EmployeeDto employeeDto=employeeService.updateEmployee(employeeId, updateEmployee);

        return ResponseEntity.ok(employeeDto);
    }

    @DeleteMapping("{id}")
    public ResponseEntity<String> deleteEmployee(@PathVariable("id")Long employeeID){
       employeeService.deleteEmployee(employeeID);
        return ResponseEntity.ok("Employee Deleted Successfully");
    }
}
