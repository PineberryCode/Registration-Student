package project.school.service.implement;

import org.springframework.stereotype.Service;
import project.school.model.Student;
import project.school.repository.StudentRepository;
import project.school.service.StudentService;

import java.util.List;

@Service
public class StudentServiceImplements implements StudentService {
    private StudentRepository studentRepository;

    public StudentServiceImplements (StudentRepository studentRepository) {
        super();
        this.studentRepository = studentRepository;
    }

    /*Down: Add students*/
    @Override
    public List<Student> getAllStudent() {
        return studentRepository.findAll();
    }

    @Override
    public Student saveStudent(Student student) {
        return studentRepository.save(student);
    }

    @Override
    public Student getStudentByDNI(Integer dni) {
        return studentRepository.findById(dni).get();
    }

    @Override
    public Student updateStudent(Student student) { return studentRepository.save(student); }

    @Override
    public void deleteStudentByDNI(Integer dni) { studentRepository.deleteById(dni); }
}
