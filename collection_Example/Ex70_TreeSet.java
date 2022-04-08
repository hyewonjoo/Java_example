package com.text.java.collection;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Random;
import java.util.TreeSet;

public class Ex70_TreeSet {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		/*
		 * 
		 * Set
		 * -순서가 없다.
		 * -중복값을 가지지 않는다.
		 * -iterator로 탐색한다
		 * 
		 * HashSet
		 * 
		 * TreeSet
		 * -이진트리구조(B트리)
		 * -자동정렬
		 * -범위 추출에 쉬움
		 * -고유메소드 : first,last,head,tail,subSet
		 * 
		 */

		m1();



	}// main

	// HashSet vs TreeSet
	private static void m1() {

		HashSet<Integer> set1 = new HashSet<Integer>();
		TreeSet<Integer> set2 = new TreeSet<Integer>();

		set1.add(10);
		set1.add(40);
		set1.add(50);
		set1.add(30);
		set1.add(20);

		set2.add(10);
		set2.add(40);
		set2.add(50);
		set2.add(30);
		set2.add(20);

		// 탐색
		Iterator<Integer> iter1 = set1.iterator();
		while (iter1.hasNext()) {
			System.out.println(iter1.next());
		}

		System.out.println();

		Iterator<Integer> iter2 = set2.iterator();
		while (iter2.hasNext()) {
			System.out.println(iter2.next());
		}

		System.out.println();

		System.out.println(set1);
		System.out.println(set2);

		TreeSet<Integer> set3 = new TreeSet<Integer>();
		Random rnd = new Random();

		// for (int i = 0; i < 10; i++) {

		while (set3.size() < 10) { // 죽으나 사나 셋 크기 10
			set3.add(rnd.nextInt(100));
		}

		System.out.println();
		System.out.println(set3);
		System.out.println(set3.size());
		System.out.println();



		// Tree고유의 메소드
		System.out.println(set3.first());
		System.out.println(set3.last());

		// 자바의 모든 인덱스
		// 시작위치(포함) ~ 끝위치(미포함)
		System.out.println(set3.headSet(30)); // 0보다 크고 30보다 작은넘들
		System.out.println(set3.tailSet(70)); // 70보다크고 99보다 작은넘들
		System.out.println(set3.subSet(30, 70)); // 포함~미포함!
	}

}// Ex70


