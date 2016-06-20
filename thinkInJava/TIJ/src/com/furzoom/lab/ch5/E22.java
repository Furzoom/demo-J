package com.furzoom.lab.ch5;

public class E22 {
	public enum Coins {
		PENNY, NICKEL, DIME, QUARTER, HALF, DOLLAR_COIN
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		for (Coins c : Coins.values()) {
			switch (c) {
			case PENNY:
				System.out.println(0.01);
				break;
			case NICKEL:
				System.out.println(0.05);
				break;
			case DIME:
				System.out.println(0.1);
				break;
			case QUARTER:
				System.out.println(0.25);
				break;
			case HALF:
				System.out.println(0.5);
				break;
			case DOLLAR_COIN:
				System.out.println(1);
				break;
			}
		}
	}

}
