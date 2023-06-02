package com.rs.test;

import lombok.extern.log4j.Log4j2;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.context.annotation.ComponentScan;

import javax.annotation.PostConstruct;
import java.time.ZonedDateTime;


@SpringBootApplication()
@Log4j2
@EntityScan(basePackages = {"com.rs.um.entity.*"})
@ComponentScan({"com.rs.um", "com.rs.test"})
public class TestApplication {
    public static void main(String[] args) {
        SpringApplication.run(TestApplication.class, args);
    }

    @PostConstruct
    public void init() {
        log.info("Spring boot application running with UTC timezone: {}", ZonedDateTime.now());
    }
}
