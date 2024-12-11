package com.tj703.study;

public class L03Variable {
    public static void main(String[] args) {
        //소문자로 작성하는 모든 타입은 기본형
        //자바는 수로된 데이터만 기본형으로 명시
        int i=13; //int i : 변수 i는 Integer만 참조하겠다.
        System.out.println(i*i);
        boolean t=true;
        //System.out.println(t+t); //오직 숫자인 타입만 수학적 연산 가능
        char c='r';
        System.out.println(c+c);//char는 인코딩 번호이기 때문에

        double d=13.3;
        System.out.println(d);
        System.out.println(d*12);


    }
}
