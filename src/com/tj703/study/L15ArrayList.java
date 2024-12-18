package com.tj703.study;
import java.util.ArrayList;
import java.util.concurrent.atomic.AtomicInteger;

public class L15ArrayList {
    public static void main(String[] args) {
        //자바의 배열
        //1. [] Array: 가볍고 심플하게 정의되어 길이를 수정할 수 없는 배열 타입 (자료형)
        //2. ArrayList, LinkedList .. : pop->remove,push->add 처럼 배열의 길이를 수정할 수 있고
        // 배열의 처리를 지원하는 함수가 다수 존재하는 배열 타입
        int [] numArr={11,22,33}; //Array
        numArr[1]=222;
        System.out.println(numArr[1]); //배열의 특정 인덱스의 데이터를 바꾸는 것은 가능!
        //numArr[3]=444; //배열 길이를 벗어난 것을 참조(대입)할때 오류 발생
        //numArr.push(444);
        ArrayList numList=new ArrayList();
        numList.add(11);
        numList.add(22);
        numList.add(33); //리터럴하게 값을 대입할 수 없다.
        //js : numList.push(44);
        //java : numList.add(44);
        //push(add) : 배열의 마지막에 값을 추가하는 것
        //pop : 배열의 마지막에 값을 빼는 것

        System.out.println(numList); //Object.toString 을 재정의

        numList.add(44);
        System.out.println(numList);
        numList.add(1,100);
        System.out.println(numList);
        numList.removeLast(); //== pop()
        System.out.println(numList);
        numList.remove(1);
        System.out.println(numList);
        numList.remove(Integer.valueOf(22));

        ArrayList<Integer> objNumList=new ArrayList<>();
        objNumList.add(Integer.valueOf(11));
        objNumList.add(Integer.valueOf(22));
        objNumList.add(Integer.valueOf(33));
        System.out.println(objNumList);
        objNumList.remove(Integer.valueOf(22));
        System.out.println(objNumList);

        Integer objInt=Integer.valueOf(22);
        Integer objInt2=Integer.valueOf(22);
        System.out.println(objInt==objInt2);
        System.out.println(objInt.intValue()==objInt2.intValue()); //위에서 자동으로 하는 일

        //기본형 랩퍼클래스는 동등비교연산시 기본형을 반환해서 비교
        //== 동등비교연산은 자료형은 할수 없어! 랩퍼클래스 대신 기본형 비교해 자동으로 연산을 진행합니다.
        System.out.println(objInt.equals(objInt2));
        ArrayList<String> strList=new ArrayList();
        strList.add("자바");
        strList.add("자바스크립트");
        strList.add("파이썬");
        strList.add("스프링");
        System.out.println(strList);
        strList.remove("파이썬");
        System.out.println(strList);

        //ArrayList 의 내부 반복문 : 함수(callback func)를 반복실행 함수(forEach)를 제공
        AtomicInteger i=new AtomicInteger(0); //int i=0;
        //java 람다식 : ()->{}
        strList.forEach((item)->{
            System.out.println((i.getAndIncrement())+":"+item); //i++
        });

        //모든 배열 객체는 Iterable 하다. => iterator 반복문 사용가능
        //for(let str of strList){}
        int n=0;
        for(String str : strList){
            System.out.println((n++)+" : "+str);
        }

    }
}
