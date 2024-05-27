package org.example.springjdbc05;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.dao.DataAccessException;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.ResultSetExtractor;

import java.sql.ResultSet;
import java.sql.SQLException;

@SpringBootApplication
public class Springjdbc05Application {
    public static void main(String[] args) {
        SpringApplication.run(Springjdbc05Application.class,args);
    }
    @Bean
    public CommandLineRunner demo(JdbcTemplate jdbcTemplate){
        return args -> {
            String sql = "SELECT id, name, email FROM users";
            User user = jdbcTemplate.query(sql,new UserResultSetExtractor());
            System.out.println(user);
        };
    }

    //resultsetextractor은 외부에서 만들지 않음
    private static class UserResultSetExtractor implements ResultSetExtractor<User>{
        // 특정 조건에 따라서 다향한 타입의 객체를 리스트에 추가할 때 사용된다
        @Override
        public User extractData(ResultSet rs) throws SQLException, DataAccessException {
            User user = new User();
            if (rs.next()){
                user.setId(rs.getLong("id"));
                user.setName(rs.getString("name"));
                user.setEmail(rs.getString("email"));

//                List<Role> roles = new ArrayList<>();
//                do{
//                    Ro
//                }while(rs.next());


                //지금 예제는 유저 하나에 대한 값만 채우는ㄴ거라 SetMapper와 크게 차이는 없어보여요
                //게시글이라면 게시글 하나에.. 댓글 리스트가 필드로 들어와 있을 수 있을거에요
            }
            return user;
        }
    }
}
