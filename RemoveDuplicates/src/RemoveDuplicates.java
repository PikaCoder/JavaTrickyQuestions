import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;

public class RemoveDuplicates {

	public static void main(String[] args) {
		List<String> frndsList = new ArrayList<String>();
		frndsList.add("U1,U2");
		frndsList.add("U3,U4");
		frndsList.add("U2,U1");
		frndsList.add("U1,U5");
		
		Collections.sort(frndsList);
		
		Set<String> hSet = new LinkedHashSet<String>();
		for(int k=0;k<frndsList.size();k++){
			hSet.add(frndsList.get(k));
		}
		
		frndsList = new ArrayList<>(hSet);
		
		for(int i=0;i<frndsList.size();i++){
			String temp = frndsList.get(i);
			int index = temp.indexOf(",");
			String temp1 = temp.substring(0, index);
			String temp2 = temp.substring(index+1, temp.length());
			String newString = temp2+","+temp1;
			if(frndsList.contains(newString)){
				frndsList.remove(newString);
			}
		}
		
		
		
		System.out.println(frndsList);
		
		
	}
}
