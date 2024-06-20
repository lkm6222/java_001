package java_00;

public class gugu {

	public static void gugu() {
		
		int num;
		int i;
		
		for( num=2; num<10; num++ ) {
			for(i=1; i<10; i++) {

				System.out.println( num + "*" + i + " = " + num*i );
				
			}
		}
	}
	

	public static void main(String[] args) {
		
		gugu();
	}

}