package bigproject.sms.controller;

import bigproject.sms.dto.StudentDto;
import bigproject.sms.entity.Student;
import bigproject.sms.service.StudentService;
import jakarta.validation.Valid;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

import java.util.List;

@Controller
@Setter
@Getter
@AllArgsConstructor
@NoArgsConstructor
public class StudentController {
   @Autowired
    private StudentService studentService;
   @GetMapping("/students")
   public String ListStudent(Model model){
     List<StudentDto> ne=studentService.getallstduent();
     model.addAttribute("students",ne);
     return "students";
   }
   @GetMapping("/students/new")
   public String newStudent(Model model)
   {
       StudentDto studentDto=new StudentDto();
       model.addAttribute("student",studentDto);
       return "create_student";
   }
   @PostMapping("/students")
   public String saveStudent(@Valid @ModelAttribute("student") StudentDto studentDto, BindingResult bindingResult,Model model){
       if(bindingResult.hasErrors()){
           model.addAttribute("student",studentDto);
           return "create_student";
       }
       studentService.createStudent(studentDto);
       return "redirect:/students";
   }
}
