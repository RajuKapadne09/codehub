package com.kapadne.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.kapadne.model.Subject;

public interface SubjectDao extends JpaRepository<Subject, Long>
{

}