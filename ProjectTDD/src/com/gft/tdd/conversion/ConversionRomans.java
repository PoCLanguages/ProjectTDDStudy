package com.gft.tdd.conversion;

import java.util.Dictionary;
import java.util.HashMap;
import java.util.Hashtable;

public class ConversionRomans {
	
	Dictionary<Character, Integer> romanValues;
	
	
	public ConversionRomans() {
		
		romanValues = new Hashtable<Character, Integer>();
		romanValues.put('I', 1);
		romanValues.put('V', 5);
		romanValues.put('X', 10);
		romanValues.put('L', 50);
		romanValues.put('C', 100);
		romanValues.put('D', 500);
		romanValues.put('M', 1000);
	}
	
	public int convertNumberToRoman(String roman) {
		int value = 0, total = 0, previous = -1;
		
		for (int i = roman.length()-1; i>=0; i--) {
			value = romanValues.get(roman.charAt(i));
			
			total += (previous > value) ? (-1)*value : value;

			previous = value;
		}
		
		return total;
	}
	
	
	
	
}
