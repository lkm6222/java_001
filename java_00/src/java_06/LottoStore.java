package java_06;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.Scanner;

public class LottoStore {

	private Scanner sc = new Scanner(System.in);

	public static void main(String[] args) {
		new LottoStore().startLotto();
	}

	public void startLotto() {

		while(true) {
			int choice = displayMenu();

			switch(choice) {
			case 1:
				//로또 구매하기
				saleLotto();
				break;
			case 2:
				//프로그램종료
				System.out.println("감사합니다. 안녕히가세요.");
				return;
			default:
				System.out.println("1 또는 2를 입력해주세요ㅣ");
				break;
			}
		}
	}


	public int displayMenu() {
		System.out.println("===== 로또판매점 =====");
		System.out.println("1. Lotto 구매하기");
		System.out.println("2. 프로그램 종료");
		System.out.println("===================");
		System.out.println("선택 : ");
		int choice = sc.nextInt();

		return choice;
	}


	//금액 받고 로또 구매
	public void saleLotto() {
		System.out.println("1000원에 로또 번호 하나씩 입니다.");
		System.out.println("로또는 최대 100매 까지 구매 가능합니다.");
		System.out.println("구매를 원하시는 금액을 입력해 주세요.");
		System.out.println("금액 입력 : ");
		int money = sc.nextInt();

		System.out.println();

		if(money < 1000) {
			System.out.println("입력 금액이 너무 적습니다. 1000원 이상으로 입력해주세요.");
			return;
		} 

		if(money >= 100000){
			System.out.println("구매 금액이 너무 큽니다. 10만원 이상은 구매 불가해요.");
			return;
		}

		//로또 번호 만들기
		createLotto(money);

		System.out.println();
		
		System.out.println("받은 금액은 " + money + "원 이고, 거스름돈은 " + (money%1000) + " 원 입니다.");
	}


	//로또 번호생성
	public void createLotto(int money) {

		int lottoCnt = money / 1000;

		//장 수를 넣어 줄 list 생성, 중복된 데이터 넣을 수 없음
		HashSet<Integer> lottoSet = new HashSet<Integer>();		

		for(int i = 1; i <= lottoCnt; i++) {

			while(lottoSet.size() < 6){

				int lottoNum = (int) (Math.random() * 45 + 1);
				lottoSet.add(lottoNum);
			}

			ArrayList<Integer> lottoList = new ArrayList<Integer>(lottoSet);
			Collections.sort(lottoList);	//자동 정렬

			System.out.println();
			System.out.println("로또 번호 : " + i + " 번 >>>>>");

			for(int lottoNum : lottoList) {
				System.out.print(lottoNum + " ");
			}

			System.out.println();
			lottoSet.clear();
		}

	}


}
