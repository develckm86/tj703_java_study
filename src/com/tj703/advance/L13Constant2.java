package com.tj703.advance;

import javax.swing.*;
import java.awt.*;
interface ConstInterface{
    int a=10; //인터페이스는 객체가 될수 없기 때문에 필드도 정의할 수 없다.
    //때문에 자동완성으로 static 필드를 정의하는데 보통 static 필드로 공유되는 자원은 상수기 때문에
    //public final static 을 작성해준다.
    public final static int b=20;
    double PI=3.14128312893;
    //추상메소드만 작성가능
    void add(); //public abstract void add()
}

final class Math{
    int a=10;
    public final static double PI=3.141828328282382382389;
    private Math(){} //static 필드만 갖는 클래스는 객체생성을 막을 수도 있다.
}

public class L13Constant2 {
    public static void main(String[] args) {
        //Integer objI=new Integer(13);
        System.out.println(Integer.parseInt("19"));
        //System.out.println(14*14*new Math().PI);
        //System.out.println(31*31*new Math().PI);
        //System.out.println(31*2*new Math().PI);
        //PI를 호출하기 위해서 객체를 만들어서 호출하는 것은 메모리에 부담이 된다.
        System.out.println(Math.PI*8*8);
        //Math.PI=4.14;
        System.out.println(java.lang.Math.PI*8*8);
        //패키지명을 도메인으로 사용하기 때문에 주민번호처럼 사용된다.

        JFrame frame=new JFrame();
        frame.add(new JButton("버튼"), BorderLayout.SOUTH);
        //BorderLayout.SOUTH : 상수의 진정한 사용 목적

        //반지름이 3인 원의 넓이  3*3*3.14*****
        //Math.PI= 3.141592653589792; //PI를 상수로 정의했기때문에 바꿀 수 없다.
        System.out.println(Math.PI);
        //PI 같은 상수를 정의할 때 규칙 (public static final)
        //**공유되는 약속된 자원을 정의할 때는 꼭 final 상수를 정의
        //자주 공유되는 자원은 static 필드로 정의해서 객체생성을 하지않도 되도록한다.
        //public 접근지정자를 사용해야 공유되고 사용될 수 있다.

    }
}
