package com.tj703.advance;

import java.util.Scanner;

public class L07Thread {
    public static void main(String[] args) {
        //스레드 : 일을 하는 단위
        //모든 프로그래밍 언어는 main thread 1개를 제공합니다.
        final boolean game=true;
        //final 상수 :(==const) 처음 대입한 대이터를 바꿀수 없음
        //람다식 말고 Runable 의 run 을 구현해서 콜백함수로 정의하세요!
        Thread gameThread=new Thread(()->{
            while(game){
                System.out.println("게임을 시작해볼까~");
                String inputStr= new Scanner(System.in).nextLine();
                System.out.println("당신이 입력한 글자는 :"+inputStr);
            }
        });//새로 생성된 일꾼이 실행할 콜백함수 정의
        gameThread.start(); //일꾼이 생성되면서 재정의된 run 콜백함수를 실행
        //js. window.setInterval(()=>{},1000) :1초마다 콜백함수를 실행하는 일꾼생성
        //js. window.setTimeout(()=>{},0) :1초뒤에 콜백함수를 실행하는 일꾼 생성
        System.out.println("안녕!");
        //일꾼 생성시 시간이 조금 걸려서 "안녕!" 을 main 스레드가 먼저 출력함

        //main 일꾼이 스레드만들고 "안녕" 출력 후 종료
        //main 일꾼이 만든 스레드는 계속 while 으로 일하는 중

    }
}
