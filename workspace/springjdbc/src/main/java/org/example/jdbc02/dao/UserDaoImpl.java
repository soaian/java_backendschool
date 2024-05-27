package org.example.jdbc02.dao;

import com.mysql.cj.protocol.Resultset;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Repository;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;

@RequiredArgsConstructor // 생성자를 기본으로 추가해줌
@Repository
public class UserDaoImpl implements UserDao{
    //JdbcTeamplate 객체 이용해서 구현 할거니까
    //필드기반
//    @Autowired
    private final JdbcTemplate jdbcTemplate;

//    //생성자기반
//    public UserDaoImpl(JdbcTemplate jdbcTemplate) {
//        this.jdbcTemplate = jdbcTemplate;
//    }
//
//    //설정자기반
//    public void setJdbcTemplate(JdbcTemplate jdbcTemplate) {
//        this.jdbcTemplate = jdbcTemplate;
//    }

    @Override
    public void insertUser(User user) {
        jdbcTemplate.update("INSERT INTO users(name,email) VALUES (?,?)",user.getName(),user.getEmail());
    }

    @Override
    public List<User> findAllUsers() {
        RowMapper<User> rowMapper = (rs,rowNum)-> new User(
                rs.getLong("id"),
                rs.getString("name"),
                rs.getString("email")
        );

        List<User> users =jdbcTemplate.query("SELECT id,name,email FROM users",rowMapper);
        users.forEach(System.out::println);

        return jdbcTemplate.query("SELECT id,name,email FROM users",rowMapper);
    }

    @Override
    public void updateUserEmail(String name, String email) {
        jdbcTemplate.update("UPDATE users SET email = ? where name = ?",email,name);
    }

    @Override
    public void deleteUser(String name) {
        jdbcTemplate.update("DELETE FROM users where name = ?",name);
    }

//    class userMapper implements RowMapper<User>{
//
//        @Override
//        public User mapRow(ResultSet rs, int rowNum) throws SQLException {
//            User user = new User(rs.getLong("id"),rs.getString("name"),rs.getString("email"));
//            return user;
//        }
//    }
}
