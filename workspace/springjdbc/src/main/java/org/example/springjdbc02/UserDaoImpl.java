package org.example.springjdbc02;

import lombok.RequiredArgsConstructor;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;


@RequiredArgsConstructor
@Repository
public class UserDaoImpl implements UserDao{
    private final JdbcTemplate jdbcTemplate;
    @Override
    public void createAndUpdateUser(String name, String email, String newEmail) {
        jdbcTemplate.update("INSERT INTO users (name, email) VALUES (?, ?)", name, email);
        if (newEmail.contains("error")) {
            throw new RuntimeException("Simulated error");
        }
        jdbcTemplate.update("UPDATE users SET email = ? WHERE name = ?", newEmail, name);
    }
    //@Transactional 을 붙이면 두 작업이 하나의 작업으로 묶임으로써 진행 도중 오류가 발생하면 '전체' 실행이 취소됨
    //그러나 위의 에노테이션을 붙이지 않는다면 error가 발생했을때 위의 insert문은 실행되고 밑의 구문만 실행이 안됨
}
