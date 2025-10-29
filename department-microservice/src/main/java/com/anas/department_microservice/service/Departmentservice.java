package com.anas.department_microservice.service;

import com.anas.department_microservice.dto.DepartmentDto;

public interface Departmentservice {
    DepartmentDto getDepartmentByCode(String depCode);

}
