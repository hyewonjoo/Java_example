package com.text.java.question.io;

import java.io.BufferedReader;
import java.io.FileReader;
import java.util.Scanner;

public class Q2_04 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// 파일읽기
		Scanner scan = new Scanner(System.in);
		try {
			BufferedReader reader =
					new BufferedReader(new FileReader("C:\\class\\java\\파일_입출력_문제\\단일검색.dat"));

			String line = null;
			System.out.println("이름을 입력하세요");
			String name = scan.next();
			// 3,홍길석,인천시 강남구 다동, 010-7912-5576
			while ((line = reader.readLine()) != null) {
				String[] temp = line.split(",");
				if (name.equals(temp[1])) {
					System.out.println("[" + temp[1] + "]");
					System.out.println("번호 : " + temp[0]);
					System.out.println("주소 : " + temp[2]);
					System.out.println("번호 : " + temp[3]);

				}



			}
		} catch (Exception e) {
			e.printStackTrace();
		}

	}
}

