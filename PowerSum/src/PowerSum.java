import java.util.Scanner;

public class PowerSum {

	public static void main(String args[] ) throws Exception {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT */
        Scanner sc = new Scanner(System.in);
        int l = sc.nextInt();
        int r = sc.nextInt();
        int count = 0;
        int out = 0;
        for(int j=l;j<=r;j++){
        	for(int i=2;i<4;i++){
           	 out=calc(30, i, 1);
           	 System.out.println(out);
           	if(out>0){
         		 count++;
         		 break;
         	 }
           	 }
        	
        }
        	System.out.println(count);
        }
	
	static int calc(int x, int n, int num) {
	    int numToN= (int) Math.pow(num,n);
	    if (numToN > x) {
	        return 0;
	    } else if (numToN == x) {
	        return 1;
	    } else {
	        return (calc(x,n,num+1) + calc(x-numToN,n,num+1));
	    }
	}


}
