package exam;

public class Ex02_PrintExam {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int month = 12;
		int date = 25;
		String christmas = "크리스마스";
		int year = 2024;
		int lastYear = year - 1;
		double accept = 72.893;
		int num1 = 100;
		int num2 = 10;
		int numResult = num1 + num2;
		double pi = 3.141592653589793;
		int radius = 5;
		double circum =  pi * radius * 2;
		double area = pi * radius * radius;
		char strVal1 = '뷁';
		int charVal = strVal1;
		double num3 = 58.78945;
		int num4 = (int)num3;
		
		
		
		System.out.println(month + "월 " + date + "일은 " + christmas + " 입니다.");
		System.out.println("작년 " + lastYear +"년도 대학 합격률은 " + accept + " 퍼센트 였습니다.");
		System.out.println(num1 + "이라는 숫자에 " + num2 + "을 더하면 " + numResult + "이 됩니다.");
		System.out.println("원주율은 " + pi + " 이고, 반지름이 " + radius + "인 원의 둘레는 " + circum + " 입니다.");
		System.out.println("반지름이 " + radius + "인 원의 넓이는 " + area + " 입니다.");
		System.out.println(strVal1 + "의 문자번호는 " + charVal + "입니다.");
		System.out.println(num3 + "를 버림 하면 " + num4 + " 입니다.");
		
	}

}
