package com.furzoom.lab.ch5;

public class E21 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		for (Coins c : Coins.values()) {
			System.out.println(c + ". ordinal " + c.ordinal());
		}
	}

}

enum Coins {
	PENNY, NICKEL, DIME, QUARTER, HALF, DOLLAR_COIN
}
