package com.test.java.Array;

public class Q05 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int[] list = new int[20];
		String output = "";


		for (int i = 0; i <= list.length - 1; i++) {
			list[i] = (int) (Math.random() * 20 + 1);


			// 최댓값 :15, 최솟값 : 10
			// 만약 사용자가 입력한 숫자로하려면 FOR문 밖에서 입력 받은 후 10,15대신에 대입하기
			if (list[i] >= 10 && list[i] <= 15) {
				output = output + String.valueOf(list[i] + " ");



			}

		}
		System.out.print("원본 : ");
		for (int i = 0; i <= 19; i++) {
			System.out.print(list[i] + " ");
		}
		System.out.println();
		System.out.println("결과 : " + output);
	}
}
