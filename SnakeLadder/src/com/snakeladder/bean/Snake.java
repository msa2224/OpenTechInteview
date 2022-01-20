package com.snakeladder.bean;

public class Snake {
	
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
	public Snake(Integer head, Integer tail) {
		super();
		this.head = head;
		this.tail = tail;
		
	}
	@Override
	public String toString() {
		return "Snake [head=" + head + ", tail=" + tail + "]";
	}
	
	
	
	
	
}
