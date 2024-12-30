package com.tj703.advance;

class StaticTest{
    public int a=10;
    public static int b=20;//main 실행되는 동시에 객체로 생성됨
    public void add(){
        System.out.println(a+b);
    }
    public static void staticAdd(int a,int b){
        //System.out.println(a+b);
        // a는 StaticTest 가 객체가 되었을 때 만 존재하기 때문에 main 이 실행될때 객체로 생성되는
        // static 필드에서는 호출될 수 없다.
        System.out.println(a+b);
    }
}
public class L11StaticEx {
    public static void main(String[] args) {
        System.out.println(StaticTest.b); //호출할때 클래스를 작성해서 클래스 변수라고도 한다.
        StaticTest.staticAdd(20,55);

        new StaticTest().add();
        //System.out.println(StaticTest.a);
        System.out.println(new StaticTest().a);
        System.out.println(new StaticTest().b);
        //static 필드를 객체로 참조할 수 있지만 실제로는 static 필드를 참조한다. 만약
        //객체로 참조했다면 수정하는 것을 권장한다.
        //com.tj703.advance.StaticTest.b == StaticTest.b
    }
}
