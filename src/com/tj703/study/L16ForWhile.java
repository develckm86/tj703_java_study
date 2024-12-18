package com.tj703.study;

public class L16ForWhile {
    public static void main(String[] args) {
        //어떤 분기를 반복 실행할때 사용하는 while for 반복문
        /*
        while (true){
            System.out.println("안녕!");
        }
        */
        //어떤 분기를 조건을 주어 반복실행 (선언문, 조건문, 증감문)
        int n=0;//조건의 선언문
        while(n<3){ //조건문
            System.out.println(n+": 안녕");
            n++;//증가문
        }
        //for 반복문 : 선언문,조건문, 증감문을 한코드에 작성 (길이가 존재하는 반복문을 작성할때 유리)
        for(int i=0; i<3; i++){
            System.out.println(i+": 잘가");
        }
        String [] strArr={"class","String","for","while","+","-"};
        for(int i=0; i<strArr.length; i++){
            System.out.println(i+":"+strArr[i]);
        }
        for(int i=strArr.length-1; i>=0; i--){
            System.out.println(i+":"+strArr[i]);
        }
        //시작점부터 끝지점까지만 반복실행할수 있는 Iterator와 달리 for문을 직접 작성하면
        //복잡한 분기의 반복이나 역순을 참조할 수 있다.


    }
}
