package com.TryGits;

import java.util.HashMap;
import java.util.Map;

public class SubstringwhithAtleastKDistinctCharacters {

	
	  public static long kDistinctCharacters(String s, int k) {
		  
	        Map<Character, Integer> map = new HashMap<>();
	      
	        int begin = 0, end = 0;
	        long ans = 0;
	        while (end < s.length()) {
	            char c = s.charAt(end);
	            map.put(c, map.getOrDefault(c, 0) + 1);
	            end++;

	            while (map.size() >= k) {
	            	
	                char pre = s.charAt(begin);
	                
	                if (map.containsKey(pre)) {
	                    map.put(pre, map.getOrDefault(pre, 0) - 1);
	                    if (map.get(pre) == 0) {
	                        map.remove(pre);
	                    }
	                }
	                System.out.println(s.length());
	                ans += s.length() - end + 1;
	                begin++;
	            }
	        }
	       
	        return ans;
	  }
	  
	  public static void main(String [] args) {
			String a = "aabc";
			int i =1;
			long prevans = -1;
			while(i < 27 ) {
				prevans = kDistinctCharacters(a, i);
				i++;System.out.println(prevans);
				break;
//				if(prevans == 0)break;
			}
			
	
	  }

}
