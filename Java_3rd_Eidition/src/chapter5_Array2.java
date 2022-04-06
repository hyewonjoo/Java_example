import java.util.Arrays;

public class chapter5_Array2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// 배열 섞기
		int[] numArr = {0, 1, 2, 3, 4, 5, 6, 7, 8, 9};
		System.out.println(Arrays.toString(numArr));

		for (int i = 0; i < numArr.length; i++) {
			int n = (int) (Math.random() * 10);// 0~9까지 난수
			int tmp = numArr[0]; // 오른쪽에서 왼쪽으로 대입하기
			numArr[0] = numArr[n]; // 무작위 인덱스배열을 첫번쨰 배열 빈공간에 넣어주기
			numArr[n] = tmp;
		}
		System.out.println(Arrays.toString(numArr));
		System.out.println();
		System.out.println();
		System.out.println();

		// 로또번호구하기
		int[] ball = new int[45]; // 0~44 까지의 정수값 저장
		for (int i = 0; i < ball.length; i++) {
			ball[i] = i + 1; // 1~45까지 저장됨
		}
		int temp = 0;
		int j = 0;

		for (int i = 0; i < 6; i++) {
			j = (int) (Math.random() * 45); // 0~44까지 랜덤수
			temp = ball[i];
			ball[i] = ball[j]; // i인덱스와 j인덱스를 바꿈
			ball[j] = temp;
			System.out.println(Arrays.toString(ball));

		}
		System.out.println(Arrays.toString(ball));

	}



}

