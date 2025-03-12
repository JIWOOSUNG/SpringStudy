package com.kbsw.spring_mybatis.basic_ioc.ex2;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;

public class ServiceImpl implements Service{

    @Autowired //byType으로 주입. Member객체를 찾아서 Member클래스 타입의 객체가 있으면 주입해준다
    @Qualifier("m1") // 동일한 타입 객체가 여러 개 있을때는 @Qulifier("빈이름")을 기술해야한다
    private Member user; //의존성 객체

    public void test1(){
        System.out.println(user);
    }

    @Override
    public void test2() {

    }
}
