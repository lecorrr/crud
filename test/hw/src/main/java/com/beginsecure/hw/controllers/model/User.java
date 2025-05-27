package com.beginsecure.hw.controllers.model;

import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;
import org.springframework.web.bind.annotation.GetMapping;

@Repository
public class User {
    
    @Autowired
    private JdbcTemplate jdbcTemplate;
    
    @GetMapping("/api/hw")      
    public String jdbcMessage(){
        Map<String, Object> result = this.jdbcTemplate.query("select * from Goods");
        return result;
    }

}
