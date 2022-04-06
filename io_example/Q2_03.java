package com.text.java.question.io;

import java.io.BufferedReader;
import java.io.FileReader;

public class Q2_03 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String passCount = "";
		String failCount = "";
		int count = 0;
		String name = "";


		try {
			BufferedReader reader =
					new BufferedReader(new FileReader("C:\\class\\java\\파일_입출력_문제\\성적.dat"));


			String line = null;
			while ((line = reader.readLine()) != null) {

				String[] temp = line.split(",");
				// 0 - 이름
				// 1 - 국어
				// 2 -수학
				// 3- 영어
				int result = Integer.valueOf(temp[1]) + Integer.valueOf(temp[2])
						+ Integer.valueOf(temp[3]);
				int average = (result / 3);
				if (average > 60) {
					passCount = passCount + "\n" + temp[0];
				}



				if (Integer.valueOf(temp[1]) < 40 || Integer.valueOf(temp[2]) < 40
						|| Integer.valueOf(temp[3]) < 40) {
					failCount = failCount + "\n" + temp[0];


				}


			}
			// 출력할때 합격자 밑에 공백 없애는 부분 다시 한번 생각하기
			System.out.println("[합격자]\n" + name + passCount);
			System.out.println();
			System.out.println("[불합격자]\n" + failCount);


		} catch (Exception e) {
			e.printStackTrace();
		}

	}
}
