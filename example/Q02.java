package com.test.java.collection.example;

public class Q02 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MyStack stack = new MyStack(); // stack객체 생성


		// 추가
		stack.push("빨강");
		stack.push("노랑");
		stack.push("파랑");
		stack.push("주황");
		stack.push("검정");

		// 읽기
		System.out.println(stack.pop(0));
		System.out.println(stack.pop(1));
		System.out.println(stack.pop(2));

		// 개수확인
		System.out.println();
		System.out.println(stack.size());
		System.out.println();


		// 요소확인
		System.out.println(stack.peek(1));
		System.out.println(stack.peek(1));
		System.out.println(stack.size());

		// 초기화 구현 못함.
	}

}
