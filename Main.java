package wim;

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		ItemMap im = new ItemMap();
		
		int choose, choose2;
		
		while(true) {
			System.out.println("----- ���� ������ �ý��� -----");
			System.out.println("       1. ����� ����");
			System.out.println("       2. ��� Ȯ��");
			System.out.println("       3. ���� Ȯ��");
			System.out.println("       4. ����");
			System.out.println("----------------------------");
			System.out.print("��ȣ�� �Է��� �ּ��� : ");
			
			choose = scan.nextInt();
			
			switch(choose) {
				case 1:
					System.out.println("1. ��� ���");
					System.out.println("2. ��� ����");
					
					choose2 = scan.nextInt();
					
					if(choose2 == 1) { im.putItemList(); }
					else if(choose == 2) {im.delItemList(); }
					else { break; }

					break;
				case 2:
					System.out.println("1. ��� �˻�");
					System.out.println("2. ��� �� �ݾ� Ȯ��");
					
					choose2 = scan.nextInt();
					
					if(choose2 == 1) { im.findItem(); }
					else if(choose2 == 2) { im.allItemPrices(); }
					else { break; }

					break;
				case 3:
					System.out.println("1. ���� �Ѱ�");
					System.out.println("2. �Ǹ� �Ѱ�");
					break;
				default:
					System.out.println("�ٽ� �Է��� �ּ���");
					break;
			}
			
			if(choose == 4) { break; }
		}
	}
}
