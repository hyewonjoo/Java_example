import java.util.Scanner;

public class chapter4_switch {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//swith문은 경우의 수가 많을 때 사용하기 유리함
		//swith문 제약조건
		//1. 조건식 결과는 정수, 문자열만 가능
		//2. case문의 값은 정수,상수,문자열 만 가능 (변수,실수 안됨 
		//3. cas문의 값은 중복되면 안됨
		
		System.out.println("현재 월을 입력하세요");
		Scanner scanner= new Scanner(System.in);
		int month = scanner.nextInt(); //화면을 통해 입력받은 month를 저장
		
		switch(month){
		case 3:
		case 4:
		case 5:
			System.out.println("현재의 계절은 봄입니다");
			break;
		case 6: case 7: case 8:
			System.out.println("현재의 계절은 여름입니다");
			break;
		case 9: case 10: case 11:
			System.out.println("현재의 계절은 가을입니다");
			break;
		default:
		//case12 case 1 case 2
			
		}
	}

}
