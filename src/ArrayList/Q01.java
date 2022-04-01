package ArrayList;

public class Q01 {



	public static void main(String[] args) {
		// TODO Auto-generated method stub

		ArrayList_example list = new ArrayList_example();


		// 추가
		list.add("홍길동");
		list.add("아무개");
		list.add("하하하");
		list.add("가나");
		list.add("다라");
		list.add("마바 ");
		list.add("사");

		// 읽기
		System.out.println(list.get(0));
		System.out.println(list.get(1));
		System.out.println(list.get(2));

		// 개수
		System.out.println(list.size());

		System.out.println();

		// 탐색+ 읽기
		for (int i = 0; i < list.size(); i++) {
			System.out.println(list.get(i));
		}

		System.out.println();


		// 수정
		list.set(0, "우하하");
		System.out.println(list.get(0));

		System.out.println();


		// 삭제
		list.remove(1);

		for (int i = 0; i < list.size(); i++) {
			System.out.println(list.get(i));
		}

		System.out.println();


		// 삽입
		list.add(1, "호호호");
		for (int i = 0; i < list.size(); i++) {
			System.out.println(list.get(i));
		}

		System.out.println();



		// 검색
		if (list.indexOf("홍길동") > -1) {
			System.out.println("홍길동 있음");
		} else {
			System.out.println("홍길동 없음");
		}



		// 초기화
		list.clear();
		System.out.println(list.size());


	}

}
