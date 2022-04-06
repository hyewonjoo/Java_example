package com.text.java.question.io;

import java.io.File;

public class Q08 {

	public static void main(String[] args) {
		int count = 0;
		int count2 = 0;
		// TODO Auto-generated method stub
		File dir = new File("C:\\class\\java\\파일_디렉토리_문제 (2)\\폴더 삭제\\delete");
		File[] list = dir.listFiles();

		// 2.파일 개수
		for (File a : list) {
			if (a.isDirectory()) {// delet에 있는 폴더들
				System.out.println(a.getName()); // delet에 있는 폴더들 출력
				a.delete(); // 폴더들 삭제
				count++;
			}
		}

		for (File b : list) {
			if (b.isDirectory()) {
				File[] sublist = b.listFiles(); // delet에 있는 폴더들의 list
				for (File bb : sublist) {
					if (bb.isFile()) {// delet안에 있는 폴더들 중에서 파일들
						System.out.println(bb.getName());
						bb.delete(); // delet에 있는 폴더들 중에있는 파일들 삭제
						count2++;
					}

				}
			}
		}
		System.out.println("삭제된 폴더는 " + count + "개이고, 삭제된 파일은 " + count2 + "개 이다.");

	}



}


