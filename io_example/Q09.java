package com.text.java.question.io;

import java.io.File;

public class Q09 {
	public static void main(String[] args) {
		q10();
	}

	private static void q10() {

		File dir = new File("C:\\class\\java\\파일_디렉토리_문제 (2)\\직원	");

		File[] list = dir.listFiles();

		for (File file : list) {
			if (file.isFile()) {

				String filename = file.getName();

				// System.out.println(filename);

				// Parsing : 의미있는 부분들을 쪼개는 작업

				// "홍길동_2022_11.txt"; > 홍길동 : 2022 : 11
				// "홍길동__2022_11.txt"; > 홍길동 : 빈방 : 2022 : 11


				filename = filename.replace("__", "_"); // 정규화

				String[] temp = filename.split("_");
				// 0 - 직원명
				// 1 - 년도

				// 아무게_2014__17.txt
				// 아무게_2014__30.txt


				// 새로운 폴더 만들기, 이름따라 그리고 년도따라
				File newDirectory =
						new File(dir.getAbsolutePath() + "\\" + temp[0] + "\\" + temp[1]);

				newDirectory.mkdirs();


				File moveFile = new File(newDirectory.getAbsolutePath() + "\\" + file.getName());
				// 파일 움직이기 -> 위에 만든 폴더안으로(newDirectory.getAbsolutePath())
				file.renameTo(moveFile);



			}
		}
		System.out.println("이동");

	}


}


