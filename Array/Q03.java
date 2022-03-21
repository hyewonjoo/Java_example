package com.test.java.Array;

public class Q03 {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		int[] list = new int[4];

		list[0] = 10;
		list[1] = 20;
		list[2] = 30;
		list[3] = 40;
		String result = dump(list);
		System.out.println("list= " + result);
	}

	public static String dump(int[] list) {
		String txt = "["; // 이거부터 출력하기

		for (int i = 0; i < list.length; i++) {// 그 안의 배열들을 차례대로 출력
			if (i == list.length - 1) {
				txt = txt + list[i];
				break;
			}

			txt = txt + list[i] + ",";


		}



		txt = txt + "]";

		return txt;

	}
}
