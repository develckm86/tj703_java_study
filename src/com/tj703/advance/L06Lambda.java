package com.tj703.advance;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.function.Function;

public class L06Lambda {
    public static void main(String[] args) {
        //람다식은 함수를 타입(객체)처럼 사용하는 척 하는 문법적 설탕
        Runnable fun=()->{};
        Function<Integer,Integer> fun2=(a)->{return a*10;};
        //Function<Integer:매개변수의 타입,Integer:반환값의 타입>
        fun2=a->a*10; //{} body 를 생략하면 자동으로 반환된다.

        fun=new Runnable() {
            @Override
            public void run() {
                System.out.println("Runnable 매개변수와 리턴이 없는 함수 run");
            }
        };
        fun=()->{
            System.out.println("안녕 람다식");
        }; // 함수를 객체로 만드는 것이 아니라 위의 코드를 자동완성
        ActionListener fun3=(e)->{};
        //람다식은 익명클래스로 만들어진 객채구나!=>함수형언어가 부럽기 때문에
    }

}
