package com.yunicorn.yearbook.web;

import com.yunicorn.yearbook.dao.FacultyDao;
import com.yunicorn.yearbook.domain.Faculty;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

/**
 * Created by fadlymunandar on 8/29/17.
 */
@Controller
@RequestMapping( value = "/faculty")
public class FacultyController {

    private FacultyDao facultyDao;

    @RequestMapping(method = RequestMethod.GET)
    public String faculty(Model model, @ModelAttribute("faculty")Faculty faculty,
                          @RequestParam(value = "saved", required = false) boolean isSaved) {

        if (isSaved) {
            model.addAttribute("isSaved",true);
        }

        model.addAttribute("activeFaculty", "active-menu");
        return "faculty";
    }

    @RequestMapping(value = "/add", method = RequestMethod.POST)
    public String addFaculty(Faculty faculty) {
        facultyDao.addFaculty(faculty);
        return "redirect:/faculty?saved="+true;
    }

    @Autowired
    public void setFacultyDao(FacultyDao facultyDao) {
        this.facultyDao = facultyDao;
    }
}

