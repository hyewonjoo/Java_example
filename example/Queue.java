package com.test.java.collection.example;

public class Queue {

	private String[] list = new String[5];
	private int index;
	private int count;

	public void Queue() { // 기본 생성자
		index = 0;
	}

	public void add(String string) {
		this.list[index] = string;
		index++;
	}

	public String poll(int index) {
		count++;
		return list[index];
	}



	public int size() {

		return list.length - count;
	}

	public String peek(int index) {

		return list[index];
	}

}
