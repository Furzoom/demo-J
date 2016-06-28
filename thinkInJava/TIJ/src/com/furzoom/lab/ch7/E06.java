/**
 * Description : 
 * Author      : mn@furzoom.com
 * Date        : Jun 23, 2016 8:55:10 AM
 * Copyright (c) 2013-2016, http://furzoom.com All Rights Reserved.
 */
package com.furzoom.lab.ch7;

/**
 * ClassName    : E06 <br>
 * Function     : TODO ADD FUNCTION. <br>
 * Reason       : TODO ADD REASON. <br>
 * date         : Jun 23, 2016 8:55:10 AM <br>
 * 
 * @author furzoom
 * @version 
 */
public class E06 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		BoardGame bg = new BoardGame(10);
		
	}

}

class Game {
	Game(int i) {
		System.out.println("Game constructor");
	}
}

class BoardGame extends Game {
	BoardGame(int i) {
		super(i);
		System.out.println("BoardGame constructor");
	}
}