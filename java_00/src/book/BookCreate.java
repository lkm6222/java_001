package book;

import java.util.Scanner;

public class BookCreate {
	
	private static Scanner sc = new Scanner(System.in);

	public static void bookInforinser() {
		
		// 도서 정보를 입력 받아 Book1을 만들어 주세요.
		System.out.println("책이름 입력 : ");
		String b1Title = sc.next();
		
		System.out.println("가격 입력 : ");
		int bookPrice = sc.nextInt();
		
		System.out.println("저자 입력 : ");
		String b1Author = sc.next();

		System.out.println("출판사 입력 : ");
		String b1Publisher = sc.next();

		System.out.println("발행일 입력 : ");
		String b1PubYear = sc.next();

		System.out.println("Isbn 코드 입력 : ");
		String b1Isbn = sc.next();
		
		System.out.println("총페이지 입력 : ");
		int bookPage = sc.nextInt();

		
		Book book = new Book();
		
		book.setTitle(b1Title);
		book.setPrice(bookPrice);
		book.setAuthor(b1Author);
		book.setPublisher(b1Publisher);
		book.setPubYear(b1PubYear);
		book.setIsbn(b1Isbn);
		book.setPage(bookPage);
		
		bookInfoSelect(book);

	}
	
	public static Book bookInfoSelect(Book book) {
		
		System.out.println(book.bookInfo());
		
		return book;
	}
}
