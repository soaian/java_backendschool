package org.example.springjdbc07;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.jdbc.core.JdbcTemplate;

@SpringBootApplication
public class Springjdbc07Application {
    public static void main(String[] args) {
        SpringApplication.run(Springjdbc07Application.class,args);
    }

    @Bean
    public CommandLineRunner demo(JdbcTemplate jdbcTemplate){
        return args -> {
            String sql = """
                    INSERT INTO users (name,email)
                    VALUES (?,?);
                    """;
            jdbcTemplate.update(sql,"Amma","Amma@example.com");

            String query = """
                    SELECT id, name, email
                    FROM users
                    WHERE email LIKE ?;
                    """;
            jdbcTemplate.query(query,rs->{
                while (rs.next()){
                    System.out.println("User : " + rs.getString("name") + " - " + rs.getString("email"));
                }
            },"%example.com");
        };
    }
}
