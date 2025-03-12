package com.kbsw.posts.controller;

<<<<<<< HEAD
import com.kbsw.posts.model.PostDTO;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Controller;
=======
import com.kbsw.posts.model.PagingDTO;
import com.kbsw.posts.model.PostDTO;
import com.kbsw.posts.service.PostsService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
>>>>>>> ce81260 (- Spring MVC 아키텍처 (화면계층/컨트롤러/서비스/영속성계층))
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

<<<<<<< HEAD
@Controller
@Slf4j
public class PostsController {

    @RequestMapping(value="/posts/form", method = RequestMethod.GET)
=======
import java.util.List;

@Controller
@Slf4j
@RequestMapping("/posts") //공통적으로 적용되는 매핑
public class PostsController {

    //Field Injection
    @Autowired //byType으로 주입. PostsService 타입
    private PostsService postService;

    @RequestMapping(value="/form", method = RequestMethod.GET)
>>>>>>> ce81260 (- Spring MVC 아키텍처 (화면계층/컨트롤러/서비스/영속성계층))
    public String postsForm() {

        return "posts/postsForm";
        //"WEB-INF/views/posts/postsForm.jsp"
    }

<<<<<<< HEAD
    @RequestMapping(value="/posts/write", method=RequestMethod.POST)
    public String postsWrite(@ModelAttribute PostDTO dto){ //html input name과 DTO의 property명이 동일하면 스프링이 자동으로 값을DTO에 담아준다
//        System.out.println("postWrite() 들어옴..." + dto);
        log.info("dto==={}",dto);
        return "message";
        //"WEB-INF/views/message.jsp"
    }
=======
    @RequestMapping(value="/write", method=RequestMethod.POST)
    public String postsWrite(@ModelAttribute PostDTO dto, Model model){ //html input name과 DTO의 property명이 동일하면 스프링이 자동으로 값을DTO에 담아준다
//        System.out.println("postWrite() 들어옴..." + dto);
        log.info("dto==={}",dto);

        int n=postService.insertPost(dto);

        String msg=(n>0)? "포스트등록성공":"등록실패";
        String loc=(n>0)? "list":"javascript:history.back()";

        //Model에 key,value 형태로 매핑해서 저장하면 --> View(jsp)에서 꺼내서 사용할 수 있다.
        model.addAttribute("msg",msg);
        model.addAttribute("loc", loc);

        return "message";
        //"WEB-INF/views/message.jsp"
    }

    @RequestMapping(value="/list", method=RequestMethod.GET)
    public String postsList(Model model, PagingDTO pageDto){

        List<PostDTO> list=postService.listPost(pageDto);
        model.addAttribute("list",list);

        return "posts/postsList";
        //"WEB-INF/views/posts/postsList.jsp"

    }
>>>>>>> ce81260 (- Spring MVC 아키텍처 (화면계층/컨트롤러/서비스/영속성계층))
}
