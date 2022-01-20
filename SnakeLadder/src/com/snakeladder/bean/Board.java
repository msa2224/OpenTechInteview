package com.snakeladder.bean;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import com.snakeladder.Exception.WrongMoveException;
import com.snakeladder.constant.Dice;

public class Board {

	
	private int[] board = new int[100];
	
	List<Snake> snakeList = new ArrayList<Snake>();
	List<Ladder> ladderList = new ArrayList<Ladder>();
	
	Map<String,Integer> playerPieces = new HashMap<String,Integer>();
	
	List<Player> playerList = new ArrayList<Player>();
	
	
	public Snake getSnake(int position) {
		
		for(Snake snake:snakeList) {
			if(position==snake.getHead())
				return snake;
		}
		
		return null;
		
	}
	public Ladder getLadder(int position) {
		
		for(Ladder ladder:ladderList) {
			if(position==ladder.getTail())
				return ladder;
		}
		
		return null;
	}
	public void addSnake(Snake snake) {		
		//board[snake.getHead()] = 2;
		this.snakeList.add(snake);	
			
	}
	public void addLadder(Ladder ladder) {
		//board[ladder.getTail()] = 1;
		this.ladderList.add(ladder);
	}
	public void addPlayer(Player player) {
		this.playerList.add(player);
	}
	public List<Player> getPlayer(){
		return this.playerList;
	}
	
	
	public void move(Player player,int move) {
		
		System.out.println(player.getName() +"current postion is " +player.getCurrentPosition());
		int nextMove = player.getCurrentPosition()+move;
		try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		if(nextMove>100) {
			throw new WrongMoveException("cannot move beyond 100");
		}	
		Ladder ladder = getLadder(nextMove);
		Snake snake = getSnake(nextMove);
		
		if(ladder!=null) {
			player.setCurrentPosition(ladder.getHead()-ladder.getTail()+nextMove);
			System.out.println(player.getName()+"use ladded");
		} else if(snake!=null) {
			player.setCurrentPosition(nextMove-(snake.getHead()-snake.getTail()));
			System.out.println(player.getName()+"bitten by snake");
		} else {
			player.setCurrentPosition(nextMove);
			
		}
		System.out.println(player.getName()+" moved " +nextMove );
		
		
	}
	
	
}
