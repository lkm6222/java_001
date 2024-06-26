package calc;

import java.util.Scanner;

public class CalcAvgEx {

	private static Scanner sc = new Scanner(System.in);

	public static void main(String[] args) {

		/*
		[ 요구사항 ]
		- 숫자를 연속으로 입력받아 평균값을 구하세요.
		- 숫자 0 을 입력 받으면 반복을 멈추고 최종 결과를 보여주세요.
		--------------------------

		 */
		
		int num = 0;
		int resultNum = 0;
		int average = 0;
		int cnt = 0;
		
		String calcStr = "";
		boolean flag = true;

		while (flag) {

			num = getNum(); // 숫자 입력받는 함수
			resultNum = resultNum + num;
			cnt++;

			if (num == 0) {
				flag = false;
				continue;
			}
			
			if("".equals(calcStr)) {
				calcStr = "" + num;
			}
			else {
				calcStr = calcStr + " + " + num;
			}
			
			System.out.println(calcStr);
			average = resultNum / cnt;
		}

		System.out.println(calcStr + " = "+ resultNum);
		System.out.println("평균값 = " + average);
	}
	
	public static int getNum() {
		System.out.println("숫자를 입력하세요 : ");
		int num = sc.nextInt();

		return num;
	}
}