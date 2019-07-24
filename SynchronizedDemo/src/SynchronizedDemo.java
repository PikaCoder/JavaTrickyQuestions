class Display{
	public  void wish(String name){
		for(int i =0;i<10;i++){
			System.out.println("Good Morning"+name);
			try {
				Thread.sleep(2000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		
		
	}
}


class MyThread extends Thread{
	
	Display d;
	String name;
	
	public MyThread(Display d,String name) {
		// TODO Auto-generated constructor stub
		
		this.d = d;
		this.name = name;
	}
	
	@Override
	public void run() {
		// TODO Auto-generated method stub
		d.wish(name);
	}
}

public class SynchronizedDemo {

	public static void main(String[] args) {
		Display d = new Display();
		MyThread t1 = new MyThread(d, "Dhoni");
		MyThread t2 = new MyThread(d, "Yuvraj");
		t1.start();
		t2.start();
	}
}
