
public class chapter4_while {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//while문은 반복횟수를 모를 때 사용한다.
		//for문은 반복횟수를 알 때 사용한다.
		int i=5;  //5번 반복
		while(i!=0) {
			i--;
			System.out.println("i can do it.");
			
		}
		
		int sum = 0;
		i=0;
		//i를 1씩 증가시켜서 sum에 더해간다.
		while(sum<=100) {//조건식
			System.out.printf("%d - %d\n",i,sum);
			sum = sum + ++i;
		}//sum이 100보다 크게되면  while문 멈춤
		
	
	}

}
