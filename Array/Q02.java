package com.test.java.Array;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Q02 { // 버블정렬

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
		System.out.println("학생 수 : ");
		int num = Integer.parseInt(reader.readLine());


		String studentArray[] = new String[num]; // 사용자가 입력한 학생수대로 배열의 길이 생성

		for (int i = 0; i <= studentArray.length - 1; i++) {
			System.out.print("학생명 : ");
			String name = reader.readLine();
			studentArray[i] = name; // 사용자가 이름을 입력한 순서대로 배열 생성

		}

		// name[j].compareTo(name[j + 1]) > 0) {


		for (int i = 0; i < studentArray.length - 1; i++) { // 싸이클(배열의 크기보다 하나 작은 싸이클 필요)
			for (int j = 0; j < studentArray.length - 1 - i; j++) {// 스텝(스왑하는 과정) ->스텝의 횟수는 점점 줄어듦
				if (studentArray[j].compareTo(studentArray[j + 1]) > 0) { // student[j]가 더 클때 양수가 나옴
																			// ->배열이 스트링일 경우 사용
					String temp = studentArray[j];
					studentArray[j] = studentArray[j + 1];
					studentArray[j + 1] = temp;



				}
			}

		}
		System.out.printf("입력하신 학생은 총 : %d입니다\n", num);
		for (int i = 1; i <= num; i++) {
			System.out.printf("%d. %s", i, studentArray[i - 1]);
			System.out.println();
		}
	}

}


