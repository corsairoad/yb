package com.yunicorn.yearbook.dao;

import com.yunicorn.yearbook.domain.Faculty;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.namedparam.MapSqlParameterSource;
import org.springframework.jdbc.core.namedparam.NamedParameterJdbcTemplate;
import org.springframework.stereotype.Repository;

import javax.sql.DataSource;

/**
 * Created by fadlymunandar on 8/29/17.
 */

@Repository(value = "facultyDao")
public class FacultyDao {

    private NamedParameterJdbcTemplate jdbc;

    @Autowired
    public FacultyDao(DataSource dataSource) {
        jdbc = new NamedParameterJdbcTemplate(dataSource);
    }

    public void addFaculty(Faculty faculty){
        String sql = "INSERT INTO faculty (faculty_name, faculty_code) VALUES (:name, :code)";
        MapSqlParameterSource map = new MapSqlParameterSource();
        map.addValue("name", faculty.getFacultyName());
        map.addValue("code", faculty.getFacultyCode());

        jdbc.update(sql, map);
    }
}
