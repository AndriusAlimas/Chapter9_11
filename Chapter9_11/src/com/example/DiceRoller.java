package com.example;

public class DiceRoller {
	// IF YOU WANT USE EL FUNCTION, METHOD SIGNATURE ACCESS MUST BE PUBLIC, and non-access modifier MUST BE STATIC:
	public static int rollDice(){
		return (int)((Math.random() * 6)+ 1);
	}
}
