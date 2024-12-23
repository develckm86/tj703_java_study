package com.tj703.study;

public class L21Override {
    class A{
        String str="A.str 안녕!";
        public int add(int a,int b){
            int add=0;
            add=a+b;
            return add;
        }
    }
    /*
    * B b=new B()
    * b.str;//"B.str 안녕"
    * A a=b;
    * a.str;//"B.str 안녕!" =>동적디스패치 (x)
    * a.str;//"A.str 안녕!" =>정적디스패치 (o)
    *
    * a.add(10,20)//=> B.add(10.20) => 동적디스패치 (o)
    * a.add(10,20)//=> A.add(10.20) => 정적디스패치 (X)
    * */
    class B extends A{
        String str="B.str 안녕!";
        //A의 add 가 마음에 들지 않아서 재정의(==Override) 하기로 함
        @Override //컴파일러가 부모의 함수를 재정의하고 있는지 검사하고 컴파일하게 하는 어노테이션
        //@ 어노테이션 : 컴파일러에게 검사나 자동완성을 시키는 것
        public int add(int a,int b){
            //int add=a+b;
            int add=super.add(a,b); //new A().add(a,b)
            System.out.println(add);
            return add;
        }
    }

    public static void main(String[] args) {
        L21Override o=new L21Override();
        B b=o.new B();
        //System.out.println(b.add(15,19));
        b.add(30,55);
        System.out.println(b.str); //부모의 필드 str 을 재정의

        A a=o.new B(); //부모의 필드만 필요하지 B의 필드는 필요없어.
        System.out.println(a.str);
        //b가 참조하는 객체가 A로 형변환 했다. (X)®
        //b를 참조하던 객체를 타입이 A인 변수 a가 참조했다.(O)
        int add= a.add(33,88);
        //원래는 A.add(33,88)가 호출(dispatch)되지 않는 이유는 자바가 동적 디스패치를 이용해
        // 재정의된 add가 호출되도록 하였다. => 프로그래머의 편의성(유연성,재사용성)을 위해(**)
        //정적디스패치 : 컴파일 시점에 함수나 필드의 위치 (눈에 보이는 그대로)
        //동적디스패치 : 객체를 생성했을 때 할당된 메모리(V-Table)에서 함수나 필드를 호출
        //V-Table(Virtual Method Table) : 객체를 생성하면 정의된 메서드의 주소를 저장하는
        //목차(index)로 재정의된 함수만 존재합니다.(부모의 함수가 존재하지 않음)


        //다형성 : 하나의 이름으로 여러 역할을 하는 객체지향 문법입니다.
        //override : 부모와 자식이 같은 이름의 함수를 갖지만 자식이 재정의하면 자식의 함수가
        //호출되는 것 역시 객체지향 문법 다형성에 해당한다.
        //타입 다형성, Overload, Override (면접)

    }
}
