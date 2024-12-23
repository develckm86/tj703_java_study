package com.tj703.study;

public class L20InheritanceConstruct {
    class A{
        int a;
        A(int a){
            this.a=a;
        }
    }
    //이때 생기는 문제를 해결하세요! 오늘의 문제~ 내일!!
    class B extends A{
        int b;
        B(int a,int b){
            super(a);//==new A(10)
            this.b=b;
        }
    }
    class C extends B{
        int c;
        //C가 B를 상속받았기 때문에 생성자 규칙을 따라야한다.
        //=>B를 객체로 만들기 위해 C의 생성자에서 B의 생성자를 꼭 호출해야한다.
        C(int a,int b,int c){
            super(a,b);
            this.c=c;
        }
    }
    public static void main(String[] args) {
        L20InheritanceConstruct o=new L20InheritanceConstruct();
        C c=o.new C(100,200,300);
        System.out.println(c.a); //c.super.super.a
        System.out.println(c.b); //c.super.b
        System.out.println(c.c); //c.c
    }
}
