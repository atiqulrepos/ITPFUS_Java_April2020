package com.itpfus.guessinggame;

public class Player {
	
	int number;
	
	public int guess() {
		number = (int) (Math.random() * 10);
		return number;
	}

}
