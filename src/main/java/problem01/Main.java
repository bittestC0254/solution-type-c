package problem01;

import java.util.Random;
import java.util.Scanner;


public class Main {
	
	// 게임 변수들
	public static int min = 1;
	public static int max = 100;
	public static int count = 0;
	public static int randomNumber = new Random().nextInt(max) + min; // 정답
	
	
	public static void main(String[] args) {
	//	System.out.println("answer="+ randomNumber); //필히 삭제
		// 키보드 입력을 받기 위해 Scanner 생성
		Scanner scanner = new Scanner(System.in);
		
		// 게임 시작
		while( true ) {
	
			System.out.print( "[" + min + "-" + max + "] 사이의 값 입력:" );
			int answer = scanner.nextInt();
			count++;
			
			boolean result = checkAnswer( answer );
			if ( result ) {
				break;
			}
		
			System.out.println("");
		}
		
		// 키보드 닫기
		scanner.close();
		
		// 결과 출력
		System.out.println("\n맞췄습니다. 총 실행 횟수는 " + count + "번 입니다.");
	}
	
	public static boolean checkAnswer(int answer) {
		//answer = 입력 값
		if(answer>randomNumber) {
			if(answer<max) {
				max = answer;
			}
			else {
				//b 그대로
			}
			return false;
		}
		else if(answer<randomNumber) {
			if(min<answer) {
				min = answer;
			}
			else {
			 //a 그대로	
			}
			return false;
		}
		else { //same
			return true;
		}
	}
}