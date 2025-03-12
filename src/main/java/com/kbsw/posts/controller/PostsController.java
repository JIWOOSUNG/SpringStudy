package com.kbsw.posts.controller;

import com.kbsw.posts.model.PostDTO;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
@Slf4j
public class PostsController {

    @RequestMapping(value="/posts/form", method = RequestMethod.GET)
    public String postsForm() {

        return "posts/postsForm";
        //"WEB-INF/views/posts/postsForm.jsp"
    }

    @RequestMapping(value="/posts/write", method=RequestMethod.POST)
    public String postsWrite(@ModelAttribute PostDTO dto){ //html input name과 DTO의 property명이 동일하면 스프링이 자동으로 값을DTO에 담아준다
//        System.out.println("postWrite() 들어옴..." + dto);
        log.info("dto==={}",dto);
        return "message";
        //"WEB-INF/views/message.jsp"
    }
}
