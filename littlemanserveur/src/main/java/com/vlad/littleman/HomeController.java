package com.vlad.littleman;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import javax.swing.*;
import java.awt.event.KeyEvent;
import java.util.Scanner;
import java.util.Timer;
import java.util.TimerTask;

@RestController
public class HomeController {

    @RequestMapping("/")
    public String index() {
        return "coucou";
    }

    @RequestMapping("/hello")
    public String hello(@RequestParam(value = "name") String name) {
        return "Hello " + name + "\n";
    }

    @RequestMapping("keyboard")
    public String keyboard(@RequestParam(value = "key") int button) {

        System.out.println("abcdefghijklmopqrstuvwsyz " + button);
        //while mousePress = true ?
        App.executeEvent(new Runnable() {
            @Override
            public void run() {
                App.robot.keyPress(button); // pression sur le bouton
                try {
                    Thread.sleep(500);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                App.robot.keyRelease(button); //application qui recupere l'appui sur un bouton pour définir de quel bouton il s'agit
            }
        });

        return "OK";
    }
}
        /*System.out.print("Enter an letter: ");
        Scanner input = new Scanner(System.in);//futur input

        String clavier = input.nextLine();

        System.out.println("You entered " + clavier);
*/