package com.nexthoughts.spring.mvc.demo.web.controller;

import com.nexthoughts.spring.mvc.demo.classes.StudentCommand;
import com.nexthoughts.spring.mvc.demo.services.StudentService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

@Controller
@RequestMapping(value = "/student")
public class StudentController {

    private final Logger logger = LoggerFactory.getLogger(StudentController.class);

    private StudentService studentService;

    @Autowired
    StudentController(StudentService studentService) {
        this.studentService = studentService;
    }

    @RequestMapping(value = "/allStudents", method = RequestMethod.GET)
    public ModelAndView allStudents() {
        List<StudentCommand> studentCommandList = new ArrayList<>();
        StudentCommand studentCommand = null;
        for (int counter = 0; counter < 20; counter++) {
            studentCommand = new StudentCommand(counter, "Demo StudentCommand " + counter);
            studentCommandList.add(studentCommand);
        }
        for (StudentCommand studentCommand1 :
                studentCommandList) {
            System.out.println(studentCommand1.getId());
            System.out.println(studentCommand.getFirstName());
        }
        Map<String, List<StudentCommand>> model = new LinkedHashMap<>();
        model.put("studentCommandList", studentCommandList);
        ModelAndView modelAndView = new ModelAndView("studentCommand/allStudents", model);
        return modelAndView;
    }

    @RequestMapping(value = "/create", method = RequestMethod.GET)
    public ModelAndView createStudentForm() {
        logger.info("Executing GET method for /studentCommand/create");
        logger.info("==========================================");
        StudentCommand studentCommand = new StudentCommand();
        ModelAndView modelAndView = new ModelAndView();
        modelAndView.setViewName("studentCommand/create");
        modelAndView.addObject("studentCommand", studentCommand);
        return modelAndView;
    }

    @RequestMapping(value = "/create", method = RequestMethod.POST)
    public ModelAndView saveStudent(StudentCommand studentCommand) {
        logger.info("Executing POST method for /studentCommand/create");
        logger.info("==========================================");
        logger.info(studentCommand.getFirstName());
        logger.info(studentCommand.getLastName());
        logger.info(studentCommand.getEmailAddress());
        int studentId = studentService.create(studentCommand);
        logger.info("================StudentCommand Saved with Id - " + studentId + " ==========================");
        logger.info("==========================================");
        ModelAndView modelAndView = new ModelAndView();
        modelAndView.setViewName("studentCommand/create");
        modelAndView.addObject("studentCommand", studentCommand);
        return modelAndView;
    }
}
