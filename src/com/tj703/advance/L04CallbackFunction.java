package com.tj703.advance;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class L04CallbackFunction {
    public static void main(String[] args) {
        JFrame frame=new JFrame("콜백함수의 이해");
        //frame.setSize(300,300);
        frame.setBounds(500,1500,300,300);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        JButton btn=new JButton("버튼입니다.");
        //<html><p id="container"><button></></></>
        //container.append(btn);
        frame.add(btn, BorderLayout.SOUTH); //add(Component c)
        //상수(바뀌지 않는 수)의 개념 : 저장된 정보를 호출하기 위해 사용됨
        JLabel label=new JLabel("나는 라벨입니다.");
        frame.add(label);
        btn.addActionListener(new ActionListener(){
            @Override
            public void actionPerformed(ActionEvent e) {
                String txt=label.getText();
                txt+="\n클릭";
                label.setText(txt);
            }
        }); //Action==click
        //인스턴스 == 객체
        frame.setVisible(true);

    }
}
