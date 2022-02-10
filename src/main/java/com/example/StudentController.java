package com.example;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class StudentController {
@Autowired
public StudentRepository studentRepository;
	@GetMapping("/")
	public ModelAndView create() {
		
		return new ModelAndView("create_page");
	}
	
	@PostMapping("save")
	public ModelAndView save(@ModelAttribute StudentModel sm) {
		Map<String, Object> map = new HashMap<String, Object>();
		sm = studentRepository.save(sm);
		map.put("student", sm);
		return new  ModelAndView("redirect:/","data",map);
		
	}
	
	@GetMapping("/show")
	public ModelAndView showData() {
		Map<String, Object> map = new HashMap<String, Object>();
		List<StudentModel> sl = (List<StudentModel> ) studentRepository.findAll();
		map.put("stu", sl);
		return new ModelAndView("show_page","data",map);
	}
}
