package net.ruixin.springboot.service;

import net.ruixin.springboot.entity.Student;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Service;

import java.util.Arrays;
import java.util.List;

/**
 * @author dingmx
 * @date 2018/11/28 19:16
 */

@Service
public class HelloService {

    @Autowired
    JdbcTemplate jdbcTemplate;

    public Student getStudentById(Integer id) {
        //return jdbcTemplate.queryForObject("select * from student where id = " + id , Student.class);
        return jdbcTemplate.queryForObject("select * from student where id = ?", Arrays.asList(id).toArray(), (rs, rowNum) -> {
            Student student = new Student();
            student.setId(rs.getInt(1));
            student.setName(rs.getString(2));
            student.setAddress(rs.getString(3));
            return student;
        });
    }

    public List listStudent() {
        return jdbcTemplate.queryForList("select * from student");
    }

}
