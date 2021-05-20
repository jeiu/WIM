package wim;

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		ItemMap itemmap = new ItemMap();
		
		itemmap.putItemList();
		
		itemmap.findItem();
		
	
	}
}
