/**
 * Description : 
 * Author      : mn@furzoom.com
 * Date        : Jun 27, 2016 6:14:07 PM
 * Copyright (c) 2013-2016, http://furzoom.com All Rights Reserved.
 */
package com.furzoom.lab.ch8;

/**
 * ClassName    : E10 <br>
 * Function     : TODO ADD FUNCTION. <br>
 * Reason       : TODO ADD REASON. <br>
 * date         : Jun 27, 2016 6:14:07 PM <br>
 * 
 * @author mayan
 * @version 
 */
public class E10 {

	public static void connect(Network n) {
		n.connect();
	}
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		SelfNetwork sn = new SelfNetwork();
		connect(sn);
	}

}

class Network {
	void connect() {
		ping();
	}
	void ping() {
		System.out.println("Network.ping()");
	}
	
}

class SelfNetwork extends Network {
	void ping() {
		System.out.println("SelfNetwrok.ping()");
	}
}