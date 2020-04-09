package com.vlad.littleman;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import javax.swing.*;
import java.awt.*;
import java.util.*;
import java.util.Timer;

@SpringBootApplication
public class App {

	static {
		System.setProperty("java.awt.headless", "false");
	}

	public static void executeEvent(Runnable runnable) {
		SwingUtilities.invokeLater(runnable);//est sensé run l'appli en continu)
	}

	public static Robot robot;
	public static Timer timer;

	public static void main(String[] args) throws AWTException {
		timer = new Timer();
		robot = new Robot();
		//-> Robot robot = new Robot();
		//partie qui recupere au final l'appui du bouton pour en faire une variable, variable qui sera utilisé plus tart.
		SpringApplication.run(App.class, args);
	}

}
