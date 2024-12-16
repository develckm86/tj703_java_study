package com.tj703.study;
import java.util.ArrayList; //java에서 제공하는 기본 라이브러리(java.util)
class DataType{
    //타입에는 필드와 메소드를 정의할 수 있다.
    //필드와 메소드는 꼭 전역( class 의 첫번째 블럭 scope )에 선언합니다.
    int age=38;
    String name="최경민";
    //메소드  : 실행(연산)의 집합 (재사용)
    //{영역==scope}
    ArrayList familyNames=new ArrayList(); //ArrayList는 배열 자료형
    //==function add(a,b){}
    //==const add=function(a,b){}
    public void add(int a, int b){
        //add 함수는 해당 타입이 객체가 되었을 때 필드로 존재
        //int a, int b ==> 매개변수, 파라미터, argument (함수의 연산에 값을 제공하여 결과를 바꾼다.)
        int result=a+b;
        System.out.println("a+b="+result);
    }
    //오버로드(오버로딩) : 이름은 같은데 매개변수의 수나 타입이 다른것
    //js는 오버로드가 안되는데 대신 매개변수의 기본값을 줄 수 있다.  add(a,b,c=0)
    public void add(int a,int b,int c){
        System.out.println("a+b+c="+(a+b+c));
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

    }
}
