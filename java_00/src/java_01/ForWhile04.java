package java_01;

public class ForWhile04 {

	public static void main(String[] args) {

		// 1~9단까지 구구단을 모두 출력해 보세요.

		// while 문 활용
		System.out.println("====== [ while문 ] 구구단 ==========");
		int danW = 1;
		
		while ( danW <= 9  ) {
			
			int hangW = 1;

			while ( hangW <= 9 ) {
				int result = 0;
				
				result = danW * hangW;	
				System.out.println(danW + "*" + hangW + "=" + result );
				hangW++;
			}
			danW++;
		}
		

//		// for 문 활용
//		System.out.println("====== [ for문 ] 구구단 ==========");
//		int dan = 1;
//		int hang = 1;
//		
//		for (dan = 1; dan <= 9; dan++) {
//			System.out.println();
//			System.out.println(dan + "단");
//
//			for (hang = 1; hang <= 9; hang++) {
//				System.out.println(dan + "*" + hang + " = " + dan * hang);
//			}
//		}
	}

}