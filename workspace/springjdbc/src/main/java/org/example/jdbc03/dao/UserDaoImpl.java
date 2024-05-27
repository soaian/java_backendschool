package org.example.jdbc03.dao;

import lombok.RequiredArgsConstructor;
import org.example.jdbc03.UserNotFoundException;
import org.springframework.dao.DataAccessException;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.stereotype.Repository;

import java.util.List;

@RequiredArgsConstructor // 생성자를 기본으로 추가해줌
@Repository
public class UserDaoImpl implements UserDao {

    private final JdbcTemplate jdbcTemplate;


    @Override
    public void insertUser(User user) {
        try {
            jdbcTemplate.update("INSERT INTO users(name,email) VALUES (?,?)", user.getName(), user.getEmail());
        }catch (DataAccessException e){
            throw new DataAccessException("사용자를 입력하다 오류 발생"+ user.getName(),e){};
        }
    }

    @Override
    public List<User> findAllUsers() {
        try {
            RowMapper<User> rowMapper = (rs, rowNum) -> new User(
                    rs.getLong("id"),
                    rs.getString("name"),
                    rs.getString("email")
            );

            List<User> users = jdbcTemplate.query("SELECT id,name,email FROM users", rowMapper);
            users.forEach(System.out::println);

            return jdbcTemplate.query("SELECT id,name,email FROM users", rowMapper);
        }catch (DataAccessException e){
            throw new DataAccessException("데이터를 조회하다 오류 발생" + e) {};
        }
    }

    @Override
    public void updateUserEmail(String name, String email) {

         int updated = jdbcTemplate.update("UPDATE users SET email = ? where name = ?", email, name);
         if (updated == 0){
             throw new UserNotFoundException("데이터에 해당하는 값이 없습니다 : " + name + " , " + email);
         }

    }

    @Override
    public void deleteUser(String name) {
        int deleted = jdbcTemplate.update("DELETE FROM users where name = ?",name);
        if (deleted == 0){
            throw new UserNotFoundException("데이터에 해당하는 값이 없습니다 : " + name);
        }
    }


}
