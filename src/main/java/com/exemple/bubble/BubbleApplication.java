package com.exemple.bubble;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import javax.swing.*;

@SpringBootApplication
public class BubbleApplication extends JFrame {

    public BubbleApplication (){
        setSize(1000, 640);
        setVisible(true);
    }

    public static void main(String[] args) {
        SpringApplication.run(BubbleApplication.class, args);
        new BubbleApplication();
    }

}
