package problem04;

public class Main {
	public static void main(String[] args) {
		//구구단
		//각 단에서 2개씩
		//문제 선택
		int[] question1= new int[10];
		int[] question2 = new int[10];
		
		int random_num1, random_num2;
		
		for(int i=1;i<=9;i++) { //1단부터 9단까지
			//random값 만들기
			
			random_num1 = ( int ) (Math.random() * 9 )+1;
			random_num2 = ( int ) (Math.random() * 9 )+1; //1~9
			question1[i-1]=random_num1;
			question2[i-1]=random_num2;
			System.out.printf("%dx%d, %dx%d\n",i,random_num1, i,random_num2);
		}
		//각 단에서 문제 선택
		
		int random_num_idx1;
		int random_num_idx2;
		int one_two;
		int num2;
		int num1;
		
		
		for(int i=1;i<=9;i++) {
			random_num1 = ( int ) (Math.random() * 9 ); //index 선택
			random_num2 = ( int ) (Math.random() * 9 ); //index 선택
			one_two = (int)(Math.random()*1)+1;
			if(one_two ==0) {
				num1 = random_num1;
				num2 = question1[random_num1];
			}
			if(one_two==1) {
				num1 = random_num2;
				num2 = question2[random_num2];
			}
			
			System.out.printf("%d. %d x %d ?", i, random_num1+1, num2);
		}
	}
}