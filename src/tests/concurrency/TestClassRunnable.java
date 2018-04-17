package tests.concurrency;

public class TestClassRunnable implements Runnable{
	
	volatile int x;
	@Override
	public void run() {
		x = 5;
		
	}
	
	public static void main(String[] args) {
		TestClassRunnable tc = new TestClassRunnable();
		tc.x = 10;
		new Thread(tc).start();
		System.out.println(tc.x);
	}

}
