package com.flyfish.mapper;

import com.flyfish.pojo.Classes;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Repository;

import java.util.Arrays;
import java.util.List;

/**
 * @autohr flyfish
 * @date: 2023/2/25 21:12
 * @description:
 */
@Repository
public class ClassesMapper {
    @Autowired
    private JdbcTemplate jdbcTemplate;

/*
* Stuff stuff = (Stuff) jdbcTemplate.queryForObject(sql, new BeanPropertyRowMapper<>(Stuff.class),id);
 * */

    /*添加班级*/
    public boolean addClass(String grade,String  clas){
        String sql = "insert into classes(grade,clas) values(?,?)";
        int result = jdbcTemplate.update(sql, grade, clas);
        if(result>0) return true;
        return false;
    }

    /*删除班级*/
    public boolean delClass(Integer id){
        String sql = "delete from classes where cid=?";
        int result = jdbcTemplate.update(sql, id);
        if(result>0) return true;
        return false;
    }

    /*查询所有班级*/
    public List<Classes> getAllClass(){
        String sql = "select * from classes";
/*
List<Stuff> stuffList = jdbcTemplate.query(sql, new BeanPropertyRowMapper<>(Stuff.class));
 */
        List<Classes> classesList = jdbcTemplate.query(sql, new BeanPropertyRowMapper<>(Classes.class));
        return classesList;

    }

}
