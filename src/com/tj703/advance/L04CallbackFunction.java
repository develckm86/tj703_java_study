package com.tj703.advance;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class L04CallbackFunction {
    JFrame frame=null;
    JButton btn=null;
    JLabel label=null;
    class BtnHandler implements ActionListener{
        @Override
        public void actionPerformed(ActionEvent e) {
            label.setText(label.getText()+"클릭");
        }
    }
    //main 완전히 다른영역 => 클래스의 필드를 사용하려면 인스턴스화(객체생성)
    public static void main(String[] args) {
        L04CallbackFunction o=new L04CallbackFunction();
        o.frame=new JFrame("콜백함수의 이해");
        o.frame.setBounds(500,1500,300,300);
        o.frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        o.btn=new JButton("버튼입니다.");
        o.btn.addActionListener(o.new BtnHandler());
        o.frame.add(o.btn, BorderLayout.SOUTH);
        o.label=new JLabel("나는 라벨입니다.");
        o.frame.add(o.label);
        o.frame.setVisible(true);
    }
}
