package com.text.java.question.io;

import java.io.BufferedReader;
import java.io.File;
import java.io.IOException;
import java.io.InputStreamReader;

public class Q01 {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub

		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
		System.out.println("파일 경로");
		String filename = reader.readLine();


		// 파일명
		File file = new File(filename);
		System.out.println("파일명" + file.getName());


		// 파일 종류
		int index = filename.lastIndexOf(".");
		String without = filename.substring(index + 1, filename.length());// 확장자
		System.out.println("종류" + without + "파일");


		// 파일크기 -> 나중에 크기변환 체
		System.out.println(file.length());

	}

}
