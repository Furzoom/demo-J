/**
 * Description : 
 * Author      : mn@furzoom.com
 * Date        : Jul 1, 2016 2:05:01 PM
 * Copyright (c) 2013-2016, http://furzoom.com All Rights Reserved.
 */
package com.furzoom.lab.ch9;

/**
 * ClassName    : NestingInterfaces <br>
 * Function     : TODO ADD FUNCTION. <br>
 * Reason       : TODO ADD REASON. <br>
 * date         : Jul 1, 2016 2:05:01 PM <br>
 * 
 * @author furzoom
 * @version 
 */
public class NestingInterfaces {
	public class BImp implements A.B {
		public void f() {}
	}
	class CImp implements A.C {
		public void f() {}
	}
	// error
	//!class DImp implements A.D {
	//!	public void f() {}
	//!}
	class EImp implements E {
		public void g() {}
	}
	class EGImp implements E.G {
		public void f() {}
	}
	class EImp2 implements E {
		public void g() {}
		class EG implements E.G {
			public void f() {}
		}
	}

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		A a = new A();
		A a2 = new A();
		a2.receviedD(a.getD());
	}

}

class A {
	interface B {
		void f();
	}
	public class BImp implements B {
		public void f() {}
	}
	public interface C {
		void f();
	}
	class CImp implements C {
		public void f() {}
	}
	private class CImp2 implements C {
		public void f() {}
	}
	private interface D {
		void f();
	}
	private class DImp implements D {
		public void f() {}
	}
	public class DImp2 implements D {
		public void f() {}
	}
	public D getD() {
		return new DImp2();
	}
	private D dRef;
	public void receviedD(D d) {
		dRef = d;
		dRef.f();
	}
}

interface E {
	interface G {
		void f();
	}
	public interface H {
		void f();
	}
	void g();
	//!privage interface I{}
}
