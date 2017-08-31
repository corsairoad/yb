package com.yunicorn.yearbook.web;

import com.yunicorn.yearbook.dao.FacultyDao;
import com.yunicorn.yearbook.domain.Faculty;
import com.yunicorn.yearbook.service.FacultyService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import javax.servlet.http.Part;
import java.io.File;
import java.io.IOException;

/**
 * Created by fadlymunandar on 8/29/17.
 */
@Controller
@RequestMapping( value = "/faculty")
public class FacultyController {

    private static final String FEATURED_IMAGE_PATH = "/Applications/tomcat-8.5.20/data/yearbook/featured_images";
    private FacultyService facultyService;

    @RequestMapping(method = RequestMethod.GET)
    public String faculty(Model model, @ModelAttribute("faculty")Faculty faculty,
                          @RequestParam(value = "saved", required = false) boolean isSaved) {

        model.addAttribute("activeFaculty", "active-menu");
        return "faculty";
    }

    @RequestMapping(value = "/add", method = RequestMethod.POST)
    public String addFaculty(@RequestPart("featuredImage")Part featuredImg, Faculty faculty, RedirectAttributes redirect) throws IOException {


        featuredImg.write( FEATURED_IMAGE_PATH + File.separator + featuredImg.getSubmittedFileName());

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

