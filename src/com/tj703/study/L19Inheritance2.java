package com.tj703.study;

public class L19Inheritance2 {
    //자바스크립트 빼고 객체지향 언어의 상속
    class A{
        int a=10;
        //.... 필드로 200개 정도
        //A(){} //default 생성자(매개변수가 없는) 는 만들어도 문제 없다
        A(int a){ this.a=a;}

        public int add(int a,int b){
            return a+b;
        }
    }
    class C extends B{
        //자동으로 만들어지는 default 생성자 == public C(){super();}
        //B의 생성자 규칙이 바뀌면 default 생성자가 부모 객체를 만들 수 없기 때문에 생성자를 재정의 해야한다.
    }
    class B extends A{ //부모가 생성자를 정의하고 있을때 오류 => B가 부모의 생성자를 호출하면 오류가 해결됨
        //B에서 A와 거의 유사한데 조금 다르게 구현하고 싶다.... -> 상속
        //B의 부모로 A를 지정하면 A가 정의하는 모든 필드를 B가 사용할 수 있다. B extends A
        int a=33;
        B(){
            //int c=30; //부모가 생성자를 강제하면 자식에서 부모의 생성자를 호출하기 전까지는 아무것도 할 수 없다.
            //super(this.a);//super() 부모의 생성자를 호출할때는 자식필드(this)는 호출할 수 없다.
            super(33);
            int c=30;
            /// ???왜??? :자식이 만들어질때 자식생성자에서 꼭 제일 먼저 부모를 생성하기 때문
        }
        int b=10;
    }


    public static void main(String[] args) {
        L19Inheritance2 o = new L19Inheritance2();
        B b = o.new B();
        System.out.println(b.a);
        System.out.println(b.b);
        System.out.println(b.add(13,44));
    }
}
