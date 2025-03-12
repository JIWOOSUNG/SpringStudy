package com.kbsw.spring_mybatis.basic_ioc.ex1;

import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;

import java.util.Random;

<<<<<<< HEAD
@NoArgsConstructor //default 생성자 만들어준다
@AllArgsConstructor //인자 생성자 만들어준다
public class MessageBeanKo implements MessageBean{

    private String greeting; //setter는 구성하지 않고 생성자를 통해 injection
    private Random random;

=======
@NoArgsConstructor //default생성자를 만들어준다
@AllArgsConstructor //인자 생성자를 만들어준다
public class MessageBeanKo implements MessageBean{

    private String greeting; //setter는 구성하지 않고 생성자를 통해 injection해보자
    private Random random;

    //public MessageBeanKo(){}

>>>>>>> ce81260 (- Spring MVC 아키텍처 (화면계층/컨트롤러/서비스/영속성계층))
//    public MessageBeanKo(String greeting, Random random) {
//        this.greeting = greeting;
//        this.random = random;
//    }
<<<<<<< HEAD

    @Override
    public void sayHello(String name){
        System.out.println("안녕하세요" + name + "님~");
    }

    @Override
    public void sayHi(){
        System.out.println("하이~~" + greeting);
        if(random!=null) {
            double ranNum = random.nextDouble()+7;
            //7.0 <= ranNum <8.0
            System.out.println("랜덤한 실수:");
        }

    }


=======
    @Override
    public void sayHello(String name){
        System.out.println("안녕하세요? "+name+"님~");
    }
    @Override
    public void sayHi(){
        System.out.println("하이~~"+greeting);
        if(random!=null) {
            double ranNum=random.nextDouble()+7;
            //7.0<= ranNum <8.0 사이의 실수값 반환
            System.out.println("랜덤한 실수: "+ranNum);
        }
    }
>>>>>>> ce81260 (- Spring MVC 아키텍처 (화면계층/컨트롤러/서비스/영속성계층))
}
