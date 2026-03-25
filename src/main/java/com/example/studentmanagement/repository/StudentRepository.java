package com.example.studentmanagement.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import java.util.List;

import com.example.studentmanagement.model.Student;

public interface StudentRepository extends JpaRepository<Student, Integer> {

	@Query(value = "SELECT s.id, s.name, s.email, s.age, cl.name, c.title, e.start_date, e.end_date " +
		       "FROM student s " +
		       "JOIN class cl ON s.class_id = cl.id " +
		       "JOIN enrollment e ON s.id = e.student_id " +
		       "JOIN course c ON e.course_id = c.id",
		       nativeQuery = true)
		List<Object[]> getFullStudentInfo();
}