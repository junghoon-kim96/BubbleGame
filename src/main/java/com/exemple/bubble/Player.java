package com.exemple.bubble;

import javax.swing.*;

public class Player extends JLabel implements Moveable {

    private int x;
    private int y;

    private ImageIcon playerR, playerL;

    public Player(){
        initObject();
        initSetting();
    }

    private void initObject(){
        playerR = new ImageIcon("image/playerR.png");
        playerL = new ImageIcon("image/playerL.png");
    }

    private void initSetting(){
        x = 55;
        y = 535;

        setIcon(playerR);
        setSize(50,50);
        setLocation(x,y);
    }

    @Override
    public void left() {

    }

    @Override
    public void right() {

    }

    @Override
    public void up() {

    }

    @Override
    public void down() {

    }
}
