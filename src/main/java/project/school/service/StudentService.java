package project.school.service;

import project.school.model.Student;

import java.util.List;

public interface StudentService {
    List<Student> getAllStudent();
    Student saveStudent(Student student);
    Student getStudentByDNI(Integer dni);
    Student updateStudent(Student student);

    void deleteStudentByDNI(Integer dni);
}
