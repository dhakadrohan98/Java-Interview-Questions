package com.leetcode.problems.interview;
import java.util.*;

public class LongestCommonPrefix {

	public static void main(String[] args) {
		String[] str = {"flower","flow","flight"};
		StringBuilder result = new StringBuilder();
		
		Arrays.sort(str);
		
		char[] first = str[0].toCharArray();
		char[] last = str[str.length-1].toCharArray();
		
		for(int i=0; i<first.length; i++) {
			
			if( first[i] != last[i]) {
				break;
			}
			
			result.append(first[i]);
		}
		System.out.println(result.toString());
	}

}
	
//	String temp = str[0];
//	Map<Character,Integer> hmap = new HashMap<>();
//	String result = "";
//	
//	for(int i=0; i<temp.length(); i++) {
//		hmap.put(temp.charAt(i),i);
//	}
//	System.out.println(hmap);
//	
//	for(int i=1; i<str.length; i++) {
//		String anth = str[i];
//		for(int j=1; j<anth.length(); j++) {
//			char chCurr = anth.charAt(j);
//			char chPrev = anth.charAt(j-1);
//			
//			if(hmap.containsKey(chCurr) && hmap.containsKey(chPrev)) {
//				result = result + chPrev + chCurr;
//			}
//		}
//	}
//	System.out.println(result);
//}
