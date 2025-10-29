package com.anas.department_microservice.repos;

import com.anas.department_microservice.dto.DepartmentDto;
import com.anas.department_microservice.entities.Department;
import org.springframework.data.jpa.repository.JpaRepository;

public interface DepartmentRepository extends JpaRepository <Department,Long>{
    Department findByDepCode(String depCode);

}
