package com.yunicorn.yearbook.web;

import com.yunicorn.yearbook.dao.FacultyDao;
import com.yunicorn.yearbook.domain.Faculty;
import com.yunicorn.yearbook.service.FacultyService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

/**
 * Created by fadlymunandar on 8/29/17.
 */
@Controller
@RequestMapping( value = "/faculty")
public class FacultyController {

    private FacultyService facultyService;

    @RequestMapping(method = RequestMethod.GET)
    public String faculty(Model model, @ModelAttribute("faculty")Faculty faculty,
                          @RequestParam(value = "saved", required = false) boolean isSaved) {

        model.addAttribute("activeFaculty", "active-menu");
        return "faculty";
    }

    @RequestMapping(value = "/add", method = RequestMethod.POST)
    public String addFaculty(Faculty faculty, RedirectAttributes redirect) {
        redirect.addFlashAttribute("facultyName", faculty.getFacultyName());
        redirect.addFlashAttribute("isSaved", true);
        facultyService.addFaculty(faculty);

        return "redirect:/faculty?saved="+true;
    }

    @Autowired
    public void setFacultyService(FacultyService facultyService) {
        this.facultyService = facultyService;
    }
}

