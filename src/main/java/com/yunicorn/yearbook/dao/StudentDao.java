package com.yunicorn.yearbook.dao;

import com.yunicorn.yearbook.domain.Student;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.namedparam.MapSqlParameterSource;
import org.springframework.jdbc.core.namedparam.NamedParameterJdbcTemplate;
import org.springframework.stereotype.Repository;

import javax.sql.DataSource;

/**
 * Created by fadlymunandar on 8/26/17.
 */

@Repository(value = "studentDao")
public class StudentDao {

    NamedParameterJdbcTemplate jdbc;

    @Autowired
    public StudentDao(DataSource dataSource) {
        jdbc = new NamedParameterJdbcTemplate(dataSource);
    }

    public void addStudent(Student student) {
        String sql = "INSERT INTO student (first_name, last_name) VALUES (:fName, :lName)";
        MapSqlParameterSource map = new MapSqlParameterSource();
        map.addValue("fName", student.getFirstName());
        map.addValue("lName", student.getLastName());

        jdbc.update(sql, map);
    }
}
