package ArrayList;

public class ArrayList_example {


	private String[] list; // ArrayList의 내부배열 ***
	private int index; // ***가장 중요***


	public ArrayList_example() { // 생성자
		this.index = 0;
	}


	public boolean add(String value) {
		// 배열의 끝에 아이템 넣기
		// 1, 처음 넣을 때 배열 만들기
		// 1,5, 방이 모자라면 배열을 두배로 늘리기
		// 2, 데이터 넣기
		try {
			init();
			if (ckeckLength()) {
				doubleList();
			}

			this.list[this.index] = value;
			this.index++;

			return true;
		} catch (Exception e) {
			return false;
		}

	}

	private void doubleList() {
		// 1. 2배 길이의 배열
		// 2.깊은 복사
		// 3. 교체
		String[] temp = new String[this.list.length * 2];// 길이가 두배인 temp배열 생성

		for (int i = 0; i < this.list.length; i++) {
			temp[i] = this.list[i]; // 배열복사
		}
		this.list = temp; // 두배로 만든 temp값을 원래 배열에다가 넣어줌
	}

	// 방이 꽉 찼는지?
	private boolean ckeckLength() {
		if (this.index == this.list.length) {
			return true;
		}
		return false;
	}


	private void init() {
		// 처음 넣을 때 배열 만들기
		if (this.index == 0) { // 인덱스가 0일경우 전부 초기화!!!!!!!!!
			this.list = new String[4];
		}

	}

	// 사이즈
	public int size() {

		return this.index;
	}



	// 수정
	public String set(int index, String string) {

		if (!checkIndex(index)) {
			// 잘못된 방번호 -> 강제 에러 발생
			throw new IndexOutOfBoundsException();

		}
		String temp = this.list[index]; // 기존의 인덱스값을 temp에 넣어줌

		this.list[index] = string; // 수정값 넚어줌

		return temp; // 기존 인덱스 반환
	}



	// 삭제 -left shift
	public String remove(int index) {
		String temp = this.list[index];
		// left shift
		// 레프트 쉬프트 라이트 쉬프트 다시 복습
		for (int i = index; i < this.list.length - 1; i++) {
			this.list[i] = this.list[i + 1];
		}
		this.index--; // 쉬프트와 함께 인덱스를 하나 줄여야함!!


		return temp;
	}



	// 삽입 -right shift
	public boolean add(int index, String string) {
		// Right Shift
		try {
			for (int i = this.list.length - 2; i >= index; i--) {
				this.list[i + 1] = this.list[i];
			}

			this.list[index] = string;// 이제 값 끼워넣기
			this.index++;// 다시 인덱스를 늘려줘야함

			return true;

		} catch (Exception e) {
			return false;
		}

	}

	// 홍길동 있냐 없냐 탐색
	public int indexOf(String string) {
		for (int i = 0; i < index; i++) { // 데이터가 있는 곳 까지만 검색 list.length -> index
			if (list[i].equals(string)) {
				return index; // 찾음
			}
		}
		return -1; // 못찾음
	}



	public String get(int index) {
		if (!checkIndex(index)) {
			// 잘못된 방번호 -> 강제 에러 발생
			throw new IndexOutOfBoundsException();

		}
		return this.list[index];
	}


	private boolean checkIndex(int index) {
		// 유효한 인덱스 범위?
		// 0~index-1
		if (index >= 0 && index < this.index) {
			return true;
		}
		return false;
	}



	// 모든 요소 삭제하기
	public void clear() {
		// case1. 진짜 삭제
		// for(int i=0; i<this.index;i++) {
		// this.list[i]= null;
		// }

		// case2. 배열 새로 생성 -> 기존 데이터 삭제
		// this.list = new String[4];

		// case3
		this.index = 0; // size출력하면 0이 나옴

	}

}
