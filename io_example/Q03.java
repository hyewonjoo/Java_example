package com.text.java.question.io;

import java.io.BufferedReader;
import java.io.File;
import java.io.IOException;
import java.io.InputStreamReader;

public class Q03 {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		File file = new File("C:\\class\\java\\AAA\\test.txt");
		File file2 = new File("C:\\class\\java\\BBB\\test.txt");
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

		System.out.println("파일 이동을 실행합니다");
		System.out.println("같은 이름을 가지고 있는 파일이 이미 존재합니다. 덮어 쓸까요? (y/n)");
		String answer = reader.readLine();

		if (answer.equals("y")) {
			file2.delete();

			boolean result = file.renameTo(file2);
			System.out.println(result);
			System.out.println("파일을 덮어썼습니다");

		} else if (answer.equals("n")) {
			System.out.println("작업을 취소합니다.");
		}

	}


}


