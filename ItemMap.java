package wim;
import java.util.HashMap;
import java.util.Scanner;

public class ItemMap {
	
	Scanner scan = new Scanner(System.in);

	HashMap<String, String[]> itemList = new HashMap<String,String[]>();

	
	// 상품등록 메소드
	public void putItemList() {
		//지역변수 지정
		String quest;
		String name;								//물자의 이름
		String infoTag;								//물자의 정보의 이름
		String infoData;							//물자 정보의 넣을 값
		String[] infoList = new String[3];	//스트링버퍼형의 문자열
		
		while(true){
			// 상품의 이름을 입력
			System.out.println("상품의 이름을 입력하세요:");
			name = scan.next();
			
			// 상품의 가격의 정보
			infoTag = "가격 : ";
			System.out.println("상품의 가격을 입력하세요");
			infoData = scan.next();
			infoList[0] = infoTag.concat(infoData);
			
			// 상품의 수량의 정보
			infoTag = "수량 : ";
			System.out.println("상품의 수량을 입력하세요");
			infoData = scan.next();
			infoList[1] = infoTag.concat(infoData);
			
			// 싱픔의 코드의 정보
			infoTag = "코드 : ";
			System.out.println("상품의 코드를 입력하세요");
			infoData = scan.next();
			infoList[2] = infoTag.concat(infoData);
	
			itemList.put(name, infoList);
			
			System.out.println("아래의 정보로 등록완료되었습니다.\n");
			System.out.println("이름 : "+name);
			for(int i=0; i<3; i++) {
				System.out.println(infoList[i]);
			}
			
			System.out.println("\n추가로 등록하시겠습니까? (Y/N)\n");
			quest = scan.next();
			
			if(quest.equals("N") || quest.equals("n")) {
				System.out.println("\n상품등록을 종료합니다");
				break;
			}else if(quest.equals("Y") || quest.equals("y")) {
				System.out.println("\n상품등록을 계속합니다");
			}else {
				System.out.println("\n잘못된 정보를 입력하셨습니다.\n초기 메뉴로 돌아갑니다.");
				break;
			}
		}
	}
	//상품등록 메소드 종료
	
	
	//상품조회 메소드
	public void findItem() {
		String findName;
	}
	
	
	
}
