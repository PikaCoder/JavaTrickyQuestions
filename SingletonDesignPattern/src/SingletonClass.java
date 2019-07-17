 
public class SingletonClass {
	    private static SingletonClass myObj;
		private SingletonClass() {
			
		}
		// This will make this as a thread safe.
		synchronized public static SingletonClass getInstance(){
			if(myObj == null){
				myObj = new SingletonClass();
			}
			return myObj;
			
		}
		 
		 public static void main(String[] args) 
			
			{
				// TODO Auto-generated constructor stub
				SingletonClass obj = SingletonClass.getInstance();
				SingletonClass obj2 = SingletonClass.getInstance();
				
				System.out.println(obj);
				System.out.println(obj2);
			}
	
}


