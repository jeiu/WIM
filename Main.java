package wim;

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		int choose;
		
		System.out.println("----- ���� ������ �ý��� -----");
		System.out.println("       1. ����� ����");
		System.out.println("       2. ��� Ȯ��");
		System.out.println("       3. ���� Ȯ��");
		System.out.println("----------------------------");
		System.out.print("��ȣ�� �Է��� �ּ��� : ");
		
		choose = scan.nextInt();
		
		switch(choose) {
			case 1:
				// ����� ����
				break;
			case 2:
				// ��� Ȯ��
				break;
			case 3:
				// ���� Ȯ��
				break;
		}
	}
}
