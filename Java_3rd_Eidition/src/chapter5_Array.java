import java.util.Arrays;

public class chapter5_Array {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// 배열
		// 같은 타입의 여러 변수를 하나의 묶음으로 다루는 것 ->같은타입, 연속적인것이 특징


		// 배열의 선언 : 타입[] 변수이름 -> 배열을 다루기 위한 참조변수의 선언
		// 배열의 생성 : 변수이름 = new 타입[길이]
		int[] score = new int[5]; // int값 5개를 저장할 수 있는 배열을 생성

		// 배열의 인덱스
		// - 각 요소(저장공간) 에 자동으로 붙는 일련 번호
		// - 인덱스 범위 = 배열의 길이 -1

		int[] score2; // 1. 배열 score를 선언(참조변수)
		score2 = new int[5]; // 2.배열의 생성(int저장공간 x5)

		int[] score3 = new int[5]; // 선언과 생성을 동시에 !! 인덱스범위 0~4
		score3[3] = 100; // 배열의초기화 :배열의 값을 저장화 하는것 -> 기본적으로 0으로 초기화 되어있는 상태

		System.out.println("score3[0] = " + score3[0]);
		System.out.println("score3[1] = " + score3[1]);
		System.out.println("score3[2] = " + score3[2]);
		System.out.println("score3[3] = " + score3[3]);
		System.out.println("score3[4] = " + score3[4]);

		int value = score3[3];// score3[3]에 있는값이 변수 value에 저장됨
		System.out.println(value);


		// 초기화 방법2 - for문 이용
		int[] iArr = {50, 60, 70, 80, 90}; // 배열의 길이 iArr.length = 5;
		// 배열의 출력
		for (int i = 0; i < iArr.length; i++) {
			System.out.print(iArr[i]);
		}
		System.out.println();


		// 초기화 방법3
		System.out.println(Arrays.toString(iArr));

		System.out.println();
		System.out.println();

		int[] Arr = {100, 95, 80, 70, 60}; // 배열의 초기화, 인덱스의 길이 5
		for (int i = 0; i < Arr.length; i++) {
			System.out.println(Arr[i]);
		}

		System.out.println(Arrays.toString(Arr));



	}

}
