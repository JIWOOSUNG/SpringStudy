package com.kbsw.spring_mybatis;


import org.apache.ibatis.annotations.Mapper;
import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

import javax.swing.*;

@SpringBootApplication
		//(exclude = DataSourceAutoConfiguration.class)
@ComponentScan(basePackages = {"com.kbsw.posts","com.kbsw.spring_mybatis","com.kbsw"  })
@MapperScan(basePackages = {"com.kbsw.posts.mapper"}) //XXXMapper인터페이스가 있는 패키지 지정
public class SpringMybatisApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringMybatisApplication.class, args);
	}

	//src/main/webapp/WEB-INF/views
}
