import java.util.Scanner;

public class FindHCFAndLCM {

	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Ist Number");
		int x = sc.nextInt();
		System.out.println("Enter 2nd Number");
		int y = sc.nextInt();
		
		int a = x;
		int b = y;
		int t;
		while(b!=0){
			t=b;
			b=a%b;
			a=t;
		}
		
		System.out.println("HCF is "+a);
		
		int lcm = (x*y)/a;
		
		System.out.println("LCM is "+lcm);
	}
}
