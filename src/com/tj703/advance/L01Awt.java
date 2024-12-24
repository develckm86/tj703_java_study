package com.tj703.advance;

import java.awt.*;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

public class L01Awt {
    class WindowHandler extends WindowAdapter {
        @Override
        public void windowClosing(WindowEvent e) {
            //x 버튼 누른때 콜백함수
            System.exit(0); //JVM을 실행하는 콘솔을 종료해라
        }
    }
    public static void main(String[] args) {
        L01Awt o=new L01Awt();
        Frame frame=new Frame("자바의 GUI AWT");
        frame.addWindowListener(o.new WindowHandler());
        //js : 자바스크립트는 함수가 타입인 함수형 언어이기 때문에 함수를 매개변수로 작성할 수 있다.
        //      객체에 명시된 함수를 교체할 수 있다.
        //java: 자바는 객체지향언어로 객체나 기본형 데이터만 매개변수로 작성할 수 있다.
        //      함수는 데이터가 아니고 타입의 필드 때문에 매개변수로 사용할 수 없고
        //      타입을 객체로 만들어야 함수를 매개변수로 전달할 수 있다.
        //const windowHandler=function(){}
        //btn.addEventListener("click",windowHandler)
        //btn.onclick=windowHandler;(필드로 정의된 함수를 다른 함수로 교체)

        frame.setSize(200,200);//px
        frame.setLocationRelativeTo(null); //모니터를 기준으로 준간에 위치
        frame.setVisible(true);//윈도우가 모니터에 출력되는 모드
        //java 처음 만들어질때 window os가 뜨끈한 신상인 시절입니다.
        //마이크로소프트 회사에서 창을 생성하는 객체명세서를 줬는데...너무 어렵고 구현하기 힘들더라
        //GUI 잡스가 처음 만들고 서비스하려던 중(개발자에게 gui 개선을 요구)=> 마이크로소프트로 대거 이직
        //window 를 빠르게 만들어서 서비스해버림 => 객체가 조잡하고 구현하기 힘들어짐
        //Apple Window 가 창을 구현하기 위해 사용하는 언어와 객체가 완전히 달라서 => 낮은 생산성

        //java -> awt frame 사용하면 window, mac 도 창을 만들 수 있게 제공 => 대박!

    }
}
