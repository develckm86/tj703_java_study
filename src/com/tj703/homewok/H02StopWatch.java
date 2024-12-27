package com.tj703.homewok;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

class StopWatch extends JFrame {
    private JButton startBtn;
    private JButton stopBtn;
    private JButton resetBtn;
    private JLabel screen;
    private JPanel p;
    private long sec=0;
    private long millSec=0;
    private boolean isRun=false;
    public StopWatch(){
        super("스톱와치");
        this.setBounds(750,1500,300,300);
        this.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        screen=new JLabel("스톱와치");
        screen.setHorizontalAlignment(SwingConstants.CENTER);
        startBtn=new JButton("시작");
        stopBtn=new JButton("정지");
        resetBtn=new JButton("초기화");
        p=new JPanel();
        this.add(screen);
        startBtn.addActionListener(new StartBtnHandler());
        stopBtn.addActionListener((e)->{isRun=false;});
        resetBtn.addActionListener((e)->{
            stopBtn.doClick(); //Action 발생
            screen.setText((millSec=0)+"");
        });
        p.add(startBtn);
        p.add(resetBtn);
        p.add(stopBtn);
        this.add(p, BorderLayout.SOUTH);
        this.setVisible(true);
    }
    class StartBtnHandler implements ActionListener {
        @Override
        public void actionPerformed(ActionEvent e) {
            new Thread(()->{
                isRun=true;
                while (isRun){
                    screen.setText(String.format("%.3f",(++millSec)*0.001));
                    try{Thread.sleep(1);} catch (Exception ex) {}
                }
            }).start();
        }
    }
}
public class H02StopWatch {
    public static void main(String[] args) {
        new StopWatch();
    }
}
