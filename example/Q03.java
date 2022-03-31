package com.test.java.collection.example;

public class Q03 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Queue queue = new Queue(); // 큐 객체생성

		queue.add("빨강");
		queue.add("노랑");
		queue.add("파랑");
		queue.add("주황");
		queue.add("검정");

		System.out.println(queue.poll(0));
		System.out.println(queue.poll(1));
		System.out.println(queue.poll(2));

		System.out.println();

		// 사이즈
		System.out.println(queue.size());

		System.out.println();

		// 확인
		System.out.println(queue.peek(3));
		System.out.println(queue.peek(3));
		System.out.println(queue.size());

		// 초기화 구현 못함..

	}

}
