package com.furzoom.lab.ch6;

public class E08 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		while (ConnectionManager.getConnection() != null) {
			System.out.println("get a connection");
		}
		System.out.println("no connection");
	}

}

// maybe a public class
class ConnectionManager {
	private static Connection connections[] = new Connection[2];
	private ConnectionManager() {
	}
	public static Connection getConnection() {
		int i;
		for (i = 0; i < connections.length; i++) {
			if (connections[i] == null) {
				connections[i] = new Connection();
				return connections[i];
			}
		}
		return null;
	}
	
}

class Connection {
	Connection() {
	}
}