import java.util.Scanner;

public class Find3NoLcm {
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the Ist Number");
		int x = sc.nextInt();
		System.out.println("Enter the 2nd Number");
		int y = sc.nextInt();
		System.out.println("Enter the 3rd Number");
		int z = sc.nextInt();
		int hcf=0;
		for(int i=1;i<=x||i<=y||i<=z;i++){
			if((x%i==0) && (y%i==0) && (z%i==0)){
				hcf=i;
			}
		}
		System.out.println(hcf);
		
	}
}
