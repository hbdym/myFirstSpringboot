package com.hbdym.demo.service;

import com.hbdym.demo.service.dto.TeacherDTO;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

import java.util.Optional;

/**
 * Service Interface for managing Teacher.
 */
public interface TeacherService {

    /**
     * Save a teacher.
     *
     * @param teacherDTO the entity to save
     * @return the persisted entity
     */
    TeacherDTO save(TeacherDTO teacherDTO);

    /**
     * Get all the teachers.
     *
     * @param pageable the pagination information
     * @return the list of entities
     */
    Page<TeacherDTO> findAll(Pageable pageable);


    /**
     * Get the "id" teacher.
     *
     * @param id the id of the entity
     * @return the entity
     */
    Optional<TeacherDTO> findOne(Long id);

    /**
     * Delete the "id" teacher.
     *
     * @param id the id of the entity
     */
    void delete(Long id);
}
