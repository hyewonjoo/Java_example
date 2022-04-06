package com.text.java.question.io;

import java.io.File;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Set;

/*
 * 이미지 파일이 있다. 확장자별로 파일이 몇개 있는지 세시오.
 * 
 * 조건..
 * 새로운 확장자 파일이 추가되도 동작이 가능하게 구현하시오.
 * 'mouse.bmp' 추가를 하면.. 소스 수정 없이도 *.bmp : 1개 출력이 되게 하시오. <---??????
 */

public class Q05 {
	public static void main(String[] args) {

		// <String 확장자명, 개수>
		HashMap<String, Integer> hashCount = new HashMap<String, Integer>();
		// key(String) : jpg, value(Integer) : 6개


		File dir = new File("C:\\class\\java\\파일_디렉토리_문제 (2)\\확장자별 카운트");

		File[] photos = dir.listFiles();

		for (File pic : photos) {

			if (pic.getAbsolutePath().lastIndexOf(".") > -1) { // 확장자명 존재하는 경우

				// 1. 확장자명 추출하기
				int index = pic.getAbsolutePath().lastIndexOf(".");
				String newExtention = pic.getAbsolutePath().substring(index + 1); // newExtension =
																					// 확장자


				// 2. 해쉬맵에 확장자명이랑 value추가하기 또있으면 key, value ++;
				if (hashCount.containsKey(newExtention) == false) { // 확장자명이 새로운 값이면

					hashCount.put(newExtention, 1);

				} else { // 이미 있으면

					int value = hashCount.get(newExtention) + 1;
					hashCount.put(newExtention, value);
				}
			}

		} // for


		// 호출하기

		Set<String> set = hashCount.keySet(); // HashMap의 key들로만 구성된 set

		Iterator<String> iter = set.iterator(); // set의 iterator를 활용

		while (iter.hasNext()) {

			String key = iter.next();
			System.out.println(key + ":" + hashCount.get(key) + "개");

		}



	}// main

}//
