package Java_lang_2;

public class TheadGroupDemo {

	public static void main(String[] args) {
		ThreadGroup groupA = new ThreadGroup("����� �");
		ThreadGroup groupB = new ThreadGroup("����� B");
		
		NewThread ob1 = new NewThread("����", groupA);
		NewThread ob2 = new NewThread("���", groupA);
		NewThread ob3 = new NewThread("���", groupB);
		NewThread ob4 = new NewThread("������", groupB);
		
		System.out.println("\n���� �� ������ list():");
		groupA.list();
		groupB.list();
		System.out.println();
		
		System.out.println("������������ ����� �");
		Thread tga[] = new Thread [groupA.activeCount()];
		groupA.enumerate(tga);
		
		for (int i = 0; i < tga.length; i++) {
			((NewThread) tga[i]).mysuspend();
		}
			try {
				Thread.sleep(4000);
			} catch (Exception e) {
				System.out.println("�������� ���� ��������� ���������.");
			}
			
			System.out.println("³��������� ����� �.");
			
			for (int i = 0; i < tga.length; i++) {
				((NewThread) tga[i]).myresume();
			
		
	} try {
		System.out.println("���������� ���������� ������ ���������.");
		ob1.join();
		ob2.join();
		ob3.join();
		ob4.join();

	} catch (Exception e) {
		System.out.println("������� � ��������� ������ ���������.");
	}
		System.out.println("�������� ���� ��������� ���������.");
			
	}
}
