package com.exemple.bubble;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import javax.swing.*;

@SpringBootApplication
public class BubbleApplication extends JFrame {

    private JLabel backgroundMap;

    public BubbleApplication (){
        initObject();
        initSetting();
        setVisible(true);
    }

    private void initObject(){
        backgroundMap = new JLabel(new ImageIcon("image/backgroundMap.png"));
        setContentPane(backgroundMap);
//        backgroundMap.setSize(100,100);
//        backgroundMap.setLocation(300,300);
//        backgroundMap.setSize(1000,600);
//        add(backgroundMap); //JFrame에 JLabel이 그려짐
    }

    private void initSetting(){
        setSize(1000, 640);
        setLayout(null); // absoulte 레이아웃 (자유롭게 그림을 그릴 수 있다)
        setLocationRelativeTo(null); // JFrame 가운데 배치
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }

    public static void main(String[] args) {
        SpringApplication.run(BubbleApplication.class, args);
        new BubbleApplication();
    }

}
