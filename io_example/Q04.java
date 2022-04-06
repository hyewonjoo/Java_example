package com.text.java.question.io;

import java.io.File;

public class Q04 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int i = 1;

		File file = new File("C:\\class\\java\\Music1");
		File[] list = file.listFiles();


		for (File a : list) {
			String path = String.format("[%03d]", i);
			System.out.println(path + a.getName());
			i++;
		}

	}



}


