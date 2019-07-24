
public class StringDifference {

	public static void main(String[] args) {
		String str1 = "BC";
		String str2 = "BANGALORE";
		
		char[] str1Arr = str1.toCharArray();
		char[] str2Arr = str2.toCharArray();
		
		String op1 = "";
		String op2 = "";
		
		for(int i=0;i<str1Arr.length;i++){
			String temp = str1Arr[i]+"";
			if(!(str2.contains(temp))){
				op1=op1+temp;
			}
		}
		
		for(int i=0;i<str2Arr.length;i++){
			String temp = str2Arr[i]+"";
			if(!(str1.contains(temp))){
				op2=op2+temp;
			}
		}
		
		System.out.println(op1);
		System.out.println(op2);
		
	}
}
