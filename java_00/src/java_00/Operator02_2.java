package java_00;

public class Operator02_2 {
	public static void main(String[] args) {

		// >, >=, <, <=, ==(equals), !=(not equals)

		int a = 100;
		int b = 50;
		int c = 1;
		/*
		 * // 1. a가 b보다 클까요? true System.out.println(a + " > " + b + " ? " + (a > b));
		 * 
		 * // 2. b가 c보다 크거나 같을까요? true System.out.println(b + " >= " + c + " ? " + (b >=
		 * c));
		 * 
		 * // 3. a가 c보다 작을까요? false System.out.println(a + " < " + c + " ? " + (a < c));
		 * 
		 * // 4. a가 b보다 작거나 같을까요? false System.out.println(a + " <= " + b + " ? " + (a
		 * <= b));
		 * 
		 * // 5. a와 b가 같을까요? false System.out.println(a + " = " + b + " ? " + (a == b));
		 * 
		 * // 6. a와 a가 다를까요? false System.out.println(a + " != " + a + " ? " + (a !=
		 * a));
		 * 
		 * // 7. b와 c가 다를까요? true System.out.println(b + " != " + c + " ? " + (b != c));
		 * 
		 */

		// 사용자 나이 입력 - 19세 이상 통과, 미만 거절
		// true(통과), false(거절)

		int age = 10;
		boolean ageResult;

		ageResult = age >= 19;

		System.out.println("나이 : " + age);
		System.out.println("결과 : " + ageResult);

		// 숫자 입력 - 짝수인지, 아닌지를 판단

		int num1 = 9999;
		int numResult;
		
	}
}
