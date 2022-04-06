package com.text.java.question.io;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class Q2_01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String changeLine = "";
		String output = "";
		try {

			BufferedReader reader =
					new BufferedReader(new FileReader("C:\\class\\java\\파일_입출력_문제\\이름수정.dat"));
			String line = null;


			// 이름 바꿔주기
			while ((line = reader.readLine()) != null) {
				changeLine = line.replace("유재석", "메뚜기");
				// System.out.println(changeLine);
				output = output + changeLine;


			}


			reader.close();
		} catch (Exception e) {
			e.printStackTrace();
		}



		// 다른이름으로 파일 저장
		try {
			BufferedWriter writer =
					new BufferedWriter(new FileWriter("C:\\class\\java\\파일_입출력_문제\\이름수정_변환.dat"));



			writer.write(output);
			writer.close();

		} catch (IOException e) {

			e.printStackTrace();
		}

		System.out.println("변환 후 다른이름으로 저장하였습니다.");



		// 다시 읽기

		try {

			BufferedReader reader =
					new BufferedReader(new FileReader("C:\\class\\java\\파일_입출력_문제\\이름수정_변환.dat"));
			String line = null;


			// 이름 바꿔주기
			while ((line = reader.readLine()) != null) {
				System.out.println(line);

			}


			reader.close();
		} catch (Exception e) {
			e.printStackTrace();
		}


	}
}

