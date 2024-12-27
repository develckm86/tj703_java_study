package com.tj703.advance;

import java.util.*;
import java.util.function.Consumer;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class L09StreamAPI {
    public static void main(String[] args) {
        //StreamAPI 반복문 작성을 편하게 하고 반복 함수(콜백함수)를 재사용하기 위한 내부 반복문
        List<Integer> nums=new ArrayList();
        nums.add(11);
        nums.add(21);
        nums.add(31);
        nums.add(41);
        nums.add(51); //{11,21,31,41,51}
        //index로 조회 : 속도가 느리다.
        for(int i=0; i<nums.size(); i++){
            System.out.print(nums.get(i)+", ");
        }
        System.out.println("");
        //iterator 외부반복문
        for(int num : nums){
            System.out.print(num+", ");
        }
        System.out.println("");
        //iterator 내부반복문 -> 내부적으로 반복호출하는 콜백함수를 재사용할 수 있기 때문
        Consumer callBack=new Consumer<Integer>() {
            @Override
            public void accept(Integer integer) {
                System.out.print(integer+", ");
            }
        };
        callBack=(num)->{
            System.out.print(num+",  ");
        };
        nums.forEach(callBack);
        int [] numArr={44,55,66,77};
        //[] Array 가볍기 때문에 forEach 가 없다.
        //js Array 같은 타입없이 대부분의 배열타입은 forEach 가 존재 HtmlCollection
        //java array 내부반복문이 안되어서 욕 바가지로 먹는다....
        //겁나 빠른 반복문용 자료형을 만들어서 모든 자료형을 내부반복문을 사용할 수 있게 만든것 =>Stream
        Stream numStreams =nums.stream(); //Stream : 자료형 전용 스트림
        IntStream numArrStreams=Arrays.stream(numArr);
        //(Byte,Short,Int...)Stream : 기본형 전용 스트림
        numStreams.forEach((n)->{});
        //numArrStreams.forEach((n)->{}); //스트림은 일회용 자료
        //filter, map, allMatch
//        OptionalDouble avg=numArrStreams.average();
//        avg.ifPresent((n)->{
//            System.out.println("평균 값 :"+n);
//        });
        //IntStream numArrStreams2=numArrStreams.map((n)->{return n/10;});
        System.out.println("");
        numArrStreams
                .map((n)->{return n/10;})
                .forEach((n)->{
                    System.out.print(n+", ");
                });
        //스트림 반환하는 함수를 chain 으로 연결할 수 있다.
    }
}
