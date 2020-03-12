package com.gft.tdd.junit.conversion;
import static org.junit.Assert.assertEquals;

import org.junit.Test;

import com.gft.tdd.conversion.ConversionNumbers;

public class JUnitNumToRomans {

	ConversionNumbers conversion = new ConversionNumbers();
	
	@Test
	public void numToRoman1() {
		assertEquals(conversion.convertNumberToRoman(1), "I");
	}
	
	@Test
	public void numToRoman2() {
		assertEquals(conversion.convertNumberToRoman(2), "II");
	}
	
	@Test
	public void numToRoman3() {
		assertEquals(conversion.convertNumberToRoman(3), "III");
	}
	
	@Test
	public void numToRoman4() {
		assertEquals(conversion.convertNumberToRoman(4), "IV");
	}
	
	@Test
	public void numToRoman5() {
		assertEquals(conversion.convertNumberToRoman(5), "V");
	}
	
	@Test
	public void numToRoman6() {
		assertEquals(conversion.convertNumberToRoman(6), "VI");
	}
	
	@Test
	public void numToRoman7() {
		assertEquals(conversion.convertNumberToRoman(7), "VII");
	}
	
	@Test
	public void numToRoman8() {
		assertEquals(conversion.convertNumberToRoman(8), "VIII");
	}
	
	@Test
	public void numToRoman9() {
		assertEquals(conversion.convertNumberToRoman(9), "IX");
	}
	
	@Test
	public void numToRoman10() {
		assertEquals(conversion.convertNumberToRoman(10), "X");
	}
	
	@Test
	public void numToRoman11() {
		assertEquals(conversion.convertNumberToRoman(11), "XI");
	}
	
	@Test
	public void numToRoman12() {
		assertEquals(conversion.convertNumberToRoman(12), "XII");
	}
	
	@Test
	public void numToRoman13() {
		assertEquals(conversion.convertNumberToRoman(13), "XIII");
	}
	
	@Test
	public void numToRoman14() {
		assertEquals(conversion.convertNumberToRoman(14), "XIV");
	}
	
	@Test
	public void numToRoman15() {
		assertEquals(conversion.convertNumberToRoman(15), "XV");
	}
	
	@Test
	public void numToRoman16() {
		assertEquals(conversion.convertNumberToRoman(16), "XVI");
	}
	
	@Test
	public void numToRoman17() {
		assertEquals(conversion.convertNumberToRoman(17), "XVII");
	}
	
	@Test
	public void numToRoman18() {
		assertEquals(conversion.convertNumberToRoman(18), "XVIII");
	}
	
	@Test
	public void numToRoman19() {
		assertEquals(conversion.convertNumberToRoman(19), "XIX");
	}
	
	@Test
	public void numToRoman20() {
		assertEquals(conversion.convertNumberToRoman(20), "XX");
	}
	
	@Test
	public void numToRoman21() {
		assertEquals(conversion.convertNumberToRoman(21), "XXI");
	}
	
	@Test
	public void numToRoman22() {
		assertEquals(conversion.convertNumberToRoman(22), "XXII");
	}
	
	@Test
	public void numToRoman23() {
		assertEquals(conversion.convertNumberToRoman(23), "XXIII");
	}
	
	@Test
	public void numToRoman24() {
		assertEquals(conversion.convertNumberToRoman(24), "XXIV");
	}
	
	@Test
	public void numToRoman25() {
		assertEquals(conversion.convertNumberToRoman(25), "XXV");
	}
	
	@Test
	public void numToRoman26() {
		assertEquals(conversion.convertNumberToRoman(26), "XXVI");
	}
	
	@Test
	public void numToRoman27() {
		assertEquals(conversion.convertNumberToRoman(27), "XXVII");
	}
	
	@Test
	public void numToRoman28() {
		assertEquals(conversion.convertNumberToRoman(28), "XXVIII");
	}
	
	@Test
	public void numToRoman29() {
		assertEquals(conversion.convertNumberToRoman(29), "XXIX");
	}
	
	@Test
	public void numToRoman30() {
		assertEquals(conversion.convertNumberToRoman(30), "XXX");
	}
	
	@Test
	public void numToRoman31() {
		assertEquals(conversion.convertNumberToRoman(31), "XXXI");
	}
	
	@Test
	public void numToRoman32() {
		assertEquals(conversion.convertNumberToRoman(32), "XXXII");
	}
	
