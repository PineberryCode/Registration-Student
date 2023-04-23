package project.school.controller;

import org.springframework.ui.Model;
import jakarta.servlet.http.HttpServletRequest;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ModelAttribute;
import project.school.service.StudentService;

@ControllerAdvice
public class GlobalCtrlAdvice {
    private StudentService studentService;
    @ModelAttribute
    public void addBaseUrl(Model model, HttpServletRequest request) {
        String baseurl = request.getContextPath() + "/form-student";
        model.addAttribute("baseurl", baseurl);
    }

}
