package member;

public class MemberInfo {

	public static void main(String[] args) {

		// Member 객체 생성 - 기본 생성자
		
		Member member = new Member(); 

		member.setMemberId("lkm");
		member.setMemberName("이경미");
		member.setMemberGender("여");
		member.setMemberEmail("mombulsala@gamil.com");
		member.setMemberPhone("01067507748");
		
		System.out.println(member.getMemberId());
		System.out.println(member.getMemberName());
		System.out.println(member.getMemberGender());
		System.out.println(member.getMemberEmail());
		System.out.println(member.getMemberPhone());


		// Member(String, String) - 회원 아이디와 이름으로 구성된 생성자
		// 오징어 게임 시즌 1 출연진
//		Member mem1 = new Member("id_1", "이정재");
//		Member mem2 = new Member("id_2", "박해서");
//		Member mem3 = new Member("id_3", "오영수");
//		Member mem4 = new Member("id_4", "정호연");
//		Member mem5 = new Member("id_5", "허성태");
//		
//		System.out.println("회원1 : " + mem1.getMemberId() + " :: " + mem1.getMemberName());
//		System.out.println("회원2 : " + mem2.getMemberId() + " :: " + mem2.getMemberName());
//		System.out.println("회원3 : " + mem3.getMemberId() + " :: " + mem3.getMemberName());
//		System.out.println("회원4 : " + mem4.getMemberId() + " :: " + mem4.getMemberName());
//		System.out.println("회원5 : " + mem5.getMemberId() + " :: " + mem5.getMemberName());
//		
		
		// 드라마 오징어 게임 시즌 1 출연자 정보 호출
		MemberDrama.dramaMemberInfo();
		
		
		
		// 여러명의 멤버 생성 (회원 아이디와 이름으로만 구성)
		
		

	}

}