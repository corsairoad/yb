package com.yunicorn.yearbook.domain;

import java.util.Date;

/**
 * Created by fadlymunandar on 8/29/17.
 */
public class Faculty {

    private String facultyName;
    private String facultyCode;
    private String featuredImgLocation;

    public String getFacultyName() {
        return facultyName;
    }

    public void setFacultyName(String facultyName) {
        this.facultyName = facultyName;
    }

    public String getFacultyCode() {
        return facultyCode;
    }

    public void setFacultyCode(String facultyCode) {
        this.facultyCode = facultyCode;
    }

    public String getFeaturedImgLocation() {
        return featuredImgLocation;
    }

    public void setFeaturedImgLocation(String featuredImgLocation) {
        this.featuredImgLocation = featuredImgLocation;
    }
}
