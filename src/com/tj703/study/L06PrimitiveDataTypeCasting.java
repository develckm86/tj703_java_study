package com.tj703.study;

public class L06PrimitiveDataTypeCasting {
    public static void main(String []args){
        //기본형 데이터의 형변환
        int i=10;
        System.out.println(i);
        double d=i; //10이 double로 형변환
        //4byte 로 표현가능한 수가 8byte로 표현가능한 수로 변환하는 것은 아무런 이상이 없다.
        //**실수는 지수부가 존재하기 때문에 정수타입이 표현하는 데이터보다 훨씬 크기 때문에 아무런 문제가 없다.
        System.out.println(d);
        d=13.145;

        //i=d; (컴파일시 발견되는 오류)
        System.out.println(Integer.MAX_VALUE); //int로 작성할 수 있는 가장 큰수 (2147483647)
        //i= 3147483647; //jvm 은 정수를 21억 이상 표기할 수 없다.(표기와 대입 둘다 불가능)
        //i=3147483647L; //21억 이상 작성시에는 long의 정수를 표기한다고 명시해야한다.(대입x)
        System.out.println(Double.MAX_VALUE); //1*(10**308)
        //double 15개의 지수부 -309 ~ 308
        //float 7개의 지수부 -39 ~ 38
        System.out.println(Float.MAX_VALUE);

        long l=1;
        l=10000000000L;
        System.out.println(Long.MAX_VALUE);//922경
        //l=9223372036854775808L; //922경 보다 큰 정수를 표기할 수 없다.
        float f= 9223372036854775807.0F;
        d=9223372036854775807.0;

        //자바는 정수을 리터럴하게 표기하면 int로 작성됩니다.
        //자바는 실수를 리터럴하게 표히하면 double로 작성됩니다.
        //자바에서 21억보다 큰 정수를 리터럴하게 표기하려면 정수 끝에 l을 붙여서 long 타입 정수임을 명시해야 합니다.
        //자바에서 4byte의 작은 실수를 리터럴하게 표기하려면 실수 끝에 f을 붙여서 float 타입 실수임을 명시해야 합니다.

        System.out.println(f);
        //9223372 036854775807.0
        //9.223372E18  : 9223372(가수부) 18(지수부)
        //9223372000000000000
        System.out.println(d);
        //9223372036854775 807.0
        //9.223372036854776E18 : 9223372036854776 (가수부) 18(지수부)
        //9223372036854776000

        //실수의 가수부가 long 보다 작아서 가수부의 탈락이 발생한다 => 정확도가 떨어지게 된다.
        //이렇게 가수가 작으면 정확도가 떨어져서 자바는 실수표기의 기본을 double로 지정하였다.

        //** 작은 수는 큰 정수 타입의 변수에 바로 대입가능
        //큰정수 타입은 작은 변수 타입에 대입 불가능
        //모든 정수는 실수 타입에 대입가능 하지만 가수부 보다 큰정수는 정확도가 떨어진다.
        //flot 실수는 double 바로 대입가능 하지만 double의 실수는 float에 대입불가능

        //f=1E308; //(x)
        //f=1e308f;//float가 정의할 수 없는 큰수는 작성 불가능!


        //불가능한 것을 Casting 으로 강제형변환 (parsing : 완전히 다른 타입의 데이터를 변환 String=>int,String=>Oject)
        //Casting은 부모자식 또는 기본형이면 수끼리 형변환
        //( Object(String객체) => String :자료형, int->byte :기본형 )
        //byte b=128; //byte -128 ~ 127
        byte b=(byte)128;
        //1.byte가 표현할 수 있는 가장 큰수로 표현 or (Infinity)
        //2.자바는 수를 순환 반복시켜서 정수를 뽑아낸다.
        System.out.println(b);
        b=(byte)130; //??
        System.out.println(b);
    }
}
