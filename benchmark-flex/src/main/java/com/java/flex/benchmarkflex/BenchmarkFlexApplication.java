package com.java.flex.benchmarkflex;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * @author kscs
 */
@SpringBootApplication
@MapperScan("com.java.flex.benchmarkflex.repository.mapper")
public class BenchmarkFlexApplication {

    public static void main(String[] args) {
        SpringApplication.run(BenchmarkFlexApplication.class, args);
    }

}
