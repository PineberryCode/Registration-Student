package project.school.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import project.school.model.Student;
import project.school.service.StudentService;

@Controller
public class Ctrl {
    private StudentService studentService;

    @Autowired
    public Ctrl (StudentService studentService) {
        super();
        this.studentService = studentService;
    }

    @GetMapping("/")
    public String listStudent(Model model) {
        model.addAttribute("showStudent", studentService.getAllStudent());
        model.addAttribute("showInput", false);
        return "show-student";
    }

    @GetMapping("/form-student")
    public String addStudent(Model model) {
        Student student = new Student();
        model.addAttribute("dni", "");
        model.addAttribute("codStudent", "");
        model.addAttribute("numOrden", "");
        model.addAttribute("names", "");
        model.addAttribute("lastname", "");
        model.addAttribute("register", "");
        return "form-student";
    }

    @PostMapping("/register")
    public String saveStudent(@ModelAttribute("student") Student student) {
        studentService.saveStudent(student);
        return "redirect:/";
    }
    @GetMapping("/edit/{dni}")
    public String getDNI(@PathVariable Integer dni, @ModelAttribute("student") Student student, Model model) {
        model.addAttribute("student", studentService.getStudentByDNI(dni));
        model.addAttribute("showInput", true);
        model.addAttribute("showStudent", studentService.getAllStudent());
        return "show-student";
    }
    @PostMapping("/update/{dni}")
    public String updateStudent(@PathVariable Integer dni, @ModelAttribute("student") Student student) {
        Student existingStudent = studentService.getStudentByDNI(dni);
        existingStudent.setDni(dni);
        existingStudent.setCodStudent(student.getCodStudent());
        existingStudent.setNumOrden(student.getNumOrden());
        existingStudent.setNames(student.getNames());
        existingStudent.setLastname(student.getLastname());
        //save updated
        studentService.updateStudent(existingStudent);
        return "redirect:/";
    }
    @GetMapping("/remove/{dni}")
    public String deleteStudent(@PathVariable Integer dni) {
        studentService.deleteStudentByDNI(dni);
        return "redirect:/";
    }

}
