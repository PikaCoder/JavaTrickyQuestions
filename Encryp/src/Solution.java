import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {
    public static void main(String args[] ) throws Exception {
    	Scanner sc = new Scanner(System.in);
    	String n = sc.nextLine();
    	int k = Integer.parseInt(n);
    	Map<String,String> map = new HashMap<>();
    	List<String> list = new ArrayList<>();
    	for(int i=0;i<k;i++){
    		String original = sc.nextLine();
    		list.add(original);
    		String finalStr = sc.nextLine();
    		map.put(original, finalStr);
    	}
    	
    	System.out.println("Enter your String");
    	String context = sc.nextLine();
    	
    	String res = encrypt(map,context,list);
    	System.out.println(res);
}
    
    static String encrypt(Map map, String context,List<String> list){
    	String temp = "";
    	for(int i=0;i<list.size();i++){
    		if(context.contains(list.get(i))){
    			String res=context.replace(list.get(i), (CharSequence) map.get(list.get(i)));
    			if(res.contains(list.get(i))){
    				encrypt(map, res, list);
        		}
    			
    			temp = res;
    		}
    		
    		
    	}
    	
    	
    	return temp;
    }
}