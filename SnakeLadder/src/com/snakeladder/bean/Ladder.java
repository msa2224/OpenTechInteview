package com.snakeladder.bean;

import com.snakeladder.Exception.IncorrectObjectCreation;
import com.snakeladder.Exception.WrongMoveException;

public class Ladder {

	private Integer head;
	private Integer tail;
	
	public Integer getHead() {
		return head;
	}
	public void setHead(Integer head) {
		this.head = head;
	}
	public Integer getTail() {
		return tail;
	}
	public void setTail(Integer tail) {
		this.tail = tail;
	}
	public Ladder(Integer head, Integer tail) {
		super();
		if(head<tail) {
			throw new IncorrectObjectCreation("ladder head should always be greater than tail");
		}
		this.head = head;
		this.tail = tail;
	}
	@Override
	public String toString() {
		return "Ladder [head=" + head + ", tail=" + tail + "]";
	}
	
	public void move() {
		
		if(this.head==0 || this.tail==0)
			throw new WrongMoveException("head or tail cannot be less than 1");
		
	}
	
}
