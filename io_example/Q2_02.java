package com.text.java.question.io;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class Q2_02 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String change = "";
		String output = "";
		// 파일 읽기
		try {
			BufferedReader reader =
					new BufferedReader(new FileReader("C:\\class\\java\\파일_입출력_문제\\숫자.dat"));


			String line = null;
			while ((line = reader.readLine()) != null) {
				change = line.replace(String.valueOf(0), "영").replace(String.valueOf(1), "일")
						.replace(String.valueOf(2), "이").replace(String.valueOf(3), "삼")
						.replace(String.valueOf(4), "사").replace(String.valueOf(5), "오")
						.replace(String.valueOf(6), "육").replace(String.valueOf(7), "칠")
						.replace(String.valueOf(8), "팔").replace(String.valueOf(9), "구");

				// System.out.println(change);
				output = output + change;

			}

		}



		catch (Exception e) {

			e.printStackTrace();
		}

		// 파일 쓰기
		try {
			BufferedWriter writer =
					new BufferedWriter(new FileWriter("C:\\class\\java\\파일_입출력_문제\\숫자_변환.dat"));



			writer.write(output);
			writer.close();

		} catch (IOException e) {

			e.printStackTrace();
		}

		System.out.println("변환 후 다른이름으로 저장하였습니다.");
	}

}
