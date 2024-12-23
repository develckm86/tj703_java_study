package com.tj703.study;

public class L22OverideFeild {
    class A{
        int a=10;

        @Override
        public String toString() {
            return "저는 A 입니다. 오호호..";
        }
    }
    class B extends A{
        int a=20;
    }
    class C extends B{
        int a=100;

        @Override
        public String toString() {//해당 객체에 대한 설명
            return "나는 클래스 C 이다 우하하~";
        }
    }
    //main은 L22OverideFeild에 존재하지 않는 별개의 영역(static)
    public static void main(String[] args) {
        L22OverideFeild o=new L22OverideFeild();
        A a=o.new C();
        System.out.println(a.a); //정적디스패치
        System.out.println(a); //==a.toString() //Object.toString()
        //com.tj703.study.L22OverideFeild$C@4a574795 :
        //C toString 재정의(Override) 했기때문에 동적 디스패치로 재정의된 것을 호출
        //문제!
        //변수가 a가 참조하는 객체를 C타입의 변수가 참조하고 그 변수의 필드 a를 호출
        //Casting
        C c=(C)a;
        //부모타입으로 참조하던 변수를 자식타입으로 참조하는 것은 위험하다.
        //String s=(String)a; //이전버전의 컴파일러가 오류를 찾지 못했다.->위험
        Object objC=c; //자식타입의 객체를 부모타입의 객체로 참조하는 것은 자연스럽다.
    }
}
