package org.example.springjdbc06;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.namedparam.MapSqlParameterSource;
import org.springframework.jdbc.core.namedparam.NamedParameterJdbcTemplate;
import org.springframework.stereotype.Repository;

import java.util.Properties;

@Repository
public class UserDao {
    @Autowired
    private NamedParameterJdbcTemplate jdbcTemplate;
    @Autowired
    private Properties sqlQueries;

    public void insertUser(User user){
        String sql = sqlQueries.getProperty("INSERT_USER");
        MapSqlParameterSource param = new MapSqlParameterSource();
        param.addValue("name",user.getName()); //sql-queries내의 name과 똑같아야함
        param.addValue("email",user.getEmail());
        jdbcTemplate.update(sql,param);
    }
}
