package java_00;

public class Operator03_2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// 21보다 크거나 같고(이상), 59보다 작은(미만)
		int num = 45;

		boolean result;
		result = (num >= 21) && (59 > num);

		System.out.println(num + "은(는) 21보다 크거나 같고, 59보다 작다 >>>>>>> " + result);

	}

}
