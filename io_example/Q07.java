package com.text.java.question.io;

import java.io.File;

public class Q07 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int i = 1;
		File file1 = new File("C:\\class\\java\\파일_디렉토리_문제 (2)\\동일 파일\\MusicA");
		File file2 = new File("C:\\class\\java\\파일_디렉토리_문제 (2)\\동일 파일\\MusicB");

		File[] list = file1.listFiles();
		File[] list2 = file2.listFiles();

		for (File a : list) { // 향상된 2중 포문 사용하기!
			for (File b : list) {
				if (a.getName().equals(b.getName())) {
					System.out.println(b.getName());

				}


			}

		}
		System.out.println("종료합니다.");
	}

}
