package com.gft.tdd.conversion;


public class ConversionNumbers {
	public ConversionNumbers() {
		
	} 
	
	public String convertNumberToRoman(int number) {
		String result = "";
		char[] numberArrayChar = Integer.toString(number).toCharArray();
		
		for (int i = 0; i < numberArrayChar.length; i++) {
			char c = numberArrayChar[i];
			
			result += eachUnitNumber(numberArrayChar.length-i, Character.getNumericValue(c));
		}
		
		return result;
	}
	
	
	private String eachUnitNumber(int type, int number) {
		
		switch(type) {
			case 1:
				return sistemaNumerico(number, "I", "V", "X");
//				return unitRomans(number, "I", "V", "X");
			case 2:
			case 5:
				return sistemaNumerico(number, "X", "L", "C");
//				return dozensRomans(number, "X", "C", "L");
			case 3:
				return sistemaNumerico(number, "C", "D", "M");
				
			case 4:
				return sistemaNumericoMilhar(number, "M", "I", "V");
		}
		return "";
	}
	
	private String sistemaNumericoMilhar(int number, String a, String b, String c) {
		
		if(number == 4)
			return "IV";
		else if(number == 9)
			return "IX";
		
		if(number <= 3)
			return repeatElements("", 1, number, "M");
		else if(number <= 8)
			return repeatElements("V", 6, number, "M");
		
		return "";
	}
	
	private String sistemaNumerico(int number, String a, String b, String c) {
		
		if(number == 4)
			return a+b;
//			return "XL";
		else if(number == 9)
			return a+c;
//			return "XC";
		
		if(number <= 3)
			return repeatElements("", 1, number, a);
//			return repeatElements("", 1, number, "X");
		else if(number <= 8)
			return repeatElements(b, 6, number, a);
//			return repeatElements("L", 6, number, "X");
		
		return "";
	}

	
	public String repeatElements(String before, int begin, int end, String element) {
		String str = "";
		for (int i = begin; i <= end; i++) {
			str+= element;
		}
		return before + str;
	}
	
	
}
