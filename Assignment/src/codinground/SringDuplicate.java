package codinground;

import java.util.HashSet;
import java.util.Set;

public class SringDuplicate {

	public static void main(String[] args) {
		String str="JAVA";
		System.out.println(removeDuplicate(str));

	}
	
	public static String removeDuplicate(String str) 
	{
		Set<Character> set=new HashSet<>();
		StringBuffer sf=new StringBuffer();
		
		for(int i=0;i<str.length();i++) {
			char c=str.charAt(i);
			//if(!str.contains()) {
				set.add(c);
				sf.append(c);
			}
		//}
		return sf.toString();
	}

}
