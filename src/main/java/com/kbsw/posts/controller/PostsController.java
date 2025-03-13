package com.kbsw.posts.controller;

import com.kbsw.posts.model.PagingDTO;
import com.kbsw.posts.model.PostDTO;
import com.kbsw.posts.service.PostsService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@Controller
@Slf4j
@RequestMapping("/posts") // 공통적으로 적용되는 매핑
public class PostsController {

    @Autowired // byType으로 주입. PostsService 타입
    private PostsService postService;

    @RequestMapping(value = "/form", method = RequestMethod.GET)
    public String postsForm() {
        return "posts/postsForm"; // "WEB-INF/views/posts/postsForm.jsp"
    }

    @RequestMapping(value = "/write", method = RequestMethod.POST)
    public String postsWrite(@ModelAttribute PostDTO dto, Model model) {
        log.info("dto === {}", dto);

        int n = postService.insertPost(dto);

        String msg = (n > 0) ? "포스트 등록 성공" : "등록 실패";
        String loc = (n > 0) ? "list" : "javascript:history.back()";

        // Model에 key, value 형태로 저장하면 View(jsp)에서 사용할 수 있음
        model.addAttribute("msg", msg);
        model.addAttribute("loc", loc);

        return "message"; // "WEB-INF/views/message.jsp"
    }

    @RequestMapping(value = "/list", method = RequestMethod.GET)
    public String postsList(Model model, PagingDTO pageDto) {
        log.info("pageDto: {}", pageDto);
        //1. 총 게시글 수 또는 검색한 게시글 수 가져오기
        int totalCount = postService.getTotalCount(pageDto);

        //2. 게시글 (검색한 글) 가져오기
        List<PostDTO> list = postService.listPost(pageDto);

        //list.size() ==> 총 게시글 수
        model.addAttribute("list", list);
        model.addAttribute("totalCount", totalCount);
        model.addAttribute("page",pageDto);
        return "posts/postsList"; // "WEB-INF/views/posts/postsList.jsp"
    }

    @GetMapping("/view")
    public String postView(@RequestParam(defaultValue = "0")int id){
        if(id==0){
            return "redirect:/posts/list"; //redirect방식으로 페이지를 이동시킨다
        }
        //글번호로 글 내용 가져와서 Model에 저장하기

        return "posts/postsView";
    }
}
