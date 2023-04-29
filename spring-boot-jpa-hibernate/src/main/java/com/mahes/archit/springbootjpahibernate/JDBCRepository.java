package com.mahes.archit.springbootjpahibernate;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

@Repository
public class JDBCRepository {

    @Autowired
    private JdbcTemplate springJdbcTemplate;

    private static String INSERT_QUERY =
            """
                    insert into course (id, name, author)
                    values (?, ?, ?);
            """;

    private static String DELETE_QUERY =
            """
                    delete from course where id = ?;
            """;

    private static String SELECT_QUERY =
            """
                    select * from course where id = ?;
            """;

    public void insert(Course course) {
        System.out.println("CHECK");
        springJdbcTemplate.update(INSERT_QUERY, course.getId(), course.getName(), course.getAuthor());
    }

    public void delete(int id){
        springJdbcTemplate.update(DELETE_QUERY, id);
    }

    public Course retrieve(int id){
//        Result set to bean mapped=Row Mapper
        return springJdbcTemplate.queryForObject(SELECT_QUERY, new BeanPropertyRowMapper<>(Course.class), id);
    }
}
