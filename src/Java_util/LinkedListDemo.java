package Java_util;

import java.util.LinkedList;

public class LinkedListDemo {

	public static void main(String[] args) {
		LinkedList<String> ll = new LinkedList<String>();
		ll.add("F");
		ll.add("B");
		ll.add("D");
		ll.add("E");
		ll.add("C");
		ll.addLast("Z");
		ll.addFirst("A");
		
		ll.add(1, "A2");
		System.out.println("Початковий вміст списку ll: " + ll);
		
		ll.remove("F");
		ll.remove(2);
		System.out.println("Вміст звязаного списку al після видалення елементів: " + ll);
		
		ll.removeFirst();
		ll.removeLast();
		
		System.out.println("Вміст звязаного списку ll після видалення першого і останнього елементів: " + ll);
		
		String val = ll.get(2);
		ll.set(2, val + " змінено");
		System.out.println("Вміст звязаного списку ll після змін: " + ll);

	}

}
