package edu.sinclair;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

public class AnagramEvaluatorImpl implements AnagramEvaluator {

	@Override
	public List<String> evaluate(String anagram, String option) {
		List<String> anagramsList = new ArrayList<>();
		if(option.equals("nf")) {
			Set<String> anagrams = new HashSet<>();
			permute(anagram, 0, anagram.length()-1, anagrams);
			anagramsList.addAll(anagrams);
		} else {
			AnagramDataReader anagramDataReader = new AnagramDataReaderImpl();
			Set<String> fileWords = anagramDataReader.readData();			
			for(String word : fileWords) {
				boolean isAnagram = isAnagram(anagram, word);
				if(isAnagram) {
					anagramsList.add(word);
				}
			}
		}
		Collections.sort(anagramsList, String.CASE_INSENSITIVE_ORDER);
		return anagramsList;
	}
	
	/**
	 * To generate all permutations for a string and add results to Provided Set.
	 */
	// https://www.geeksforgeeks.org/write-a-c-program-to-print-all-permutations-of-a-given-string/
	public void permute(String str, int l, int r, Set<String> anagrams) { 
        if (l == r) {
        	anagrams.add(str);
        } else { 
            for (int i = l; i <= r; i++) { 
                str = swap(str,l,i); 
                permute(str, l+1, r, anagrams); 
                str = swap(str,l,i); 
            } 
        } 
    } 
	
	/**
	 * Helper method for Permutation.
	 */
	// https://www.geeksforgeeks.org/write-a-c-program-to-print-all-permutations-of-a-given-string/
	private String swap(String a, int i, int j) { 
        char temp; 
        char[] charArray = a.toCharArray(); 
        temp = charArray[i] ; 
        charArray[i] = charArray[j]; 
        charArray[j] = temp; 
        return String.valueOf(charArray); 
    } 
	
	// Check if provided two words are anagrams.
	public boolean isAnagram(String original, String toCheck) {
		Map<Character, Integer> map = new HashMap<>();
		if(original != null && toCheck != null) {
			if(original.length() != toCheck.length()) {
				return false;
			}
			
			for(char c : original.toCharArray()) {
				Integer val = map.get(Character.toLowerCase(c));
				if(val == null) {
					map.put(Character.toLowerCase(c), 1);
				} else {
					map.put(Character.toLowerCase(c), val + 1);
				}
			}
			
			for(char c : toCheck.toCharArray()) {
				Integer val = map.get(Character.toLowerCase(c));
				if(val == null) {
					map.put(Character.toLowerCase(c), 1);
				} else {
					map.put(Character.toLowerCase(c), val - 1);
				}
			}
			
			for(Character key : map.keySet()) {		
				Integer value = map.get(key);
				if(value != 0) {
					return false;
				}
			}
			return true;
		} else {
			return false;
		}
	}
	
}
