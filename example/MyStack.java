package com.test.java.collection.example;

public class MyStack {


	private String[] list = new String[5];
	private int index;
	private int count;

	public void MyStack() {// 기본생성자
		this.index = 0;
		this.count = 0;
	}

	public void push(String string) {
		this.list[this.index] = string;
		index++;


	}


	public String pop(int index) {
		// 후입선출
		count++;
		return this.list[(list.length - 1) - index];

	}

	public int size() {
		return index - count;
	}

	public String peek(int index) {

		return list[index];
	}


}
