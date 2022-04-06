
public class chapter4_break_continue_etc {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// break 문
		int sum = 0;
		int i = 0;
		while (true) // 무한 반복문 true생략 불가 ->for(;;) : 무한반복문
		{
			if (sum > 100)
				break; // 자신이 속한 하나의 반복문을 벗어난다
			++i;
			sum = sum + i;
		}

		// continue문
		// 다음 반복문으로 건너띌때 사용
		for (i = 0; i <= 10; i++) {
			if (i % 2 == 0)
				continue; // 2 의 배수는 건너 띄고 출력됨
			System.out.println(i);
		}


		// 이름붙은 반복문
		Loop1: for (i = 2; i <= 9; i++) {
			for (int j = 2; j <= 9; j++) {
				if (j == 5)
					break Loop1; // Loop1(중첩 반복문)자체를 빠져나감
				// break ; -> 현재for문만 빠져나감
				System.out.println(i + "*" + j + "=" + i * j);
			}
			System.out.println();

		}
		System.out.println(); // break Loop를 하면 여기로 빠져나오게됨



	}

}
