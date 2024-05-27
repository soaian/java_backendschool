package org.example.jdbc02.dao;

import lombok.RequiredArgsConstructor;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.stereotype.Repository;

import java.sql.ResultSet;
import java.util.List;

@Repository
@RequiredArgsConstructor
public class DeptDao {
    private final JdbcTemplate jdbcTemplate;
    //mapRow를 따로 객체 생성하긴 너무 과도하니 람다식으로 한번에 줄여서 씀
//    public List<Dept> getDepts(){
//        return jdbcTemplate.query("SELECT deptno,dname,loc FROM dept",new DeptRowMapper());
//    }
    public List<Dept> getdepts(){
        RowMapper<Dept> rowMapper = (ResultSet rs, int rowNum) -> {
            Dept dept = new Dept();
            dept.setId(rs.getInt("deptno"));
            dept.setDeptName(rs.getString("dname"));
            dept.setLocation(rs.getString("loc"));
            return dept;
        };
              return jdbcTemplate.query("SELECT * FROM dept",rowMapper);
    }
}
