package com.furzoom.lab.dp;

public class SingletonTest {

	public static void main(String[] args) {
		Singleton sg = Singleton.getInstance();
		sg.singletonOperation();
	}

}


class Singleton {
	private static Singleton instance;
	private Singleton() {
		
	}
	public static Singleton getInstance() {
		if (instance == null) {
			instance = new Singleton();
		}
		return instance;
	}
	public void singletonOperation() {
		System.out.println("singletonOperation");
	}
}