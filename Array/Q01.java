package com.test.java.Array;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Q01 {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
		int[] nums = new int[5]; // 길이가 5인 nums배열
		int i;
		for (i = 0; i <= nums.length - 1; i++) { // 반복문 5번 반복
			System.out.println("숫자 :  ");
			int input = Integer.parseInt(reader.readLine());
			nums[i] = input; // nums배열에 사용자가 입력한 숫자 넣기


		}
		System.out.printf("nums[%d] = %d\n", 4, nums[4]);
		System.out.printf("nums[%d] = %d\n", 3, nums[3]);
		System.out.printf("nums[%d] = %d\n", 2, nums[2]);
		System.out.printf("nums[%d] = %d\n", 1, nums[1]);
		System.out.printf("nums[%d] = %d\n", 0, nums[0]);
		// System.out.println(Arrays.toString(nums)); //현재 배열의 상태를 출력


	}
}

