package io.github.ththory.learn_jpa_and_hibernate.book.jdbc;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

@Component
public class BookJdbcCommandLineRunner implements CommandLineRunner {

    @Autowired
    private BookJdbcRepository repository;
    @Override
    public void run(String... args) throws Exception {
        repository.insert();
    }
}
