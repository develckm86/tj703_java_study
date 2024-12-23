package com.tj703.study;
import com.tj703.homewok.AccessTest;

class AccessA{
    int a=10; //default : 같은 패키지(폴더)에 있는 클래스는 접근가능
    private int b=20; //private : class 내부에서만 접근가능
    public int c=30; //public : 누구나다 접근 가능
    protected int d=40;
    //protected : 상속(하위 클래스)하는 관계, 같은 패키지에서 접근 가능
    //보안순서
    //private > protected > default > public

    //**public class A  : 해당 class A가 다른 패키지에서 import 되는,java 문서의 주인
    //A.java =>pubic class A{} class B{} class C{}
    //컴파일하면 A.class B.class C.class 3개의 문서가 발행됩니다.
    //이중에 A.class 만 다른 패키지에서 import 가능
}
class AccessB extends AccessTest{
    public String publicStr=super.str;
    //public String defaultStr=super.str2;
    public String protectdStr=super.str3;
    //public String privateStr=super.str4;

}

public class L23AccessModifier {
    //접근지정자
    public static void main(String[] args) {
        AccessA a=new AccessA();
        System.out.println(a.a);
        //System.out.println(a.b);
        System.out.println(a.c);
        System.out.println(a.d);

        AccessTest test=new AccessTest();
        System.out.println(test.str); //public
        //System.out.println(test.str2); //default
        //System.out.println(test.str3);//protected
        //System.out.println(test.str4);//private
        //캡슐화 : 사용할 부분만 내어놓고 나머진 사용 못하게 하는 객체지향문법
        //(사용자 인터페이스 개선 불필요한 사용을 막아 오류를 예방)
        //컴퓨터가 케이스가 없고 전원버튼이 없다. => 전원을 켜기 위해 노력해야한다.
        //컴퓨터를 케이스로 막고 전원버튼만 내놓는다. => 전원을 켜기 쉽다. (캡슐화)
        //함수의 캡슐화 : 매개변수와 리턴으로 캡슐화 진행

        /*js 2020 private
        class A{
          constructor(){
            this.a=10; //public
            this.#b=20; //#private (외부에서 참조 불가능)
            this._c=30; //_protected (기능은 없는데 개발자간의 약속 :네이밍 컨벤션 )
          }
         */

        AccessB c=new AccessB();
        //System.out.println(c.str3);


    }

}
