
public class chapter4_if_else {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int score = 89;
		if(score>60) {
				System.out.println("합격입니다");
				//반환식 true or false
		}
				
		//if-else
		int input = 2;
		if(input == 0) {
			System.out.println("0입니다");
			
		}
		else {
			System.out.println("0이 아닙니다");
		}
		
		//if-else문 2
		char grade;
		if(score >=90) {
			grade = 'A';
		}else if(score >=80){
			grade = 'B';
		}
		else if(score >=70){
			grade = 'C';
		}else {
			grade = 'D';
		}
		System.out.println(grade);
		
	
		
		//중첩  if문
		//쁠러스, 마이너스 추가
		char opt = '0';
		
		score = 82;
		score = 37;
		if(score >= 90) {
			grade ='A';
			if(score>=98) {
				opt='+';
			}
			else if(score<94) {
				opt = '-';
			}
		}
		else if(score >= 80) {
			grade = 'B';
			if(score>=88) {
				opt = '+';
			}
			else if(score<84) {
				opt = '-';
			}
		}
		else {
			grade = 'C';
		}
		System.out.print(grade);
		System.out.print(opt);
		
		
		
		}
	}


