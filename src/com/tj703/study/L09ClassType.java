package com.tj703.study;
import java.util.ArrayList; //java에서 제공하는 기본 라이브러리(java.util)
class DataType{
    //타입에는 필드(전역변수)와 메소드(생성자+메소드)를 정의할 수 있다.
    //타입에는 필드를 정의할 수 있는데 필드에는 전역변수,메소드,생성자가 있다.

    //필드와 메소드는 꼭 전역( class 의 첫번째 블럭 scope )에 선언합니다.
    int age=38;
    String name="최경민";
    //메소드  : 실행(연산)의 집합 (재사용)
    //{영역==scope}
    ArrayList familyNames=new ArrayList(); //ArrayList는 배열 자료형
    //function add(a,b){} : 일반적인 함수 선언으로 호이스팅이 발생
    //(코드를 실행하기 전에 컴파일하면서 이름있는 메소드를 메소드영역 메모리에 미리 저장함)
    //const add=function(a,b){} : 익명함수를 변수가 참조하는 형식(익명함수는 선언시점에 실행되면서 메모리에 저장됨)

    //생성자(class에 꼭 1개 이상 존재하고,객체 생성시 필드를 재정의하기 위해 존재)
    //constructor(){}
    public DataType(){//==default 생성자 : 개발자가 정의하지 않아도 한개 존재함
        //public(접근지정자:다른 package[폴더]에서 접근가능) : 외부에서 객체를 생성하려면 꼭 public
        //ClassName (생성자이름) : 생성자의 이름은 꼭 class 이름과 같다.
        //return type(void) 반환타입이 생략 : 생성자를 호출하면 반환되는 객체의 타입이 생성자의 이름과 같다.
        //(**반환타입이 정의되어 있고 생성자의 이름(construct)을 생략!!)

        //생성자를 new 연산자와 같이 호출하면 객체를 반환
    }
    public DataType(String name){
        //객체 생성시 필드 name 을 재정의(초기화) 하겠다.
        this.name=name;
        //this==객체자신
        //this.name : 객체에 선언된 필드 name
    }
    public DataType(String name,int age){
        this.name=name;
        this.age=age;
    }

    public void add(int a, int b){
        //add 함수는 해당 타입이 객체가 되었을 때 필드로 존재
        //int a, int b ==> 매개변수, 파라미터, argument (함수의 연산에 값을 제공하여 결과를 바꾼다.)
        int result=a+b;
        System.out.println("a+b="+result);
    }
    //오버로드(오버로딩) : 이름은 같은데 매개변수의 수나 타입이 다른것 (작명이 싫어서)
    //js는 오버로드가 안되는데 대신 매개변수의 기본값을 줄 수 있다.  add(a,b,c=0)
    //다형성(면접!!) : 이름은 한개인데 역할이 여러개 (객체지향 문법==사람이 생각하는 대로 코딩하는 법)
    public void add(int a,int b,int c){
        System.out.println("a+b+c="+(a+b+c));
    }
    //java,js는 반환값을 1개만 작성 (dart 언어는 여러개 가능)
    public int add(int a,int b,int c,int d){
        int add=0;
        add=a+b+c+d;
        return add;
    }
}//어플에서 사용할 자료의 타입
public class L09ClassType {
    //main 어플의 실행의 집합 == 어플 (L09ClassType.main())
    public static void main(String []args){
        //Class 와 type
        //Class 는 자료형 데이터의 타입 (data type)
        new DataType(); //객체(자료형 데이터)를 생성
        DataType data=new DataType(); //객체를 변수가 참조하는 법
        //const data=new DataType();
        //js는 타입을 명시하지 않는다.-> 동적 타입 언어 (객체의 타입을 엔진이 알아서 정의)
        System.out.println(data.age);
        System.out.println(data.name);
        //{age:38,name:"최경민"} js object 를 생성하는 방법 (자바 x)
        data.add(100,201);
        //data.add();-> data.add(undefined,undefined);
        data.add(101,201,301);
        //main()에서는 패키지 내부(같은 폴더)에 있는 클래스는 바로참조가능 (L01HelloJava)
        //만약 패키지 외부에 있는 클래스는 import 해서 사용
        L01HelloJava hello=new L01HelloJava();

        data=new DataType("홍길동");
        System.out.println(data.name);
        //문제) name, age를 초기화하는 생성자를 만든 후 객체를 생성하세요!

        data=new DataType("둘리",41);
        System.out.println(data.name);
        System.out.println(data.age);
        //반환값(return) : 함수가 실행되면 그자리에 톡 떨어지는 것
        System.out.println("a+b+c+d="+data.add(10,20,30,40));

        int add=data.add(101,201,301,401);
        System.out.println("a+b+c+d="+add);
    }
}
