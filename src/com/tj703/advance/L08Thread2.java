package com.tj703.advance;

import javax.swing.*;
import java.util.Date;
class DigiClock extends JFrame {

}

public class L08Thread2 {
    public static void main(String[] args) {
        //Thread 생성 1 : 재사용이 곤란한 코드(콜백함수를 생성과 동시에 실행)
        new Thread(()->{
            while (true){
                System.out.println(new Date());
                try {
                    Thread.sleep(1000);
                    //잠시 thread를 쉬게하는 함수
                } catch (InterruptedException e) {
                    throw new RuntimeException(e);
                }
            }
        }).start();
        System.out.println("메인이 스레드를 생성해서 독점되지 않으면 실행되는 코드!");
    }
}
