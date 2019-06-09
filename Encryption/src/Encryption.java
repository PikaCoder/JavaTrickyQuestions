//https://www.hackerrank.com/challenges/encryption/problem
public class Encryption {

	public static void main(String[] args) {
		String s = "have a nice day";
		String trimS = s.replaceAll(" ", "");
		int strLength = s.length();
		int row = (int)Math.floor(Math.sqrt(strLength));
		int column = (int)Math.ceil(Math.sqrt(strLength));
		char[] strArr = trimS.toCharArray();
		char arr[][] = new char[row][column];
		int count=0;
		for(int i=0;i<row;i++){
			for(int j=0;j<column;j++){
				arr[i][j] = strArr[count];
				count++;
			}
		}
		
		System.out.println("Encrypted Line looks like");
		
		// Transpose Array
		
		String str = "";
		for(int i=0;i<column;i++){
			for(int j=0;j<row;j++){
					str=str+arr[j][i];
			}
		}
		
		
		System.out.println(str);
		
	}
}
