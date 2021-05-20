package wim;

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		int choose;
		
		System.out.println("----- 물류 재고관리 시스템 -----");
		System.out.println("       1. 입출고 관리");
		System.out.println("       2. 재고 확인");
		System.out.println("       3. 매출 확인");
		System.out.println("----------------------------");
		System.out.print("번호를 입력해 주세요 : ");
		
		choose = scan.nextInt();
		
		switch(choose) {
			case 1:
				// 입출고 관리
				break;
			case 2:
				// 재고 확인
				break;
			case 3:
				// 매출 확인
				break;
		}
	}
}
