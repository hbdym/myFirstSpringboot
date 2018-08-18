package com.hbdym.demo.service.mapper;

import com.hbdym.demo.domain.*;
import com.hbdym.demo.service.dto.StudentDTO;

import org.mapstruct.*;

/**
 * Mapper for the entity Student and its DTO StudentDTO.
 */
@Mapper(componentModel = "spring", uses = {TeacherMapper.class})
public interface StudentMapper extends EntityMapper<StudentDTO, Student> {

    @Mapping(source = "relation.id", target = "relationId")
    @Mapping(source = "relation.name", target = "relationName")
    StudentDTO toDto(Student student);

    @Mapping(source = "relationId", target = "relation")
    Student toEntity(StudentDTO studentDTO);

    default Student fromId(Long id) {
        if (id == null) {
            return null;
        }
        Student student = new Student();
        student.setId(id);
        return student;
    }
}