	@Test
	public void numToRoman33() {
		assertEquals(conversion.convertNumberToRoman(33), "XXXIII");
	}
	
	@Test
	public void numToRoman34() {
		assertEquals(conversion.convertNumberToRoman(34), "XXXIV");
	}
	
	@Test
	public void numToRoman35() {
		assertEquals(conversion.convertNumberToRoman(35), "XXXV");
	}
	
	@Test
	public void numToRoman36() {
		assertEquals(conversion.convertNumberToRoman(36), "XXXVI");
	}

	@Test
	public void numToRoman37() {
		assertEquals(conversion.convertNumberToRoman(37), "XXXVII");
	}
	
	@Test
	public void numToRoman38() {
		assertEquals(conversion.convertNumberToRoman(38), "XXXVIII");
	}
	
	@Test
	public void numToRoman39() {
		assertEquals(conversion.convertNumberToRoman(39), "XXXIX");
	}
	@Test
	public void numToRoman40() {
		assertEquals(conversion.convertNumberToRoman(40), "XL");
	}
	@Test
	public void numToRoman41() {
		assertEquals(conversion.convertNumberToRoman(41), "XLI");
	}

	
	@Test
	public void numToRoman50() {
		assertEquals(conversion.convertNumberToRoman(50), "L");
	}
	@Test
	public void numToRoman60() {
		assertEquals(conversion.convertNumberToRoman(60), "LX");
	}
	@Test
	public void numToRoman70() {
		assertEquals(conversion.convertNumberToRoman(70), "LXX");
	}
	@Test
	public void numToRoman80() {
		assertEquals(conversion.convertNumberToRoman(80), "LXXX");
	}
	
	@Test
	public void numToRoman90() {
		assertEquals(conversion.convertNumberToRoman(90), "XC");
	}
	
	@Test
	public void numToRoman100() {
		assertEquals(conversion.convertNumberToRoman(100), "C");
	}
	
	@Test
	public void numToRoman200() {
		assertEquals(conversion.convertNumberToRoman(200), "CC");
	}
	
	@Test
	public void numToRoman300() {
		assertEquals(conversion.convertNumberToRoman(300), "CCC");
	}
	
	@Test
	public void numToRoman400() {
		assertEquals(conversion.convertNumberToRoman(400), "CD");
	}
	
	@Test
	public void numToRoman500() {
		assertEquals(conversion.convertNumberToRoman(500), "D");
	}
	
	@Test
	public void numToRoman600() {
		assertEquals(conversion.convertNumberToRoman(600), "DC");
	}	
	
	@Test
	public void numToRoman700() {
		assertEquals(conversion.convertNumberToRoman(700), "DCC");
	}	
	
	@Test
	public void numToRoman800() {
		assertEquals(conversion.convertNumberToRoman(800), "DCCC");
	}	
	
	@Test
	public void numToRoman900() {
		assertEquals(conversion.convertNumberToRoman(900), "CM");
	}	
	
	@Test
	public void numToRoman1000() {
		assertEquals(conversion.convertNumberToRoman(1000), "M");
	}
	
	@Test
	public void numToRoman2000() {
		assertEquals(conversion.convertNumberToRoman(2000), "MM");
	}
	
	@Test
	public void numToRoman3000() {
		assertEquals(conversion.convertNumberToRoman(3000), "MMM");
	}
	
	@Test
	public void numToRoman4000() {
		assertEquals(conversion.convertNumberToRoman(4000), "IV");
	}
	
	@Test
	public void numToRoman5000() {
		assertEquals(conversion.convertNumberToRoman(5000), "V");
	}
	
	@Test
	public void numToRoman6000() {
		assertEquals(conversion.convertNumberToRoman(6000), "VM");
	}
	@Test
	public void numToRoman7000() {
		assertEquals(conversion.convertNumberToRoman(7000), "VMM");
	}
	@Test
	public void numToRoman8000() {
		assertEquals(conversion.convertNumberToRoman(8000), "VMMM");
	}
	@Test
	public void numToRoman9000() {
		assertEquals(conversion.convertNumberToRoman(9000), "IX");
	}
	@Test
	public void numToRoman10000() {
		assertEquals(conversion.convertNumberToRoman(10000), "X");
	}
	@Test
	public void numToRoman11000() {
		assertEquals(conversion.convertNumberToRoman(11000), "XM");
	}
}
