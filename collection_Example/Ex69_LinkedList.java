package com.text.java.collection;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class Ex69_LinkedList {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		/*
		 * LIst > LinkedList
		 * Set > TreeSet
		 * Map >TreeMap
		 */

		// m1
		// m2();
		m3();


	}// main


	// ArrayList vs LinkedList
	private static void m1() {

		// Collection(I) > List(I):방번호가존재하는 애들 >ArrayList(C),LinkedList(C)

		// ArrayList vs LinekdList
		// -사용법 아주 유사 > 개발자의 경험을 살리기 위해
		// -내부 구조가 다르다 > 사용 용도가 다르다.

		// 물리적 구조 + 사용법(인터페이스)
		// Array + List
		// Linked + List
		// Hash + Map
		// Tree + Map
		// Hash + Set
		// Tree + Set

		// LinekdList의 종류
		// 1. LinekdList : 일방 통행
		// 2. Double LinekdList : 양방향
		// 3. Double Circular LinkedList : 양방향 + 처음하고 끝을 연결 > 자바의 LinekdList

		/*ArrayList
		 * -모든 컬렉션 중에서 요소에 접근하는 속도가 가장 빠름
		 * -요소의 **중간** 삽입/삭제 에 대한 비용이 비싸다(느리다) > Shift***
		 * 
		 * LinekdList
		 * -요소에 접근하는 속도가 느리다(특히 뒤에있는 요소일수록)
		 * -요소 삽입/삭제에 대한 비용이 거의 없다 > Shift불필요 >속도가 빠르다
		 * 
		 */

		ArrayList<Integer> list1 = new ArrayList<Integer>();
		LinkedList<Integer> list2 = new LinkedList<Integer>();

		// ArrayList
		list1.add(100);
		list1.add(200);
		list1.add(300);

		System.out.println(list1.size());

		for (Integer n : list1) {
			System.out.println(n);
		}

		System.out.println(list1.get(0));
		System.out.println(list1.get(1));
		System.out.println(list1.get(2));


		// LinekdList
		list2.add(100);
		list2.add(200);
		list2.add(300);

		System.out.println(list2.size());

		for (Integer n : list2) {
			System.out.println(n);
		}

		System.out.println(list2.get(0));
		System.out.println(list2.get(1));
		System.out.println(list2.get(2));

	}

	public static void m2() {
		ArrayList<Integer> list1 = new ArrayList<Integer>();
		LinkedList<Integer> list2 = new LinkedList<Integer>();

		long begin = 0, end = 0;

		// 1.순차적으로 데이터 추가하기 Append
		System.out.println("[순차적으로 데이터 추가하기]");

		for (int i = 0; i < 1000000; i++) {
			list1.add(i);
		}

		end = System.currentTimeMillis();

		System.out.printf("ArratList의 작업시간 %,dms\n", end - begin);



		begin = System.currentTimeMillis(); // 시간 훨씬 느림

		// 1.순차적으로 데이터 추가하기 Append
		System.out.println("[순차적으로 데이터 추가하기]");

		for (int i = 0; i < 1000000; i++) {
			list1.add(i);
		}

		end = System.currentTimeMillis();

		System.out.printf("LinkedList의 작업시간 %,dms\n", end - begin);


		// 2.배열 중간에 데이터를 추가
		System.out.println("[데이터삽입하기]");

		begin = System.currentTimeMillis();


		for (int i = 0; i < 10000; i++) {
			list1.add(0, i); // 첫번째방에다가 삽입
		}

		end = System.currentTimeMillis();

		// System.out.printf("ArratList의 작업시간 %,dms\n", end - begin);



		System.out.println("[데이터삽입하기]"); // 시간 훨씬 빠름

		begin = System.currentTimeMillis();


		for (int i = 0; i < 10000; i++) {
			list2.add(0, i); // 첫번째방에다가 삽입
		}

		end = System.currentTimeMillis();

		System.out.printf("ArrayList의 작업시간 %,dms\n", end - begin);

	}

	public static void m3() {
		// 인터페이스의 사용 예
		// **** 인터페이스를 구현한 객체는 참조 변수를 인터페이스로 만들어라


		// ArrayList -> LinkedList
		// 1.참조변수의 자료형
		// 2.생성자 수정


		// ***********리모컨 >AAA건전지 없음(List인터페이스) > 백셀 건전지(ArrayList객체) > 다이소 건전지(LinkedList객체)
		List<Integer> list = new LinkedList<Integer>(); // 업캐스팅 자식 -> 부모 씌앙 , 백프로 가능

		// Append작업만 존재!! ArrayList(o) LinekdList(x)
		for (int i = 0; i < 1000000; i++) {
			list.add(i);
		}

		System.out.println(list.size());

		// 유지보수 혹은 기능추가 >1년 뒤 발생
		for (int i = 0; i < 5000; i++) {
			list.remove(0); // shift발생
		}
	}



}


