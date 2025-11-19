package com.anas.teacher.service;

import com.anas.teacher.dto.DepartmentDto;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

//@FeignClient(url = "http://localhost:8081", value = "DEPARTMENT")
@FeignClient(name = "DEPARTMENT")
//@FeignClient(name = "DEPARTMENT", fallback = DeptFallBack.class)

public interface APIClient {

    @GetMapping("api/departments/{department-code}")
    DepartmentDto getDepByCode(@PathVariable("department-code") String departmentCode );


}
