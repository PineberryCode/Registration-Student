package project.school.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import project.school.model.Student;

public interface StudentRepository extends JpaRepository<Student, Integer> {

}
