package com.kbsw.spring_mybatis.basic_ioc.ex2;

import lombok.Setter;
import lombok.ToString;

@Setter
<<<<<<< HEAD
@ToString //==> public String toString() {name, tel 정보를 문자열로 반환함 }
public class Member {
//    @Value("홍길동")
    private String name="홍길동";

    private String tel="010-1111-2222";
=======
@ToString  //==> public String toString(){ name, tel 정보를 문자열로 반환함  }
public class Member {
   // @Value("홍길동")
    private String name="홍길동";

    private String tel="010-2222-3333";

//    public String toString(){
//        return "name: "+name+", tel: "+tel;
//    }
>>>>>>> ce81260 (- Spring MVC 아키텍처 (화면계층/컨트롤러/서비스/영속성계층))
}
