package com.test.java.collection.example;


// 문제 : ArrayList와 동일한 동작을 하는 클래스를 선언하시오.
// 모든 기능의 디테일은 실제 ArrayList와 비교
public class MyArrayList {

	private String[] list = new String[3]; // ArrayList의 내부배열 ***
	private int index; // ***가장 중요***
	private String[] newList = new String[list.length - 1];

	public MyArrayList() { // 생성자
		this.index = 0;
	}


	public void add(String value) {
		this.list[this.index] = value;
		this.index++;


	}



	public int size() {

		return index;
	}


	public void set(int i, String string) {
		this.list[i] = string;

	}


	// 삭제
	public String remove(int i) {
		if (index < i) {
			return this.list[index];
		}
		if (index > i) {
			this.list[i] = this.list[i + 1];
		}
		return null;

	}

	public void add(int i, String string) {
		this.list[i] = string;

	}



	public String get(int index) {
		return this.list[index];
		/*
		 * 없는 방번호를 요청한다면?
		 */
	}


	public int indexOf(String string) {
		for (int i = 0; i < list.length; i++) {
			if (list[i].equals(string)) {
				return index;
			}
		}
		return -1;
	}


	public void clear() {
		for (int i = 0; i < list.length - 3; i++) {
			list[i] = null;
		}

	}



}


