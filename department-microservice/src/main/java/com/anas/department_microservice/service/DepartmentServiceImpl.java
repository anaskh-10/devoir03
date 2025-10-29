package com.anas.department_microservice.service;

import com.anas.department_microservice.dto.DepartmentDto;
import com.anas.department_microservice.entities.Department;
import com.anas.department_microservice.repos.DepartmentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class DepartmentServiceImpl implements Departmentservice {
    @Autowired
    DepartmentRepository departmentRepository;

    @Override
    public DepartmentDto getDepartmentByCode(String depCode) {
        Department dep = departmentRepository.findByDepCode(depCode);
        DepartmentDto departmentDto = new DepartmentDto(
                dep.getId(),
                dep.getDepName(),
                dep.getDepCode()
        );
        return departmentDto;
    }
}
