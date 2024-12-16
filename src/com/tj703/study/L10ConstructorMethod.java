package com.tj703.study;
class OutType{
    //InType in=new InType();
    InType in=this.new InType();
    //this == new OutType() : this 는 객체 자신

    class InType{
        //OutType 내부에서만 사용되는 자료의 타입을 정의
        int a=0;
        int b; //기본형은 null or undefined 를 정의할 수 없다.
        // 때문에 undefined 상태로 기본형 필드를 정의하면 자동으로 0이 된다.
        double d;//0.0
        float f;//false
        char c;//  :문자표의 null
        //기본형에서 없다 라는 데이터 == 0
    }
}
public class L10ConstructorMethod {
    //main에서 User 객체를 생성하세요. User 는 필드로 age,name 가 있고 둘다 생성자로 초기화해야 합니다.
    class User{

    }
    public static void main(String[] args) {





        //inner class
        OutType out=new OutType();
        System.out.println(out.in.a);
        System.out.println(out.in.d);
        System.out.println(out.in.f);
        System.out.println(out.in.c);

        //보통 innerClass 를 다른 곳에서 잘 정의하지 않지만 굳이 한다면...
        //OutClassName.InClassName (type)
        //new OutClassName().new InClassName() (객체)
        OutType.InType in=new OutType().new InType();//(이렇게는 거의 사용되지 않는다.)
        out=new OutType();

        OutType.InType outIn=out.new InType(); //조금 사용될 가능성이 있다.




    }
}
