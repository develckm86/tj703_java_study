package com.tj703.study;

import java.util.Arrays;

public class L14Array {
    public static void main(String[]args){
        //순서(index)가 있고 길이가 있는 자료 Array
        int [] arr={}; //배열을 리터럴 선언하는 방법
        int [] nums={1,2,3,4};// (, ) : 자동으로 삭제
        //nums={1,2,3}; //리터럴 선언법은 꼭 변수를 선언하면서 대입해야합니다.
        //nums=new int[3];
        System.out.println(nums[0]);
        System.out.println(nums[1]);
        System.out.println(nums[2]);
        //js는 index 밖의 자료를 참조하면 undefined
        //java 오류 IndexOutOfBoundsException(index 가 Array 객체의 길이에서 벗어났다)
        //System.out.println(nums[3]);
        //System.out.println(nums[4]);
        int [] numArr=new int[4]; //리터럴 선언법 x, 배열 객체를 생성  {0,0,0,0}
        System.out.println(numArr[0]);
        System.out.println(numArr[1]);
        System.out.println(numArr[2]);
        System.out.println(numArr[3]);
        //System.out.println(numArr[4]);
        //java의 Array는 길이가 변하지 않는다.(push,pop x : 배열의 길이를 변화시키는 함수)
        //js는 Array가 존재하지 않고 java의 ArrayList 와 유사한 객체가 만들어진다. 길이변화가 가능하다.
        //java Array toString()이 재정의 되어 있지 않아서 타입+메모리 주소가 출력
        System.out.println(numArr);// [I@a09ee92

        String [] strArr={"안녕","하세요!"};
        System.out.println(strArr); //[Ljava.lang.String;@30f39991
        Integer [] objIntArr={1,2,3,4}; //Integer :int의 랩퍼타입
        System.out.println(objIntArr);//[Ljava.lang.Integer;@452b3a41
        // [ : Array
        // [LType;@주소 : 자료형을 참조하는 Array
        // [ I,Z,C..@주소 : 기본형 int 참조하는 Array
        boolean [] booleArr={true,false,true,true};
        boolean [] booleArr2={true,false,true,true};
        System.out.println(booleArr);
        System.out.println(booleArr2);
        char [] charArr={'안','녕','한','가'}; //"안녕"을 선언하면 {'안','녕'}이 생성된다.
        System.out.println(charArr);//문자열인척 출력된다.

        //System.out.println(booleArr+booleArr2); //배열은 더하기 연산이 안된다.
        System.out.println(charArr+"요?"); //캐릭터 배열도 더하기 연산을 할 수 없다.
        //{'안','녕','한','가','요','?'};
        char [] charArr2={'요','?'};
        //System.out.println(charArr+charArr2);

        //Arrays : [] 배열을 지원하는 클래스 (기본형의 랩퍼 클래스와 유사)
        System.out.println(Arrays.toString(numArr));
        System.out.println(Arrays.toString(booleArr));
        System.out.println(Arrays.toString(charArr));
        //System.out.println(nums==objIntArr);
        int [] nums2={1,2,3,4};
        System.out.println(nums==nums2);
        //자료형끼리 동등비교는 완전히 같지 않는 이상 무조건 false
        System.out.println(nums.equals(nums2)); //[].equals 가 재정의 되어 있지않음
        System.out.println(Arrays.equals(nums,nums2));
        //System.out.println(Arrays.equals(nums,objIntArr));
        //equals 는 다른 타입을 비교할 수 없다.

        //for 반복문 (선언문;조건문; 증감식)
        //선언문(초기문) : 최초 한번 만 동작
        //조건문 : 조건이 true 이면 해당 블럭을 반복 실행, false 면 블럭을 실행하지 않고 종료
        //증감문 : 초기에 선언한 값에 증감을 주어 조건을 변화시킨다. (;을 사용하지 않는 이유)
        System.out.println("증가 반복문 실행 ");
        for(int i=0; i<nums.length; i++){
            System.out.println(nums[i]);
        }
        System.out.println("감소 반복문 실행 ");
        for(int i=nums.length-1; i>=0; i--){
            System.out.println(nums[i]);
        }
    }
}
