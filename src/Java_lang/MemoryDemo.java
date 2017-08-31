package Java_lang;

public class MemoryDemo {

	public static void main(String[] args) {
		Runtime r = Runtime.getRuntime();
		long mem1, mem2;
		Integer someints[] = new Integer[1000];
		
		System.out.println("Всього памяті: " + r.totalMemory());
		mem1 = r.freeMemory();
		
		System.out.println("Вільно памяті першопочатково: " + mem1);
		r.gc();
		mem1 = r.freeMemory();
		System.out.println("Вільної памяті після очистки: " + mem1);
		
		for (int i = 0; i < 1000; i++)
			someints[i] = new Integer(i);
		mem2 = r.freeMemory();
		System.out.println("Вільної памяті після видалення: " + mem2);
		System.out.println("Використана память для видалення: " + (mem1 - mem2));
		
		for (int i = 0; i < 1000; i++) someints[i] = null;
		r.gc();
		
		mem2 = r.freeMemory();
		System.out.println("Вільна память після очистки відкинутих обєктів типу Integer: " + mem2);
	}

}
