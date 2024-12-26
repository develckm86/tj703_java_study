package com.tj703.advance;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

class ClickGameFrame extends JFrame {
    //JFrame frame=null;
    JButton northBtn; //=null 자동으로 대입
    JButton southBtn;
    JLabel label;
    //static class 1 implements ActionListener{}
    public ClickGameFrame(){
        super("클릭게임프레임");
        northBtn =new JButton("클릭해주세요~");
        southBtn =new JButton("초기화");
        label=new JLabel("나는야 라벨");
        northBtn.addActionListener(new ActionListener() { //new 1()
            @Override
            public void actionPerformed(ActionEvent e) {
                String text=label.getText();
                text+=" 클릭했수다!";
                label.setText(text);
            }
        });
        //southBtn.addActionListener(new ResetBtnHandler());
        //자바에서 콜백함수를 정의해서 매개변수를 쓰려면 코드도 길고 복잡하다.
        //=>익명클래스 쓰면 되지않아요? -> 그래도 길고 별로야! (jvm=>문법이 다른 코틀린)
        //자바도 함수형 언어처럼 매개변수를 함수로 보낼수 있어! 사기(문법적)=>람다식
        southBtn.addActionListener((e)->{
            label.setText("");
        });

        this.add(northBtn, BorderLayout.NORTH);
        this.add(southBtn,BorderLayout.SOUTH);
        this.add(label,BorderLayout.CENTER);
        this.setSize(400,400);
        this.setLocation(700,1500);
        this.setDefaultCloseOperation(this.EXIT_ON_CLOSE);
        this.setVisible(true);
    }
    class ResetBtnHandler implements ActionListener{
        @Override
        public void actionPerformed(ActionEvent e) {
            label.setText("");
        }
    }



}


public class L05CallbackFunction2 {
    public static void main(String[] args) {
        new ClickGameFrame(); //생성만하면 화면에 프레임이 뜨게 작성
    }
}
