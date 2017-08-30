package com.yunicorn.yearbook.service;

import com.yunicorn.yearbook.dao.FacultyDao;
import com.yunicorn.yearbook.domain.Faculty;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * Created by fadlymunandar on 8/29/17.
 */
@Service("facultyService")
public class FacultyServiceImpl implements FacultyService {

    private FacultyDao facultyDao;

    @Autowired
    public void setFacultyDao(FacultyDao facultyDao) {
        this.facultyDao = facultyDao;
    }

    public void addFaculty(Faculty faculty) {
        facultyDao.addFaculty(faculty);
    }
}
