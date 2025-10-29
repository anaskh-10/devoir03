package com.anas.teacher.service;

import com.anas.teacher.dto.APIResponseDto;
import com.anas.teacher.dto.DepartmentDto;
import com.anas.teacher.dto.TeacherDto;
import com.anas.teacher.entities.Teacher;
import com.anas.teacher.repos.TeacherRepository;
import lombok.AllArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.reactive.function.client.WebClient;

@AllArgsConstructor
@Service
public class TeacherServiceImpl implements TeacherService {
    @Autowired
    private TeacherRepository teacherRepository;
    @Autowired
    private WebClient webClient;
    @Autowired
    private APIClient apiClient;
    @Override
    public APIResponseDto getTeacherById(Long id) {
        Teacher teacher = teacherRepository.findById(id).get();
//        DepartmentDto departmentDto = webClient.get()
//                .uri("http://localhost:8081/api/departments/" +
//                        teacher.getDepCode())
//                .retrieve()
//                .bodyToMono(DepartmentDto.class)
//                .block();
        DepartmentDto departmentDto = apiClient.getDepByCode(teacher.getDepCode());

        TeacherDto teacherDto = new TeacherDto(
                teacher.getId(),
                teacher.getFirstName(),
                teacher.getLastName(),
                teacher.getDepCode()
        );
        APIResponseDto apiResponseDto = new APIResponseDto();
        apiResponseDto.setTeacherDto(teacherDto);
        apiResponseDto.setDepartmentDto(departmentDto);
        return apiResponseDto;
    }


}
