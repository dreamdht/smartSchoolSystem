package com.flyfish.mapper;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

/**
 * @autohr flyfish
 * @date: 2023/2/25 21:12
 * @description:
 */
@Repository
public class KidsMapper {
    @Autowired
    private JdbcTemplate jdbcTemplate;


}
