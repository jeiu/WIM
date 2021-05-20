package wim;
import java.util.*;
import java.util.HashMap;
import java.util.Scanner;

public class ItemMap {
	
	Scanner scan = new Scanner(System.in);

	HashMap<String, String[]> itemList = new HashMap<String,String[]>();

	// ==========상품등록 메소드==========
	public void putItemList() {
		//지역변수 지정
		String quest;
		String name;								//물자의 이름
		String infoTag;								//물자의 정보의 이름
		String infoData;							//물자 정보의 넣을 값
		String[] infoList;			//스트링버퍼형의 문자열
		
		while(true){
			
			infoList = new String[3];
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
			quest = null;
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
	
	//==========상품삭제 메소드==========
	public void delItemList() {
		String findName;
		String quest;
		String conti;
		
		while(true) {		
			System.out.println("삭제할 상품의 이름을 입력하세요\n");
			findName = scan.next();
		
			try{
				String[] infoList = itemList.get(findName);
				System.out.println("이름 : "+findName);
				for(int i=0; i<3; i++) {
					System.out.println(infoList[i]);
				}
				System.out.println("위 상품의 정보를 정말 삭제하시겠습니까? (Y/N)");
				quest = scan.next();
				
				if(quest.equals("Y") || quest.equals("y")) {
					itemList.remove(findName);
					System.out.println("삭제가 완료되었습니다.");
				}else if(quest.equals("n") || quest.equals("N")) {
					System.out.println("상품 삭제를 취소합니다.");
				}else {
					System.out.println("잘못입력하셨습니다.");
				}
				
			}catch(NullPointerException e){
				System.out.println("오류가 발생하였습니다.");
				
			}finally {
			}
			
			System.out.println("상품삭제를 계속하시겠습니까? (Y/N)");
			conti = scan.next();
			
			if(conti.equals("Y") || conti.equals("y")) {
				System.out.println("상품 삭제를 계속합니다.");
				
			}else if(conti.equals("n") || conti.equals("N")) {
				System.out.println("초기 메뉴로 돌아갑니다.");
				break;
			}
		}
	}
	
	//==========상품조회 메소드==========
	public void findItem() {
		String search;
		String quest;
		String[] search_values;
	
		while(true) {
			search = null;
			System.out.print("검색하실 상품의 이름이나 코드를 입력하세요 : \n전부 조회하려면 ALL을 입력하십시오.");		
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
			// 입력한 값이 해쉬맵 안의 키값이 존재할 때
			if(itemList.containsKey(search)) {
				search_values = itemList.get(search);
				System.out.println(search_values[0]);
			} else {
				System.out.println("잘못 입력하셨습니다.");
			}
			
			System.out.println("상품 조회를 계속하시겠습니까?");
			quest = scan.next();
			
			if(quest.equals("Y") || quest.equals("y")) {
				System.out.println("상품 조회를 계속합니다");
			}else if(quest.equals("n") || quest.equals("N")) {
				System.out.println("상품 조회를 종료합니다.\n초기 메뉴로 돌아갑니다.");
				break;
			}else {
				System.out.println("잘못입력하셨습니다.\n초기 메뉴로 돌아갑니다.");
				break;
			}
		}
	}
	
	//==========물품 총 금액 메소드 (진행중)==========
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
		
		System.out.println("상품재고의 총 금액 : "+total);
		}
	}
}
