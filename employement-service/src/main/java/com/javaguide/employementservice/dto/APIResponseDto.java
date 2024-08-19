package com.javaguide.employementservice.dto;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Setter
@Getter
@AllArgsConstructor
@NoArgsConstructor
public class APIResponseDto {

    private EmployeeDto employeeDto;
    private DepartmentDto departmentDto;
}
