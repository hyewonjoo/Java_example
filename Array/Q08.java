package com.test.java.Array;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Arrays;

public class Q08 {// 배열 삭제

	public static void main(String[] args) throws Exception {
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
		// TODO Auto-generated method stub
		int[] list = {5, 6, 1, 3, 2, 8, 7, 4, 10, 9}; // 길이가 10짜리인 배열 생성


		System.out.println("삭제할 위치를 입력하시오");
		int position = Integer.parseInt(reader.readLine());


		int[] newList = new int[10];


		for (int i = 0; i <= newList.length - 1; i++) {
			if (i < position) {
				newList[i] = list[i];
			}
			if (i >= position && i < newList.length - 1) { // 그 다음 인덱스로 덮어주기
				newList[i] = list[i + 1];
			}
			if (i == newList.length - 1) {// 배열의 인덱스 맨 끝은 0으로 대신 채워주긴
				newList[i] = 0;
			}
		}

		System.out.println("원본: " + Arrays.toString(list));
		System.out.println("결과: " + Arrays.toString(newList));

	}

}
