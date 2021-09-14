package fi.syksy2021.Week2AllExes.web;

import java.util.ArrayList;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import fi.syksy2021.Week2AllExes.domain.Student;

@Controller
public class StudentController {
	
	@RequestMapping("/Students")
	public String showStudents (Model model) {
		ArrayList<Student> studentsList = new ArrayList<>();
		studentsList.add(new Student("Tony", "Laaksonen"));
		studentsList.add(new Student("Lotta", "Ala-Kulju"));
		
		model.addAttribute("students",studentsList);
		
		return "studentList";
				
		
	}
	

}
