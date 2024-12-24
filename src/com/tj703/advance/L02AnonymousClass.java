package com.tj703.advance;

import java.awt.*;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.awt.event.WindowListener;

public class L02AnonymousClass {
    public static void main(String[] args) {
        Frame frame=new Frame("익명클래스");

        WindowListener windowHandler=new WindowAdapter() {
            @Override
            public void windowClosing(WindowEvent e) {
                System.exit(0);
            }
        };//WindowHandler class 와 동일한 구조의 익명 클래스(1,2,3.. 임의의 수)가 생성됨
        //L02AnonymousClass$1.class
        //$:내부 클래스
        //1:익명 클래스 (interface 나 abstract class 를 객체로 만들때 자동생성된 익명클래스 이름)

        //new AbstractClass(){};
        //new Interface(){};
        //익명의 클래스를 만들어서 그것을 구현하는 클래스를 객체로 생성하겠다.
        frame.addWindowListener( windowHandler);
        //frame.addWindowListener((e)->{});
    }
}
