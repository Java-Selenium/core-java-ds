package ds;

import java.util.ArrayList;
import java.util.Iterator;

public class UseIterator {

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
		
		Iterator<String> it = list.iterator();
		
		while(it.hasNext()){
			System.out.println(it.next());
		}

	}

}
