package linkedList;

import java.util.LinkedList;

public class Example3 {

	public static void main(String[] args) {

		LinkedList<String> linkedList = new LinkedList<>();

		linkedList.add("A");
		linkedList.add("B");
		linkedList.add("C");
		linkedList.add("D");

		LinkedList<String> linkedList1 = new LinkedList<>();

		linkedList1.add("AA");
		
		linkedList1.add("BB");
		linkedList1.add("CC");
		linkedList1.add(2,"AAA");
		linkedList1.add("DD");
		
		System.out.println(linkedList1);

		linkedList.addAll(linkedList1);

		System.out.println(linkedList);

		linkedList.addAll(1, linkedList1);

		//System.out.println(linkedList);
		
		//linkedList.add

	}
}
