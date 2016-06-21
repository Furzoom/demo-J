package com.furzoom.lab.ch6;

public class E06 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		E06Exp e = new E06Exp();
		System.out.println(e.assign("hello"));
	}

}

class E06Exp {
	protected String s;
	public String assign(String s) {
		this.s = s;
		return this.s;
	}
}