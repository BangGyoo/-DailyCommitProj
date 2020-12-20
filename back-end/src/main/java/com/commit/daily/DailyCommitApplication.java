package com.commit.daily;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@MapperScan(basePackages = "com.commit.daily.repository.mapper")
public class DailyCommitApplication {

	public static void main(String[] args) {
		SpringApplication.run(DailyCommitApplication.class, args);
	}

}
