package wim;
import java.util.*;
import java.util.HashMap;
import java.util.Scanner;

public class ItemMap {
	
	Scanner scan = new Scanner(System.in);

	HashMap<String, String[]> itemList = new HashMap<String,String[]>();

	// ==========��ǰ��� �޼ҵ�==========
	public void putItemList() {
		//�������� ����
		String quest;
		String name;								//������ �̸�
		String infoTag;								//������ ������ �̸�
		String infoData;							//���� ������ ���� ��
		String[] infoList;			//��Ʈ���������� ���ڿ�
		
		while(true){
			
			infoList = new String[3];
			// ��ǰ�� �̸��� �Է�
			System.out.println("��ǰ�� �̸��� �Է��ϼ���:");
			name = scan.next();
			
			// ��ǰ�� ������ ����
			infoTag = "���� : ";
			System.out.println("��ǰ�� ������ �Է��ϼ���");
			infoData = scan.next();
			infoList[0] = infoTag.concat(infoData);
			
			// ��ǰ�� ������ ����
			infoTag = "���� : ";
			System.out.println("��ǰ�� ������ �Է��ϼ���");
			infoData = scan.next();
			infoList[1] = infoTag.concat(infoData);
			
			// ������ �ڵ��� ����
			infoTag = "�ڵ� : ";
			System.out.println("��ǰ�� �ڵ带 �Է��ϼ���");
			infoData = scan.next();
			infoList[2] = infoTag.concat(infoData);
	
			itemList.put(name, infoList);
			
			System.out.println("�Ʒ��� ������ ��ϿϷ�Ǿ����ϴ�.\n");
			System.out.println("�̸� : "+name);
			for(int i=0; i<3; i++) {
				System.out.println(infoList[i]);
			}
			
			
			System.out.println("\n�߰��� ����Ͻðڽ��ϱ�? (Y/N)\n");
			quest = null;
			quest = scan.next();
			
			if(quest.equals("N") || quest.equals("n")) {
				System.out.println("\n��ǰ����� �����մϴ�");
				break;
			}else if(quest.equals("Y") || quest.equals("y")) {
				System.out.println("\n��ǰ����� ����մϴ�");
			}else {
				System.out.println("\n�߸��� ������ �Է��ϼ̽��ϴ�.\n�ʱ� �޴��� ���ư��ϴ�.");
				break;
			}
		}
	}
	
	//==========��ǰ���� �޼ҵ�==========
	public void delItemList() {
		String findName;
		String quest;
		String conti;
		
		while(true) {		
			System.out.println("������ ��ǰ�� �̸��� �Է��ϼ���\n");
			findName = scan.next();
		
			try{
				String[] infoList = itemList.get(findName);
				System.out.println("�̸� : "+findName);
				for(int i=0; i<3; i++) {
					System.out.println(infoList[i]);
				}
				System.out.println("�� ��ǰ�� ������ ���� �����Ͻðڽ��ϱ�? (Y/N)");
				quest = scan.next();
				
				if(quest.equals("Y") || quest.equals("y")) {
					itemList.remove(findName);
					System.out.println("������ �Ϸ�Ǿ����ϴ�.");
				}else if(quest.equals("n") || quest.equals("N")) {
					System.out.println("��ǰ ������ ����մϴ�.");
				}else {
					System.out.println("�߸��Է��ϼ̽��ϴ�.");
				}
				
			}catch(NullPointerException e){
				System.out.println("������ �߻��Ͽ����ϴ�.");
				
			}finally {
			}
			
			System.out.println("��ǰ������ ����Ͻðڽ��ϱ�? (Y/N)");
			conti = scan.next();
			
			if(conti.equals("Y") || conti.equals("y")) {
				System.out.println("��ǰ ������ ����մϴ�.");
				
			}else if(conti.equals("n") || conti.equals("N")) {
				System.out.println("�ʱ� �޴��� ���ư��ϴ�.");
				break;
			}
		}
	}
	
	//==========��ǰ��ȸ �޼ҵ�==========
	public void findItem() {
		String search;
		String quest;
		String[] search_values;
	
		while(true) {
			search = null;
			System.out.print("�˻��Ͻ� ��ǰ�� �̸��̳� �ڵ带 �Է��ϼ��� : \n���� ��ȸ�Ϸ��� ALL�� �Է��Ͻʽÿ�.");		
			search = scan.next();
			
			if(search.equals("ALL")) {
				Set<String> keys = itemList.keySet();

				for(String key : keys) {
					System.out.println("\n"+key);
					for(int i=0; i<3; i++) {
						System.out.println(itemList.get(key)[i]);
					}
				}
			}
				
			search_values=null;
			// �Է��� ���� �ؽ��� ���� Ű���� ������ ��
			if(itemList.containsKey(search)) {
				search_values = itemList.get(search);
				System.out.println(search_values[0]);
			} else {
				System.out.println("�߸� �Է��ϼ̽��ϴ�.");
			}
			
			System.out.println("��ǰ ��ȸ�� ����Ͻðڽ��ϱ�?");
			quest = scan.next();
			
			if(quest.equals("Y") || quest.equals("y")) {
				System.out.println("��ǰ ��ȸ�� ����մϴ�");
			}else if(quest.equals("n") || quest.equals("N")) {
				System.out.println("��ǰ ��ȸ�� �����մϴ�.\n�ʱ� �޴��� ���ư��ϴ�.");
				break;
			}else {
				System.out.println("�߸��Է��ϼ̽��ϴ�.\n�ʱ� �޴��� ���ư��ϴ�.");
				break;
			}
		}
	}
	
	//==========��ǰ �� �ݾ� �޼ҵ� (������)==========
	public void allItemPrices() {
		Set<String> keys = itemList.keySet();
		int total;
		String price;
		int priceInt;
		String[] value;
		
		total = 0;
		for(String key : keys) {
			price = itemList.get(key)[0];
			priceInt = Integer.valueOf(price);
			total += priceInt;
			
			System.out.println(key);
			for(int i=0; i<3; i++) {
				System.out.println(itemList.get(key)[i]);
			}
		
		System.out.println("��ǰ����� �� �ݾ� : "+total);
		}
	}
}
