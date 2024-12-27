package com.tj703.advance;

import javax.swing.*;
import java.awt.*;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.awt.event.WindowListener;
import java.util.Date;
class DigiClock extends JFrame {
    JLabel screen;
    JButton startBtn;
    JButton stopBtn;
    Thread clockThread;
    boolean isClock;
    public DigiClock(String name){
        super(name);
        this.setBounds(700,1500,300,300);
        this.addWindowListener(new WindowHandler());
        startBtn=new JButton("start");
        stopBtn=new JButton("stop");
        screen=new JLabel("디지털 시계");
        screen.setHorizontalAlignment(SwingConstants.CENTER);
        this.add(stopBtn, BorderLayout.EAST);
        this.add(startBtn, BorderLayout.WEST);
        this.add(screen);
        startBtn.addActionListener((e)->{
            clockThread=new Thread(()->{
                isClock=true;
                while (isClock){
                    screen.setText(new Date().toString());
                    try{Thread.sleep(1000);}catch (InterruptedException ex){}
                }
            });
            clockThread.start();
        });
        stopBtn.addActionListener((e)->{
            isClock=false;
            //null.stop();
            //if(clockThread!=null)clockThread.stop(); //1.2 버전이후로 중단
        });
        this.setVisible(true);
    }
    //Adapter : 인터페이스를 한번 구현한 추상클래스
    class WindowHandler extends WindowAdapter {
        @Override
        public void windowClosing(WindowEvent e) {
            //System.exit(0); //강제종료
            DigiClock.this.dispose(); //중첩클래스에서 부모클래스 참조법
            //창을 닫는 함수
        }

        @Override
        public void windowClosed(WindowEvent e) { //Frame.dispose() 화면이 꺼지면
            try{ Thread.sleep(2000);}catch(Exception ex){}
            System.exit(0);
        }
    }
}

public class L08Thread2 {
    public static void main(String[] args) {
        //Thread 생성 1 : 재사용이 곤란한 코드(콜백함수를 생성과 동시에 실행)
        new DigiClock("디지털시계");
        System.out.println("메인이 스레드를 생성해서 독점되지 않으면 실행되는 코드!");
    }
}
