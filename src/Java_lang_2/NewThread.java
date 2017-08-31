package Java_lang_2;

public class NewThread extends Thread {
	boolean suspendFlag;

	public NewThread(String threadname, ThreadGroup tgOb) {
		super(tgOb, threadname);
		System.out.println("Новий потік: " + this);
		suspendFlag = false;
		start();
	}

	public void run() {
		try {
			for (int i = 0; i < 5; i++) {
				System.out.println(getName() + ": " + i);
				Thread.sleep(1000);
				synchronized (this) {
					while (suspendFlag) {
						wait();
					}
				}
			}
		} catch (Exception e) {
			System.out.println("виключення в " + getName());
		}
		System.out.println(getName() + " завершується.");
	}

	synchronized void mysuspend() {
		suspendFlag = true;
	}

	synchronized void myresume() {
		suspendFlag = false;
		notify();
	}

}
