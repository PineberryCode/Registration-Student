package project.school;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import project.school.model.Student;
import project.school.repository.StudentRepository;

@SpringBootApplication
public class ProjectTApplication implements CommandLineRunner {

	public static void main(String[] args) {
		SpringApplication.run(ProjectTApplication.class, args);
	}

	@Autowired
	private StudentRepository studentRepository;

	@Override
	public void run(String... args) throws Exception {
		/*Student student = new Student(74349903, 9432393392L, 1, "Jorge Danny", "Luna Caycho");
		studentRepository.save(student);
		Student student02 = new Student(10359903, 1432293392L, 2, "Random Random", "Random Random");
		studentRepository.save(student02);*/
	}
}
