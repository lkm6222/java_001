package java_01;

import java.util.Scanner;

public class Switch02 {

	public static void main(String[] args) {

		// -----------------------------------------------------
		// Scanner를 통해 1~12 사이의 정수를 입력 받아 해당 월의 마지막 일자를 출력
		// 
		// [ 출력 결과 예시 ] 6월의 마지막 날짜는 30일 입니다.
		// -----------------------------------------------------
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("월을 입력하세요 : ");
		int month = sc.nextInt();
		
		//31일 : 1, 3, 5, 7, 8, 10, 12
		//30일 : 4, 6, 9, 11
		//28일 : 2
		switch (month) {
		case 1: case 3: case 5: case 7: case 8: case 10: case 12:
			System.out.println( month + "월의 마지막 날짜는 31일 입니다." );
			break;
			
		case 4: case 6: case 9: case 11:
			System.out.println( month + "월의 마지막 날짜는 30일 입니다." );
			break;
			
		case 2:
			System.out.println( month + "월의 마지막 날짜는 28(29)일 입니다." );
			break;
		
		default :
			System.out.println( "잘못된 입력입니다." );
		}
		
		
		
		
		
		
		// 동일한 조건식을 if문으로 작성해보기
		
		System.out.println("월을 입력하세요(if) : ");
		int month2 = sc.nextInt();
		
		if( month2 == 1 || month2 == 3 || month2 == 5 || month2 == 7 || month2 == 8 || month2 == 10 || month2 == 12) {
			System.out.println( month2 + "월의 마지막 날짜는 31일 입니다." );
		}
		else if( month2 == 4 || month2 == 6 || month2 == 9 || month2 == 11) {
			System.out.println( month2 + "월의 마지막 날짜는 30일 입니다." );			
		}
		else if( month2 == 2 ) {
			System.out.println( month2 + "월의 마지막 날짜는 28(29)일 입니다." );			
		}
		else {
			System.out.println( "잘못된 입력입니다." );			
		}
	}

}