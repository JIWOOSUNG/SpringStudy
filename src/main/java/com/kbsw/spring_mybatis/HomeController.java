package com.kbsw.spring_mybatis;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class HomeController {

<<<<<<< HEAD
    @RequestMapping("/test")  //http://localhost:8080/test
    public String test(){

        return "home"; //view 이름 반환하면
        //스프링에서 뷰네임 앞에 접두어, 뒤에 접미어를 붙여 해당 뷰페이지를 찾아간다 --> application.properties에 설정됨
        // /WEB-INF/views/home.jsp
    }

    @RequestMapping("/hello") //http://localhost:8080/hello 하면 message.jsp를 보여줌
    public String hello() {
=======

    @RequestMapping("/test") //http://localhost:8080/test
    public String test(){

        return "home";//view이름을 반환하면
        //스프링에서 뷰네임 앞에 접두어, 뒤에 접미어를 붙여 해당 뷰페이지를 찾아간다==>application.properites에 설정됨
        // /WEB-INF/views/home.jsp
    }
    @RequestMapping("/hello")//http://localhost:8080/hello 하면 message.jsp를 보여줌
    public String hello(){
>>>>>>> ce81260 (- Spring MVC 아키텍처 (화면계층/컨트롤러/서비스/영속성계층))

        return "message";
    }

}
<<<<<<< HEAD

=======
>>>>>>> ce81260 (- Spring MVC 아키텍처 (화면계층/컨트롤러/서비스/영속성계층))
