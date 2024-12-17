package com.tj703.study;

public class L12IfElse {
    public static void main(String[] args) {
        //if  : 어떤 상황이 생기면 그 상황을 판단해서 분기를 만들어내는 것
        int age=17;
        //비교연산자 ==
        //자료형의 동등비교 연산 : 완전히 같은지 물어본다.(크기를 비교할 수 없다.)
        //기본형의 비교 연산 : 값을 비교하기 합니다.

        System.out.println("경민"=="경민"); //true 종종 false
        //면접 : 문자열은 리터럴하게 선언하면 기본형 처럼 존재하는 객체를 참조하기 때문에
        //동등비교연산시 true 를 반환합니다. 하지만 통신상황("경민"을 통신으로 받았을 때)에서는
        //같은 객체를 참조한다는 보장이 없습니다. 때문에 문자열은 동등비교연산이 아니라
        //필드의 값을 비교하는 equals 를 사용해야합니다.

        System.out.println("경민"==new String("경민"));
        //종종 false 가 나오는 이유는 다음의 이유와 같다.

        System.out.println(new Object()==new Object());
        //문자열을 제외한 모든 객체는 나자신을 비교하지 않는이상 무조건 false
        //자료형은 equals 로 꼭 비교해야합니다!!
        //(js는  equals가 없다. : js 는 기본형만 동등비교연산 해야합니다.)

        System.out.println(17 == 17.0);
        System.out.println(age>20);
        System.out.println(age>=17);
        System.out.println(age<20);
        System.out.println(age<=15);
        //System.out.println("경민">"최경민");



        if(age>=20){
            System.out.println("소맥을 마십니다.");
        }else{
            System.out.println("제로 팹시를 마십니다.");
        }
        //if : 소괄호 안에 비교연산의 결과가 true 일때만 내부 블럭(scope)을 실행합니다.
        //else : if의 조건이 맞지 않으면 실행되는 블럭
    }
}
