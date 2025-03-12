package com.kbsw.spring_mybatis;

<<<<<<< HEAD
=======
import org.apache.ibatis.annotations.Mapper;
import org.mybatis.spring.annotation.MapperScan;
>>>>>>> ce81260 (- Spring MVC 아키텍처 (화면계층/컨트롤러/서비스/영속성계층))
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
<<<<<<< HEAD
//		(exclude = DataSourceAutoConfiguration.class)
@ComponentScan(basePackages = {"com.kbsw.posts", "com.kbsw.spring_mybatis", "com.kbsw"})
=======
		//(exclude = DataSourceAutoConfiguration.class)
@ComponentScan(basePackages = {"com.kbsw.posts","com.kbsw.spring_mybatis","com.kbsw"  })
@MapperScan(basePackages = {"com.kbsw.posts.mapper"}) //XXXMapper인터페이스가 있는 패키지 지정
>>>>>>> ce81260 (- Spring MVC 아키텍처 (화면계층/컨트롤러/서비스/영속성계층))
public class SpringMybatisApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringMybatisApplication.class, args);
	}

<<<<<<< HEAD
=======
	//src/main/webapp/WEB-INF/views
>>>>>>> ce81260 (- Spring MVC 아키텍처 (화면계층/컨트롤러/서비스/영속성계층))
}
