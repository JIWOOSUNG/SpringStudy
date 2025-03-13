package com.kbsw.posts.model;
//페이징 처리 및 검색 관련 프로퍼티를 갖는 객체

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Setter
@Getter
@ToString
public class PagingDTO {

    private String findType; //검색 유형 (0,1,2,3)
    private String findKeyword; //검색어
}
