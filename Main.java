package wim;

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		ItemMap im = new ItemMap();
		
		int choose, choose2;
		
		while(true) {
			System.out.println("----- 물류 재고관리 시스템 -----");
			System.out.println("       1. 입출고 관리");
			System.out.println("       2. 재고 확인");
			System.out.println("       3. 매출 확인");
			System.out.println("       4. 종료");
			System.out.println("----------------------------");
			System.out.print("번호를 입력해 주세요 : ");
			
			choose = scan.nextInt();
			
			switch(choose) {
				case 1:
					System.out.println("1. 재고 등록");
					System.out.println("2. 재고 삭제");
					
					choose2 = scan.nextInt();
					
					if(choose2 == 1) { im.putItemList(); }
					else if(choose == 2) {im.delItemList(); }
					else { break; }

					break;
				case 2:
					System.out.println("1. 재고 검색");
					System.out.println("2. 재고 총 금액 확인");
					
					choose2 = scan.nextInt();
					
					if(choose2 == 1) { im.findItem(); }
					else if(choose2 == 2) { im.allItemPrices(); }
					else { break; }

					break;
				case 3:
					System.out.println("1. 구입 총계");
					System.out.println("2. 판매 총계");
					break;
				default:
					System.out.println("다시 입력해 주세요");
					break;
			}
			
			if(choose == 4) { break; }
		}
	}
}
