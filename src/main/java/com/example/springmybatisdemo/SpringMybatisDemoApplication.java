package com.example.springmybatisdemo;

import org.apache.ibatis.annotations.Mapper;
import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.stereotype.Component;

@SpringBootApplication
@MapperScan("com.example.springmybatisdemo.Dao")
@Component("com.example.springmybatisdemo")
public class SpringMybatisDemoApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringMybatisDemoApplication.class, args);
	}
}
