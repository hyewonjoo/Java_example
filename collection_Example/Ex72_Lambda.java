package com.text.java.collection;

public class Ex72_Lambda {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		/*
		 * 
		 * 람다식, Lambda Expression
		 * -메소드를 표현하는 방식 중 하나, 그냥 메서드라고 생각해도 무방
		 * -벗..! 인터페이스로부터 상속받아 , 재정의한 메소드
		 * -함수형 프로그래밍 방식 지원하는 표현식
		 * -람다식 사용하면 코드가 간결해진다.
		 * -자바 > 컬렉션(배열) 조작을 위해서 제공 
		 * 
		 * 결국, 람다식은 메소드의 표현
		 * -람다식은 매게변수를 가지는 코드블럭이다.(메소드를 칭하는 말)
		 * -자바의 람다식은 반드시 인터페이스가 있어야한다. *****
		 * -자바의 람다식은 익명객체를 만드는 방법을 간소화한 기술이다.****
		 * 
		 * 
		 * 람다식 형식
		 * -인터페이스 변수 = 람다식;
		 * ex)MyInterface m1 = () -> {} ;
		 * 
		 * (매개변수) -> {실행코드}
		 * a.매개변수 : 메소드의 메게변수 리시트와 완전 똑같다.
		 * b -> : 화살표(Arrow), 매개변수쪽에서 코드블록쪽으로 호출
		 * c.{실행코드} , 메소드의 몸통,구현부
		 */



		// 요구사항 : MyInterface를 구현한 객체 1개를 만드시오
		// 1 case 클래스선언 + 객체 생성
		MyClass m1 = new MyClass();
		m1.test();


		/*
		 * 2번 케이스와 3번케이스는 1회용 객체를 만들 떄 사용
		 */
		// 2 case 익명객체 생성(Anonymous)
		MyInterface m2 = new MyInterface() {
			public void test() {
				System.out.println("익명클래스 객체에서 구현한 메소드");
			}
		};

		m2.test();

		// case 3 람다식
		// 람다식 == 메소드 == ****인터페이스로부터 상속받아 재정의한 메소드!!! ,2번케이스를 좀 더 편리하게 했다고 생각하셈 !
		MyInterface m3 = () -> {
			System.out.println("람다식으로 구현한 메소드");
		};

		m3.test();



		System.out.println();
		System.out.println();
		System.out.println();


		// 익명 객체의 추상 메소드 형식에 따라 익명객체 생성
		NoParamaterNoReturn pr1 = new NoParamaterNoReturn() {

			@Override
			public void call() {
				System.out.println("pr1");

			}
		};
		pr1.call();

		// 저놈을 람다식으로 만들어보자
		NoParamaterNoReturn pr2 = () -> {
			System.out.println("pr2");
		};
		pr2.call();


		// ***실행 블럭의 문장이 유일하면 {} 생략 가능
		NoParamaterNoReturn pr3 = () -> System.out.println("pr3");
		pr3.call();


		// 매개변수가 있는 익명객체를 람다식으로 생성
		ParameterNoReturn pr4 = (int num) -> {
			System.out.println(num);
		};
		pr4.call(3);


		// ***매개변수의 자료형을 생략 할 수 있다.
		ParameterNoReturn pr5 = (num) -> System.out.println(num);
		pr5.call(5);


		// ** 매개변수의 소괄호를 생략 할 수 있다. -> 더이상은 못줄임
		ParameterNoReturn pr6 = num -> System.out.println(num);
		pr6.call(6);
		pr6.call(7);


		// 리턴값이 있는 경우
		MulitParameterNoReturn pr7 = (String name, int age) -> {
			System.out.println(name + age);
		};
		pr7.call("홍길동", 20);



		// **매개변수의 소괄호 생략은 매개변수가 1개일때만 가능하다!!!!!!!
		MulitParameterNoReturn pr8 = (name, age) -> {
			System.out.println(name + age);
		};
		pr8.call("아무개", 25);



		// 파라미터 없고 리턴 있는 람다식
		NoParameterReturn pr9 = () -> {
			return 10;
		};
		System.out.println(pr9.call());


		// ****실행문에 return문만 유일할때 블럭과 리턴을 생략 할 수 있다.
		NoParameterReturn pr10 = () -> 20;
		System.out.println(pr10.call());


	}// main

}// class 72



interface NoParamaterNoReturn {
	void call();
}


interface ParameterNoReturn {
	void call(int num);
}


interface MulitParameterNoReturn {
	void call(String name, int age);
}


interface NoParameterReturn {
	int call();
}



/*
 * 
 */


interface MyInterface {
	void test();
}


class MyClass implements MyInterface {

	@Override
	public void test() {
		System.out.println("실명 클래스 객체에서 구현한 메소드");
	}
}


