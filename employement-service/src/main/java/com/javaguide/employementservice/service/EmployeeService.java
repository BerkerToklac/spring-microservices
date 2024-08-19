package com.javaguide.employementservice.service;

import com.javaguide.employementservice.dto.APIResponseDto;
import com.javaguide.employementservice.dto.EmployeeDto;

public interface EmployeeService {

    EmployeeDto saveEmployee(EmployeeDto employeeDto);

    APIResponseDto getEmployeeById(Long employeeId);
}
