package com.anas.teacher.service;

import com.anas.teacher.dto.APIResponseDto;
import com.anas.teacher.dto.TeacherDto;

public interface TeacherService {
    APIResponseDto getTeacherById(Long id);

}
