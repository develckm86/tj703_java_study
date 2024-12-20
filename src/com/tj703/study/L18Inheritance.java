package com.tj703.study;

public class L18Inheritance {
    public static void main(String[] args) {
        //상속이란 객체가 다른 객체를 포함하도록 정의하는 방식 ??
        //모든 객체는 무슨 객체를 포함하고 있다.
        String s=new String("안녕");
        int [][] arr=new int[4][3];
        //[[],[],[]]  [] Array 는 무슨 객체를 포함
        Object objS=s;
        Object objArr=arr;
        //모든 객체의 타입은 부모타입으로 Object를 상속하고 있고
        //때문에 객체 생성시 Object를 객체로 생성해서 참조(superior 부모)하고 있다.
        //Object 변수가 객체를 참조할 수 있는 이유다.
        //Object 는 모든 객체의 조상 : (js,java)언어에서 객체의 default 상태를 정의
        //js는 Object 프로토타입(미완성 객체)을 만들어 놓고
        // 다른 객체를 만들때 마다 __proto__로 참조
        //__proto__는 자바의 super 와 같다.
        //function User(){} 선언하면 User.prototype 이 __proto__ 이용해
        //Object.prototype 을 참조하면서 객체를 생성
        //const user=new User(); User 객체가 User.prototype 을
        //__proto__로 참조하면서 생성된다.
        //new User()의 부모는 User.prototype 인가요? true
        //new User()의 부모는 function User 인가요? false(자바와 동일)
        //new USer()의 조상은 function Object 인가요? Object.prototype 인가요?
        //function 은 선언해놓은 단지 문자열인 거 뿐이고 그것을 기준으로 만든 prototype
        //이 객체의 부모나 조상이 된다.
        //const user=new User();
        //user.__proto__== 상속받고 싶은 프로토타입이나 객체 (Mem.prototype)
        //clas User extends Mem{} : (js가 java의 문법을 따라한다. 문법적 설탕)

        //자바는 프로토타입이라는 미완성 객체를 미리 만들어 놓지 않고
        //정의된 타입(class) 를 보고 객체를 생성한다.
        Member mem=new Member();
        //new Member() 부모는 class Member 인가요? false
        //=>자바에서는 객체의 자신의 class가 객체의 타입인 거 뿐이지 부모가 될 수 없다.(==js)
        //new Member() 조상은 class Object 인가요? true
        //자바에서는 객체를 조상 취급하지 않는다. type class 를 조상 취급한다.
        //js는 프로토타입이 객체기 때문에 객체가 조상이 될 수 있다.
        Parent p=new Member();
        Object o=new Member();
        //new Member() 를 만들때 new Parent()와 new Object()가 만들어져서
        //new Member().super=new Parent().super=new Object()

        Parent p2=new Parent();
        //p2(new Parent())가 p에 부모인가요?
        //p.super=p2; p.__proto__=p2,p2.prototype

        System.out.println(mem.age);
        System.out.println(mem.name);

        System.out.println(p.age); //Parent p=new Member();
        //System.out.println(p.name);
        //기본형 큰타입을 작은타입으로 변경 =>강제(o) Casting
        //Parent->Member (강제 : 부모타입이 자식보다 더 적게 정의되어 있기때문)

        System.out.println( ((Member)p).name);
        //User s2=(User)p;
        Member upMem=(Member) p;
        //User u=(User)p;
        //java의 저버전에서는 p의 자식이 Member 인지 User 인지 몰라서 실행시 오류
        //현재버전에서는 p의 자식이 누구인지 확인하고 자식이 아니면 캐스팅을 못하게
        //컴파일 시 오류를 발생
    }
}
class Parent extends Object{
    int age=38;
}
class Member extends Parent{
    String name="경민";
    public Member(){
        //Member.prototype.__proto__=Parent.prototype; (함수 내부에서 상속)
        //super=Parent;(X)
        //super=new Parent();(X)
    }
}
//new Meber() => Memeber 와 Parent 객체가 동시에 생성된다.
//function A(){this.a="안녕"} function B(){B.prototype.__proto__=A.prototype;}
//function A(){this.a="안녕"} function B(){B.prototype.__proto__=new A()}

//new B().a  =>"안녕"
