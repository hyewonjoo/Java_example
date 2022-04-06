import java.util.*;
public class chapter4_do_while {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int input = 0;
		int answer = 0;
		
		answer = (int)(Math.random()*100)+1; //1~100까지의 랜덤수
		Scanner scanner = new Scanner(System.in);
		
		do {//조건식의 연산결과가 참일 때 수행될 문장을 적는다.(처음 한 번은 무조건 실행)
			System.out.print("1~100까지의 정수를 입력하세요.>");
			input = scanner.nextInt();
			
			if(input>answer) {
				System.out.println("더 작은 수를 입력하세요");
			}else if(input<answer){
				System.out.println("더 큰 수를 입력하세요");
			}
		}
		while(input!=answer); //끝에 ; 잊지 않도록 주의! 
							  //while문 한줄일때는 가로 안써도됨
		
		System.out.println("정답입니다"); // 정답이 나오면 do-while문 빠져나와서 밑에 문장 출력됨
	}

}
