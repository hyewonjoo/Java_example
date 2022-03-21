package com.test.java.Array;

import java.util.Arrays;

public class Q06 {// 로또 만들기

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] list = new int[6];
		for (int i = 0; i <= 5; i++) {
			int random = (int) (Math.random() * 45 + 1);
			list[i] = random;

		}
		System.out.println(Arrays.toString(list)); // 무작위 6개 배열 생성 -> 중복되는거 걸러야함

		for (int i = 0; i < list.length - 1; i++) {// 싸이클
			for (int j = 0; j < list.length - 1 - i; j++) {// 스텝
				if (list[j] == list[j + 1]) { // 중복될경우 다른 난수로 바꿔주기
					int temp = (int) (Math.random() * 45 + 1);
					list[j] = temp;

				}

				if (list[j] > list[j + 1]) {
					int temp = list[j]; // 순서주의
					list[j] = list[j + 1]; // 오른쪽에서 왼쪽 대입 신경쓰기
					list[j + 1] = temp;

				}



			}
		}
		System.out.println(Arrays.toString(list));
	}
}
