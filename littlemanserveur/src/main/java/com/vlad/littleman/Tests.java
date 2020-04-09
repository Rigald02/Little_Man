package com.vlad.littleman;

import javax.swing.*;
import java.awt.*;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.util.Timer;
import java.util.TimerTask;

class MouseListenerExample extends Frame implements MouseListener {

    final Timer mouseTim = new Timer("timerMouse");

    //bouton.addMouseListenerExample(mouseList);

    //MouseListener mouseList = new MouseAdapter()


        @Override
        public void mouseClicked(MouseEvent e) {
            //App.robot.keyPress();

        }

        @Override
        public void mousePressed(MouseEvent e) {
            mouseTim.scheduleAtFixedRate(
                    new TimerTask() {

                        @Override
                        public void run() {
                            mouseClicked(e);
                        }
                    }, 10, 1000); //À chaques 1000 milisecondes
        }

        @Override
        public void mouseReleased(MouseEvent e) {

        }

        @Override
        public void mouseEntered(MouseEvent e) {

        }

        @Override
        public void mouseExited(MouseEvent e) {

        }

}