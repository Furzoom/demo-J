/**
 * Description : 
 * Author      : mn@furzoom.com
 * Date        : Oct 8, 2016 2:11:06 PM
 * Copyright (c) 2013-2016, http://furzoom.com All Rights Reserved.
 */

package com.furzoom.lab.io;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;

/**
 * ClassName : ObjectStreamExample <br>
 * Function : TODO ADD FUNCTION. <br>
 * date : Oct 8, 2016 2:11:06 PM <br>
 * 
 * @version
 */
public class ObjectStreamExample {
	public static void main(String[] args) {
		ObjectOutputStream objectWriter = null;
		ObjectInputStream objectReader = null;
		try {
			objectWriter = new ObjectOutputStream(new FileOutputStream(
					"student.txt"));
			objectWriter.writeObject(new Student("gg", 18));
			objectWriter.writeObject(new Student("dd", 17));
			objectWriter.writeObject(new Student("jj", 19));
			objectReader = new ObjectInputStream(new FileInputStream(
					"student.txt"));
			for (int i = 0; i < 3; i++) {
				System.out.println(objectReader.readObject());
			}
		} catch (IOException | ClassNotFoundException e) {
			e.printStackTrace();
		} finally {
			try {
				objectWriter.close();
				objectReader.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
	}

}

class Student implements Serializable {
	private String	name;
	private int		age;

	public Student(String name, int age) {
		super();
		this.name = name;
		this.age = age;
	}

	@Override
	public String toString() {
		return "Student [name=" + name + ", age=" + age + "]";
	}
}
