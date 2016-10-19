/**
 * Description : 
 * Author      : mn@furzoom.com
 * Date        : Oct 8, 2016 11:01:59 AM
 * Copyright (c) 2013-2016, http://furzoom.com All Rights Reserved.
 */

package com.furzoom.lab.io;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;

/**
 * ClassName : FileExample <br>
 * Function : TODO ADD FUNCTION. <br>
 * date : Oct 8, 2016 11:01:59 AM <br>
 * 
 * @version
 */
public class FileExample {
	public static void main(String[] args) {
		// createFile();
		// System.out.println("Length: " + countFileSize());
		// readAndPrint();
		copyFile();
	}

	public static void createFile() {
		File f = new File("create.txt");
		try {
			f.createNewFile();
			System.out.println("Partial size: " + f.getTotalSpace()
					/ (1024 * 1024 * 1024) + "G");
			f.mkdirs();
			System.out.println("File name: " + f.getName());
			System.out.println("File parent dir: " + f.getParent());
			System.out.println("File absolute path: " + f.getAbsolutePath());
		} catch (Exception e) {
			e.printStackTrace();
		}

	}

	public static long countFileSize() {
		long count = 0;
		InputStream streamReader = null;
		try {
			streamReader = new FileInputStream(new File("create.txt"));
			while (streamReader.read() != -1) {
				count++;
			}
		} catch (final IOException e) {
			e.printStackTrace();
		} finally {
			try {
				streamReader.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
		return count;
	}

	public static void readAndPrint() {
		InputStream streamReader = null;
		try {
			streamReader = new FileInputStream(new File("create.txt"));
			int n = 0;
			while (n != -1) {
				n = streamReader.read();
				System.out.print(n + " ");
			}
		} catch (final IOException e) {
			e.printStackTrace();
		} finally {
			try {
				streamReader.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
	}

	public static void copyFile() {
		byte[] buffer = new byte[512];
		int numberRead = 0;
		InputStream input = null;
		OutputStream out = null;
		try {
			input = new FileInputStream("create.txt");
			out = new FileOutputStream("backup.txt");
			while ((numberRead = input.read(buffer)) != -1) {
				out.write(buffer, 0, numberRead);
			}
			System.out.println("Copy success!");
		} catch (final IOException e) {
			e.printStackTrace();
		} finally {
			try {
				input.close();
				out.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
	}

}
