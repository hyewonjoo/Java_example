package com.text.java.question.io;

import java.io.File;

public class Q06 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		File file = new File("C:\\class\\java\\파일_디렉토리_문제 (2)\\파일 제거");
		int count = 0;

		File[] list = file.listFiles();
		for (File a : list) {
			if (a.length() == 0) {
				a.delete();
				count++;
			}
		}
		System.out.println("총" + count + "개의 파일을 삭제했습니다");

	}

}
