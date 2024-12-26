package com.tj703.advance;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class L04CallbackFunction {
    static JFrame frame=null;
    static JButton btn=null;
    static JLabel label=null;
    //static == 정적
    //static class :정적 중첩(내부)클래스는 외부의 클래스와 별개로 인스턴스화 가능
    static class BtnHandler implements ActionListener{
        @Override
        public void actionPerformed(ActionEvent e) {
            label.setText(label.getText()+"클릭");
        }
    }
    //main 완전히 다른영역(static) => 클래스의 필드를 사용하려면 인스턴스화(객체생성)
    //static : 미리 메모리에 저장해 놓는거
    static class One implements ActionListener{
        @Override
        public void actionPerformed(ActionEvent e) {

        }
    }

    public static void main(String[] args) {
        frame=new JFrame("콜백함수의 이해");
        frame.setBounds(500,1500,300,300);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        btn=new JButton("버튼입니다.");
        //btn.addActionListener(new L04CallbackFunction.BtnHandler());
        //btn.addActionListener(new L04CallbackFunction().new BtnHandler());
        //btn.addActionListener(new BtnHandler());
        frame.add(btn, BorderLayout.SOUTH);
        label=new JLabel("나는 라벨입니다.");
        btn.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                label.setText("익명클래스의 콜백함수 click");
                //같은 main의 자식 영역(scope)에서 참조하는 것 같지만
                //main 의 형제인 class 1에서 label을 참조 중이다.
                //class 1의 부모 class 영역에 static 필드로 정의합니다.(컴파일러)
            }
        });

        frame.add(label);
        frame.setVisible(true);
    }
}
