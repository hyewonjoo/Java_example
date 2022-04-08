package com.text.java.collection;

import java.util.TreeMap;

public class Ex71_TreeMap {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		/*
		 * Tree + Map
		 * -이진트리구조의 Map
		 * -자동정렬 + 범위검색(추출)용이
		 * 
		 * 
		 * 
		 * 
		 */

		TreeMap<String, String> map = new TreeMap<String, String>();
		map.put("white", "하양");
		map.put("black", "검정");
		map.put("yellow", "노랑");
		map.put("red", "빨강");
		map.put("blue", "파랑");

		System.out.println(map.size());
		System.out.println(map);

		System.out.println(map.firstKey()); // black
		System.out.println(map.firstEntry()); // item == 요소(한쌍 키,밸류)가 반환됨,black=검정
		System.out.println(map.lastKey()); // yellow

		System.out.println(map.headMap("m")); // 알파벳 m이전 {black=검정, blue=파랑}
		System.out.println(map.tailMap("m")); // 알파벳 m이후 {red=빨강, white=하양, yellow=노랑}
		System.out.println(map.subMap("r", "w")); // {red=빨강}


	}

	/*
	 * 콜렉션의 특징 : 길이가 가변!!!!!
	 * 처음선택(1번 5번 7번)> 상황에 따라 (2,3,4,6,8 사용)
	 * 
	 * 
	 * List
	 * 1.ArrayList >배열이 필요할때, 삽입/삭제(x)
	 * 2.LinekdList > ArrayList의 대체제, 삽입/삭제(o)
	 * 3.Stack >스택구조
	 * 4.Queue > 큐 구조
	 * 
	 * 
	 * Set
	 * 5.HashSet >중복값을 배제하는 집합이 필요할때
	 * 6.TreeSet >중복값이 배제하는 + 자동정렬이 필요할 떄
	 * 
	 * 
	 * Map
	 * 7.HashMap > 키/값 형태의 배열이 필요할 때 
	 * 8.TreeMap > 키/값 형태의 배열이 필요하고 + 자동정렬이 필요할 때 
	 * 
	
	 * 
	 */



}


