
public class chapter4_for_multiplication {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//for문 내에 또 다른 for문을 실행 할 수 있다.
		
		//별찍기
		for(int i=1; i<=5; i++) {
			for(int j=1; j<=i; j++) {
				System.out.print("*");
			}
			System.out.println();
			
		}
		System.out.println();
		System.out.println();
		
		//별찍기2
		for(int i=1; i<=5;i++) {
			for(int j=1; j<=5-i; j++) {
				System.out.print(" ");
			}
			for(int j=1; j<=i; j++) {
				System.out.print("*");
		}
			System.out.println();
	}
		System.out.println();
		System.out.println();
		
		//별찍기3
		for(int i=5; i>=1;i--) {
			for(int j=1; j<=i; j++) {
				System.out.print("*");
			}
			for(int j=1; j<=5-i; j++) {
				System.out.print(" ");
		}
			System.out.println();
	}
		System.out.println();
		System.out.println();
		
		
		//구구단
		for(int i=2; i<=9; i++) {
			for(int j=2; j<=9; j++) {
				 System.out.printf("%d x %d는 %d이다.\n",i,j,i*j);
			}
			System.out.println();
		}
	}

}
