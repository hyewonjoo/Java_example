package com.test.java.Array;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Arrays;

public class Q04 {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
		// 1. 먼저 1~20 사이의 난수를 담고 있는 배열 생성하기
		int[] list = new int[20];
		for (int i = 0; i <= list.length - 1; i++) {
			list[i] = (int) (Math.random() * 20 + 1);
		}

		System.out.println("원본 : " + Arrays.toString(list));

		// 최대최소값
		// 오름차순으로 정렬 -> index0은 최소 index19는 최대값으로 출력
		for (int i = 0; i < list.length - 1; i++) {// 싸이클
			for (int j = 0; j < list.length - 1 - i; j++) {// 스텝
				if (list[j] > list[j + 1]) {
					int temp = list[j]; // 순서주의
					list[j] = list[j + 1]; // 오른쪽에서 왼쪽 대입 신경쓰기
					list[j + 1] = temp;

				}

			}
		}

		System.out.println(Arrays.toString(list));
		System.out.printf("최대값 : %d\n", list[19]);
		System.out.printf("최솟값 : %d\n", list[0]);
	}

}
