package com.yunicorn.yearbook.web;

import com.yunicorn.yearbook.dao.StudentDao;
import com.yunicorn.yearbook.domain.Student;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

/**
 * Created by fadlymunandar on 8/26/17.
 */

@Controller
@RequestMapping(value = "/student")
public class StudentController {

    private StudentDao studentDao;

    @RequestMapping(method = RequestMethod.GET)
    public String addStudent(Model model, @ModelAttribute("student") Student student,
                             @RequestParam(value = "saved", required = false) boolean isSaved) {
        if (isSaved) {
            model.addAttribute("saved", true);
        }
        model.addAttribute("activeStudent", "active-menu");
        return "addstudent";
    }

    @RequestMapping(value = "/savestudent", method = RequestMethod.POST)
    public String saveStudent(Student student) {
        if (student != null) {
            String fName = student.getFirstName();
            String lName = student.getLastName();

            studentDao.addStudent(student);
            return "redirect:/student/add?saved=true";
        }
        return "redirect:/student/add";
    }

    @Autowired
    public void setStudentDao(StudentDao studentDao) {
        this.studentDao = studentDao;
    }
}
