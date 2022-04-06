package com.text.java.question.io;

import java.io.BufferedReader;
import java.io.File;
import java.io.IOException;
import java.io.InputStreamReader;

public class Q02 {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub

		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
		System.out.println("폴더 ");
		String filename = reader.readLine();
		System.out.println("확장자:");
		String name = reader.readLine();



		File dir = new File(filename);

		File[] list = dir.listFiles();
		for (File a : list) {
			if (a.isFile()) {

				int index = a.getName().lastIndexOf(".");
				if (a.getName().substring(index + 1, a.getName().length()).equals(name))

					System.out.println(a.getName());


			}


		}
	}

}


