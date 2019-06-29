import java.util.ArrayList;
import java.util.List;

public class ProducerConsumerDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		List<Integer> sharedList = new ArrayList<Integer>();
		
		Thread thread1 = new Thread(new Producer(sharedList));
		Thread thread2 = new Thread(new Consumer(sharedList));
		
		thread1.start();
		thread2.start();
	}

}


class Producer implements Runnable{
	 
	List<Integer> sharedList = null;
	final int MAX_SIZE = 5;
	private int i = 0;
	
	public Producer(List<Integer> sharedList) {
	
		this.sharedList = sharedList;
	}

	@Override
	public void run() {
		// TODO Auto-generated method stub
		while(true){
			try {
				produce(i++);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}
	
	public void produce(int i) throws InterruptedException{
		
		synchronized (sharedList) {
			while(sharedList.size()==MAX_SIZE){
				System.out.println("Shared list is full waiting for the consumer to consume");
				sharedList.wait();
			}
		}
		
		synchronized (sharedList) {
			System.out.println("Producer produced element");
			sharedList.add(i);
			Thread.sleep(1000);
			sharedList.notify();
		}
	}
}




class Consumer implements Runnable{
	 
	List<Integer> sharedList = null;
	
	
	public Consumer(List<Integer> sharedList) {
	
		this.sharedList = sharedList;
	}

	@Override
	public void run() {
		// TODO Auto-generated method stub
		while(true){
			try {
				consume();
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}
	
	public void consume() throws InterruptedException{
		
		synchronized (sharedList) {
			while(sharedList.isEmpty()){
				System.out.println("Shared list is empty.......waiting for the producer to produce the object");
				sharedList.wait();
			}
		}
		
		synchronized (sharedList) {
			Thread.sleep(1000);
			System.out.println("Consume the element"+sharedList.remove(0));
			sharedList.notify();
		}
	}
}