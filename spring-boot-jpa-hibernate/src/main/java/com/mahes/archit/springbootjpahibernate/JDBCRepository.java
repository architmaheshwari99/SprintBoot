package com.mahes.archit.springbootjpahibernate;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

@Repository
public class JDBCRepository {

    @Autowired
    private JdbcTemplate springJdbcTemplate;

    private static String INSERT_QUERY =
            """
                    insert into course (id, name, author)
                    values (1, 'Learn', 'minutes');
            """;

    public void insert() {
        System.out.println("CHECK");
        springJdbcTemplate.update(INSERT_QUERY);
    }
}
