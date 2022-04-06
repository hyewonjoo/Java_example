package com.text.java.question.io;

import java.io.BufferedReader;
import java.io.FileReader;
import java.util.Scanner;

public class Q2_05 {

	public static void main(String[] args) {
		// TODO 수정필요
		String name = "";
		String[] memberInfo = null;
		int count = 0;
		String merchandise = "";
		String[] result = new String[3];
		int output = 0;


		try {
			BufferedReader readMember =
					new BufferedReader(new FileReader("C:\\class\\java\\파일_입출력_문제\\검색_회원.dat"));
			BufferedReader readOrder =
					new BufferedReader(new FileReader("C:\\class\\java\\파일_입출력_문제\\검색_주문.dat"));


			System.out.print("이름: ");
			Scanner scanner = new Scanner(System.in);
			String search = scanner.nextLine();

			String line = null;

			while ((line = readMember.readLine()) != null) { // 회원파일을 가져와서 한줄씩 읽음
				// System.out.println(line);
				memberInfo = line.split(","); // 한줄씩 쪼개서 배열에 넣음 = memberInfo

				if (search.equals(memberInfo[1])) {// 사용자가 입력한 이름과 동일할경우
					for (int i = 0; i < memberInfo.length; i++) {
						result[i] = memberInfo[i];
					}
					// 100,노석재,제주시 강동구 라동

				}
			} // 이 if문을 나온 result[i]에는 사용자가 입력한 이름과 동일한 회원의 정보가 배열에 담겨있음.


			// 100,노석재,제주시 강동구 라동
			while ((line = readOrder.readLine()) != null) {
				// 30.키보드,33.100
				// 76,키보드,100,62

				String[] orderInfo = line.split(",");
				// System.out.println(line);
				if (result[0].equals(orderInfo[2]) || result[0].equals(orderInfo[3])) { // 만약
					merchandise = orderInfo[1];

					output = output + 1;

				}

			}

			System.out.println("==== 구매내역 ====");
			System.out.println("[번호]\t[이름]\t[상품명]\t[개수]\t[배송지]");
			System.out.printf("%3s\t%s\t%s\t%d\t%s\n", result[0], result[1], merchandise, output,
					result[2]);

			readMember.close();
			readOrder.close();
			scanner.close();
		} catch (

		Exception e) {
			e.printStackTrace();
		}

	}

}
