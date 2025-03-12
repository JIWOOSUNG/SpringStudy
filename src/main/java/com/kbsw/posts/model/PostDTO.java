package com.kbsw.posts.model;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;
<<<<<<< HEAD

import java.time.LocalDateTime;

=======
import java.time.LocalDateTime;
>>>>>>> ce81260 (- Spring MVC 아키텍처 (화면계층/컨트롤러/서비스/영속성계층))
@Setter
@Getter
@ToString
public class PostDTO {
<<<<<<< HEAD

    private int id; //글번호
    private String title; //글제목
    private String name; //작성자
    private String content; //글내용
    private LocalDateTime wdate; //작성일
    private int readNum; //조회수
    private String fileName; //첨부파일명
    private long fileSize; //첨부파일 크기
=======
    
    private int id;//글번호
    private String title;//글제목

    private String name;//작성자

    private String content;//글내용
    private String pwd; //글 비밀번호 (수정,삭제시 사용)

    private LocalDateTime wdate;//작성일

    private int readNum;//조회수
    
    private String fileName;//첨부파일명 --물리적
    private String originFileName; //원본 파일명 (논리적 파일명) --a.txt

    private long fileSize;//첨부파일 크기

    private int mode; //글쓰기 (wrtie), 글수정(edit) 값을 가질 예정
    private String old_fileName; //예전에 첨부했던 파일명 ==> 글 수정시 필요
>>>>>>> ce81260 (- Spring MVC 아키텍처 (화면계층/컨트롤러/서비스/영속성계층))
}
