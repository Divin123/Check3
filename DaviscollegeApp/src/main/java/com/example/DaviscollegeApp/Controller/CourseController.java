package com.example.DaviscollegeApp.Controller;

import com.example.DaviscollegeApp.Repository.CourseRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class CourseController {
    @Autowired
    private CourseRepository courseRepository;
    @GetMapping("/course")
    public String getAllCourses(Model model){
        model.addAttribute("courseList", courseRepository.findAll());
        return "Course";
    }

}
