package multithreading;

public class PriorityThread extends Thread {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		PriorityThread t1 = new PriorityThread();
		PriorityThread t2 = new PriorityThread();
		PriorityThread t3 = new PriorityThread();
		t1.setName("Thread1");
		t2.setName("Thread2");
		t3.setName("Thread3");
		
		t1.setPriority(MIN_PRIORITY);
		t2.setPriority(MAX_PRIORITY);
		t3.setPriority(NORM_PRIORITY);
		
		t1.start();
		t2.start();
		t3.start();
		
	}
	@Override
	public void run() {
		// TODO Auto-generated method stub
		System.out.println("Thread Name : "+getName()+" Thread Priority : "+getPriority());
	}

}
