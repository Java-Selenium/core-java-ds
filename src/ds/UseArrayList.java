package ds;

import java.util.ArrayList;

public class UseArrayList {

	public static void main(String[] args) {
		
		ArrayList<String> list = new ArrayList<String>();
		list.add("A");
		list.add("B");
		list.add("C");
		list.add("D");
		list.add("E");
		list.add("H");
		list.add("O");
		list.add("P");
		list.add("S");
		list.add("L");
		list.add("additional");
		

		for(String human:list){
		     System.out.println(human);
		}
		
		System.out.println(".............Second ArrayList values................");
		ArrayList<Integer> num = new ArrayList<Integer>();
		num.add(10);
		num.add(2);
		num.add(80);
		num.add(100);
		
		for(int value:num){
			System.out.println(value);
			}
		
		

	}

}
