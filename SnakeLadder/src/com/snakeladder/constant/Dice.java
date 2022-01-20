package com.snakeladder.constant;

public enum Dice {

	ONE(1),TWO(2),THREE(3),FOUR(4),FIVE(5),SIX(6);

	int dice;
	Dice(int dice) {
		this.dice = dice;
	}
	public int getDice(){
		
		return this.dice;
	}
}
