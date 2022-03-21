package com.test.java.Array;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Arrays;

public class Q07 {// 배열 삽입

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		int[] list = {5, 6, 1, 3, 2, 8, 7, 4, 10, 9}; // 길이가 10짜리인 배열 생성

		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
		System.out.println("삽입할 위치를 입력하시오");
		int position = Integer.parseInt(reader.readLine()); // 추가할 위치

		System.out.println("삽입할 값을 입력하시오");
		int newValue = Integer.parseInt(reader.readLine());

		int[] newList = new int[10];


		for (int i = 0; i <= newList.length - 1; i++) {
			if (i < position) { // position보다 작은 값은 기존 배열과 같게
				newList[i] = list[i];
			}
			if (i == position) { // 새로운 변수 추가
				newList[i] = newValue;
			}
			if (i > position) { // 포지션보다 큰 값은 기존 배열에서 1을 뺴준 값과 같게
				newList[i] = list[i - 1];
			}
		}

		System.out.println("원본: " + Arrays.toString(list));
		System.out.println("결과: " + Arrays.toString(newList));

	}

}
