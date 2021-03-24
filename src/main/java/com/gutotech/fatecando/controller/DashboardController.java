package com.gutotech.fatecando.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.gutotech.fatecando.model.Course;
import com.gutotech.fatecando.service.CourseService;
import com.gutotech.fatecando.service.DisciplineService;
import com.gutotech.fatecando.service.InstitutionService;

@Controller
@RequestMapping("dashboard")
public class DashboardController {

	@Autowired
	private CourseService courseService;

	@Autowired
	private DisciplineService disciplineService;

	@Autowired
	private InstitutionService institutionService;

	@GetMapping
	public String home(Model model) {
//		model.addAttribute("disciplines", disciplineService.findAllAccessed());
//		model.addAttribute("courses", courseService.findAll());
//		model.addAttribute("institutions", institutionService.findAll());
//		return "dashboard";

		Course course = courseService.findById(1L);

		model.addAttribute("course", course);
		model.addAttribute("disciplines", disciplineService.findAllByCourse(course));
		model.addAttribute("recentDisciplines", disciplineService.findAllAccessed());

		return "disciplines/course-details";
	}

}
