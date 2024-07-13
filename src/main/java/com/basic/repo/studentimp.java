package com.basic.repo;

import com.basic.model.Student;
import org.springframework.data.jpa.repository.JpaRepository;

public interface studentimp extends JpaRepository<Student,Long> {
}
