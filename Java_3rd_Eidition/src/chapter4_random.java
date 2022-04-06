
public class chapter4_random {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//임의의 정수 만들기
		//Math.random() - 0.0 <= Math.random() <1.0 사이의 double값을 반환
		//Math.random 각변에 6을 곱하고 -> 각 변을 int형으로 전환 하고 -> 각 변에 1을 더한다.
		
		int num = 0;
		for(int i = 1; i<=20 ; i++) {
			num = (int)(Math.random()*20)+1 ; //1~20까지 랜덤수
			System.out.println(num);
		}
		System.out.println();
		//~5에서 5까지 난수
		//-5 -4 -3 -2 -1 0 1 2 3 4 5 -> 총 11개
		for(int i = 1; i<=11 ; i++) {
			num = (int)(Math.random()*11)-5; //0<=x<11 ->-5빼면-> -5<=x<6 
			System.out.println(num);
		}
	}

}
