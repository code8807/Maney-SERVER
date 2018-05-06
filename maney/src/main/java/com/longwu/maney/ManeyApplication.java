package com.longwu.maney;

import com.longwu.maney.filter.AccessTokenFilter;
import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.web.servlet.FilterRegistrationBean;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.core.Ordered;
import org.springframework.scheduling.annotation.EnableAsync;

@SpringBootApplication
@ComponentScan("com.longwu.maney")
@EnableAsync
@MapperScan("com.longwu.maney.dao")
public class ManeyApplication {

    public static void main(String[] args) {
        SpringApplication.run(ManeyApplication.class, args);
    }
}
