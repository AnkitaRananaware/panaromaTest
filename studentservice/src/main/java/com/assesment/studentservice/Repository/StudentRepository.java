package com.assesment.studentservice.Repository;

import com.assesment.studentservice.Entity.Student;
import org.springframework.data.jpa.repository.JpaRepository;

public interface StudentRepository extends JpaRepository<Student, Long> {
}
