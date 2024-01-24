package multithreading;

public class MyThread extends Thread{
	
	@Override
	public void run() {
		// TODO Auto-generated method stub
		while(true) {
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				// TODO: handle exception
				e.printStackTrace();
			}
			System.out.println("Currently executing thread "+getName());
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		MyThread t1 = new MyThread();
		t1.setName("raj");
		t1.start();
		
		MyThread t2 = new MyThread();
		t2.setName("Ajay");
		t2.start();

	}

}
