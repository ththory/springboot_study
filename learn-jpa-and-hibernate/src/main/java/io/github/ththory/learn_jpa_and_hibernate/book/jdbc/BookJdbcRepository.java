package io.github.ththory.learn_jpa_and_hibernate.book.jdbc;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

@Repository
public class BookJdbcRepository {
    @Autowired
    private JdbcTemplate springJdbcTemplate;

    private static String INSERT_QUERY =
            """
                insert into book (id, title, author)
                values(1, '백설공주', 'jimin')
            """;

    public void insert(){
        springJdbcTemplate.update(INSERT_QUERY);
    }
}
