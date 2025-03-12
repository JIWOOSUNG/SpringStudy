package com.kbsw.spring_mybatis.basic_ioc.ex2;

import lombok.Setter;
import lombok.ToString;

@Setter
@ToString //==> public String toString() {name, tel 정보를 문자열로 반환함 }
public class Member {
//    @Value("홍길동")
    private String name="홍길동";

    private String tel="010-1111-2222";
}
