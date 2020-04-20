package com.itpfus.guessinggame;

public class GameMaster {
	
	
	int number;
	static int gameId = 1;
	
	public GameMaster() {
		this.guess();
		gameId++;
	}
	
	public void guess() {
		number = (int) (Math.random() * 10);
		System.out.println("Game id: " + gameId + ". Game Master's number is:" + number);
	}
	
	public void startTheGame() {
		Player p = new Player();
		int numberOfPlayers = (int) (Math.random() * 10);
		System.out.println("There are " + numberOfPlayers + " players in this game.");
		boolean noWinner = true;
		for(int i = 1; i <= numberOfPlayers; i++) {
			int playerGuess = p.guess();
			System.out.println("Player's guess was:" + playerGuess);
			if(playerGuess == number) {
				System.out.println("Player " + i + " is the winner");
				noWinner = false;
				break;
			}
		}
		if (noWinner)
			System.out.println("No palyer was able to guess the number");
		System.out.println("Game's over");
		
	}

}
