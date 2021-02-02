package Multithreading;

class Counter{
	private int count;
	
	// encapsulation
	public int getCount() {
		return count;
	}
	// by using synchronized keyword this method can be only executed by one thread at a time. So this doesn't cause issues for synchronization. Try without that
	public synchronized void increment() {
		count++; // count = count+1
	}
	
	// Alternative to using Synchronized keyword
	// AtomicInteger count = new AtomicInteger();
	// public void increment() {
	//     count.incrementAndGet(); 
	//	}
}

public class Multithreading6 {

	public static void main(String[] args) throws Exception{
		
		Counter c = new Counter();
		Thread t1 = new Thread(() -> {
			for(int i=0;i<1000;i++) {
				c.increment();
			}
		});
		
		Thread t2 = new Thread(() -> {
			for(int i=0;i<1000;i++) {
				c.increment();
			}
		});
		
		t1.start();
		t2.start();
		
		//Wait till both threads complete execution
		t1.join();
		t2.join();
		
		System.out.println(c.getCount());
		
		
}

}


