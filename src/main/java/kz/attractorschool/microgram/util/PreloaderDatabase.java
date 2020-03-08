package kz.attractorschool.microgram.util;
import kz.attractorschool.microgram.model.User;
import kz.attractorschool.microgram.model.UserRepo;

import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.util.stream.Stream;

@Configuration
public class PreloaderDatabase {

    @Bean
    CommandLineRunner initDatabase(UserRepo repository) {

        repository.deleteAll();

        return (args) -> Stream.of(users())
                .peek(System.out::println)
                .forEach(repository::save);
    }

    private User[] users() {
        return new User[]{
                new User("1", "Bakulya", "bakulya@gmail.com"),
                new User("2", "Ainura", "ainura@gmail.com")};
    }
}
