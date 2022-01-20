package com.snakeladder.controller;

import java.util.LinkedList;
import java.util.List;
import java.util.Queue;
import java.util.Scanner;

import com.snakeladder.Exception.WrongMoveException;
import com.snakeladder.bean.Board;
import com.snakeladder.bean.Ladder;
import com.snakeladder.bean.Player;
import com.snakeladder.bean.Snake;

public class Controller {

	
	static Board board  = new Board();
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter number of snakes");
		int numberOfSnakes = sc.nextInt();
		
		for(int i=0;i<numberOfSnakes;i++) {
			System.out.println("enter head of " +i + "th snake");
			int head = sc.nextInt();
			System.out.println("enter tail of " +i + "th snake");
			int tail = sc.nextInt();
			Snake snake = new Snake(head,tail);
			board.addSnake(snake);
			
		}
		
		System.out.println("Enter number of ladder");
		int numberOfLadder = sc.nextInt();
		
		for(int i=0;i<numberOfLadder;i++) {
			System.out.println("enter head of " +i + "th ladder");
			int head = sc.nextInt();
			System.out.println("enter tail of " +i + "th ladder");
			int tail = sc.nextInt();
			Ladder ladder = new Ladder(head,tail);
			board.addLadder(ladder);
			
		}
		
		System.out.println("Enter number of Player");
		int numberOfPlayer = sc.nextInt();
		Queue<Player> queue = new LinkedList<Player>();
		sc.nextLine();
		for(int i=0;i<numberOfPlayer;i++) {
			System.out.println("enter name of " +i +"th Player");
			String name = sc.nextLine();
			Player player = new Player(name);
			board.addPlayer(player);
			queue.add(player);
			
		}
		List<Player> playerList = board.getPlayer();
		int count =1;
//		while(true && count==1) {
//					
//			ListIterator<Player> it = playerList.listIterator();
//			
//			while(it.hasNext()) {
//				int move = (int)(Math.random() * 6) + 1;
//				Player player = it.next();
//				try {
//				board.move(player, move);
//				} catch(WrongMoveException wre) {
//					System.out.println(player.getName() + "cannot move now");
//				}
//				if(player.getCurrentPosition()==100) {
//					
//					System.out.println("Winner is " + player.getName());
//					count=0;
//					break;
//				} else {
//					it.add(player);
//				}
//			}
	//}
			
			
			
			while(!queue.isEmpty()) {
				
				Player player = queue.poll();
				int move = (int)(Math.random() * 6) + 1;
				//Player player = it.next();
				try {
				board.move(player, move);
				} catch(WrongMoveException wre) {
					System.out.println(player.getName() + "cannot move now");
				}
				if(player.getCurrentPosition()==100) {
					
					System.out.println("Winner is " + player.getName());
					count=0;
					break;
				} else {
					queue.add(player);
				}
				System.out.println("player name" + player.getName());
				
				
				
			}


		
	}
}
