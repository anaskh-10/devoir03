package com.anas.teacher.restControllers;

import com.anas.teacher.dto.APIResponseDto;
import com.anas.teacher.dto.TeacherDto;
import com.anas.teacher.service.TeacherService;
import lombok.AllArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/teachers")
@AllArgsConstructor
public class TeacherController {
    private TeacherService teacherService;
    @GetMapping("{id}")
        public ResponseEntity<APIResponseDto> getTeacherById(@PathVariable("id")Long id){
            return new ResponseEntity<APIResponseDto>(
                    teacherService.getTeacherById(id), HttpStatus.OK
            );
        }
}
