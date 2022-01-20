package com.snakeladder.bean;

public class Player {

	private String name;
	private Integer currentPosition;
	
	public Player(String name) {
		this.name = name;
		this.currentPosition = 0;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Integer getCurrentPosition() {
		return currentPosition;
	}

	public void setCurrentPosition(Integer currentPosition) {
		this.currentPosition = currentPosition;
	}
	
	
}
