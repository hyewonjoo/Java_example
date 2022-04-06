
public class chapter5_ArrayString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String[] name = new String[3];
		// 문자열의 기본값은 null이다
		// 인덱스 범위 0~2


		name[0] = "Kim"; // String배열의 초기화
		name[2] = "Sim";
		name[2] = "Mim";
		// String[] name = {"Kim","Sim","Min"}

		for (int i = 0; i < 10; i++) { // 10번 반복
			int tmp = (int) (Math.random() * 3); // 0~2까지 무작위 난수
			System.out.println(name[tmp]);

		}

	}

	// 커멘드라인으로 입력받기


}
