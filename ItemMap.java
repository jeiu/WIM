package wim;
import java.util.HashMap;
import java.util.Scanner;

public class ItemMap {
	
	Scanner scan = new Scanner(System.in);

	HashMap<String, String[]> itemList = new HashMap<String,String[]>();

	
	// ��ǰ��� �޼ҵ�
	public void putItemList() {
		//�������� ����
		String quest;
		String name;								//������ �̸�
		String infoTag;								//������ ������ �̸�
		String infoData;							//���� ������ ���� ��
		String[] infoList = new String[3];	//��Ʈ���������� ���ڿ�
		
		while(true){
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
	//��ǰ��� �޼ҵ� ����
	
	
	
	
	//��ǰ���� �޼ҵ�
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
	//��ǰ���� �޼ҵ� ����
	
	
	
	//��ǰ��ȸ �޼ҵ�
	public void findItem() {
		String findName;
	}
	
	
	
}
