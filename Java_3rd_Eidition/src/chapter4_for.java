
public class chapter4_for {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//for(초기화; 조건식; 증감식) ->조건식이 거짓이 되기전까지 계속 반복됨
		
		for(int i = 1; i<=10 ; i=i+2) {//괄호{}안의 1,3,5,7,9 총 5번 반복
			System.out.println("Hello");
		}
		
		System.out.println();
		System.out.println();
		
		for(int i=1,j=10; i<=10; i++,j--) { //i는 for문을 벗어나면 쓸 수 없음 밖에서 필요할때는 초기화 식을 밖으로 빼내어야됨
											//i의 선언을 밖으로 빼내면 그 메소드 안에서는 계속 쓸 수 있음
			System.out.println("i는"+i+",j는"+j);
		}
		
		System.out.println();
		System.out.println();
		
		//1~5까지의 합 구하기
		int sum = 0;
		
		for(int i=1; i<=5; i++) {
			sum += i; //sum = sum + i
			//sum += 1; --> sum= sum+1
			//sum += 2;
			//sum += 3;
			//sum += 4;
			//sum += 5;
			System.out.printf("1부터 %2d까지의 합 : %2d\n",i,sum);
		}
		
		
		
	}

}
