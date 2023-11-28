package sampleJavaProject;

import java.util.HashMap;
import java.util.Map;

public class SDETProgram9 {
	
	//Check the frequency of each character in string
	public static void getFrequencyChar(String str) {
		Map<Character, Integer> charMap = new HashMap<Character, Integer>();
		char[] chars = str.toCharArray();
		for(char c: chars) {
			if(charMap.containsKey(c)) {
				charMap.put(c, charMap.get(c)+1);
			}else {
				charMap.put(c, 1);
			}
			
		}
		
		System.out.println(str+": "+charMap);
	}
	public static void main(String[] args) {
		getFrequencyChar("jagadish");
	}

}
