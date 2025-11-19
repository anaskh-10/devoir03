package com.anas.teacher.service;

import com.anas.teacher.dto.DepartmentDto;
import org.springframework.stereotype.Component;

@Component
public class DeptFallBack implements APIClient{
    @Override
    public DepartmentDto getDepByCode(String departmentCode) {
        return null;
    }
}
