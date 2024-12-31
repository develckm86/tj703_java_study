package com.tj703.advance;
 class ConstTest{
     int a;
     //final int b; //필드는 상수의 초기값을 지정해야한다.
     final  int B=30; //개발자간의 약속으로 상수의 이름은 변수와 구분하기 위해 대문자 스네이크 문법을 사용
     final String SAY_HELLO="안녕"; //sayHello (카멜) SayHello (파스칼)
     //say-hello html class 이름 작성법 : 궈장하지 않는다 인공지능이 많이 생성하는 이름
     //String say-hello="안녕"; // - 마이너스 연산의 예약어기 때문에 사용할 수 없다.

     //const obj={}
     //자바스크립트가 동적 타입으로 변수의 객체를 참조하기 때문에 상수로 처음대입한 것을 바꾸지 않고 사용
     //let obj={}
     //obj="안녕";
     //obj.a=10;
     Object obj=new Object();
     String str="잘가";
    public void L12Constant(){
        obj="안녕";
        obj=10;//Integer.valueOf(10)
        //str=20;
        //자바는 타입이 명확한 언어기 때문에 상수를 무분별하게 사용할 일이 없다!!
    }



 }
public class L12Constant {
    public static void main(String[] args) {
        //const let a=10;
        final int a=10;
        //a=20; 처음 대입한 값을 다른 것으로 바꿀수 없는 것을 변수X 상수 O
        final ConstTest ct=new ConstTest();
        ct.a=10; //상수의 정의는 참조하는 것이 전체가 바뀌지 않는 것을 의미 (필드를 바꾸는 것은 문제 없다)
        //ct=new ConstTest();
        final String s; //지역변수는 상수의 초기값을 비울 수 있다.
        s="안녕";
        //s="잘가";

    }
}
