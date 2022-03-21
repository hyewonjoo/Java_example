package com.test.java.Array;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Arrays;

public class Q09 {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub

		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
		System.out.println("배열의 길이를 입력하시오");
		int number = Integer.parseInt(reader.readLine());
		int number2 = 0;
		int[] list = new int[number]; // 사용자가 입력한 크기의 배열 생성
		if (number % 2 == 0) {// 크기가 짝수일경우
			number2 = number / 2;
		} else if (number % 2 != 0) { // 크기가 홀수일경우 반올림 해서 나타냄
			number2 = number / 2 + 1;
		}
		int[] newList = new int[number2];


		// 1~9까지의 난수가 들어간 list생성
		for (int i = 0; i < list.length; i++) {
			int random = (int) (Math.random() * 9) + 1; // 1~9까지의 난수
			list[i] = random;
		}
		System.out.println(Arrays.toString(list));

		// newList 생성하기
		for (int i = 0; i < newList.length; i++)

			if ((i * 2 + 1) == list.length) {// 홀수개일경우, list[i*2+1]이 존재하지않을때
				newList[i] = list[i * 2];
			}

			else {
				newList[i] = list[i * 2] + list[i * 2 + 1];
			}

		System.out.println(Arrays.toString(newList));
	}
}

