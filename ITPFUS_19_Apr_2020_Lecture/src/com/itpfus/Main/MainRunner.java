package com.itpfus.Main;

import com.itpfus.guessinggame.GameMaster;

public class MainRunner {

	public static void main(String[] args) {
		/*Lecture l = new Lecture("Java Fundamentals", "James Gosling", new Date());

		System.out.println("Lecture details:");
		System.out.println(l.topic);
		System.out.println(l.speaker);
		System.out.println(l.date);
		*/
		
		for (int i = 0; i < 5; i++) {		
			GameMaster gm = new GameMaster();
			gm.startTheGame();
		}
	}

}
