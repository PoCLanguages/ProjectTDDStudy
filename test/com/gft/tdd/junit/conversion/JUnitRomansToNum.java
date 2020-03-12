package com.gft.tdd.junit.conversion;
import static org.junit.Assert.*;

import org.junit.Test;

import com.gft.tdd.conversion.ConversionRomans;

public class JUnitRomansToNum {
	
	ConversionRomans conversion = new ConversionRomans();
	
	@Test
	public void romanToNum1() {
		assertEquals(1, conversion.convertNumberToRoman("I"));
	}

	@Test
	public void romanToNum2() {
		assertEquals(2, conversion.convertNumberToRoman("II"));
	}
	
	@Test
	public void romanToNum3() {
		assertEquals(3, conversion.convertNumberToRoman("III"));
	}
	@Test
	public void romanToNum4() {
		assertEquals(4, conversion.convertNumberToRoman("IV"));
	}
	@Test
	public void romanToNum5() {
		assertEquals(5, conversion.convertNumberToRoman("V"));
	}
	@Test
	public void romanToNum6() {
		assertEquals(6, conversion.convertNumberToRoman("VI"));
	}
	@Test
	public void romanToNum7() {
		assertEquals(7, conversion.convertNumberToRoman("VII"));
	}
	@Test
	public void romanToNum8() {
		assertEquals(8, conversion.convertNumberToRoman("VIII"));
	}
	@Test
	public void romanToNum9() {
		assertEquals(9, conversion.convertNumberToRoman("IX"));
	}
	@Test
	public void romanToNum10() {
		assertEquals(10, conversion.convertNumberToRoman("X"));
	}
	
	@Test
	public void romanToNum11() {
		assertEquals(11, conversion.convertNumberToRoman("XI"));
	}

	@Test
	public void romanToNum12() {
		assertEquals(12, conversion.convertNumberToRoman("XII"));
	}
	
	@Test
	public void romanToNum13() {
		assertEquals(13, conversion.convertNumberToRoman("XIII"));
	}
	
	@Test
	public void romanToNum14() {
		assertEquals(14, conversion.convertNumberToRoman("XIV"));
	}
	@Test
	public void romanToNum15() {
		assertEquals(15, conversion.convertNumberToRoman("XV"));
	}
	@Test
	public void romanToNum16() {
		assertEquals(16, conversion.convertNumberToRoman("XVI"));
	}
	@Test
	public void romanToNum17() {
		assertEquals(17, conversion.convertNumberToRoman("XVII"));
	}
	@Test
	public void romanToNum18() {
		assertEquals(18, conversion.convertNumberToRoman("XVIII"));
	}
	@Test
	public void romanToNum19() {
		assertEquals(19, conversion.convertNumberToRoman("XIX"));
	}
	@Test
	public void romanToNum20() {
		assertEquals(20, conversion.convertNumberToRoman("XX"));
	}
	
	
	@Test
	public void romanToNum21() {
		assertEquals(21, conversion.convertNumberToRoman("XXI"));
	}

	@Test
	public void romanToNum22() {
		assertEquals(22, conversion.convertNumberToRoman("XXII"));
	}
	
	@Test
	public void romanToNum23() {
		assertEquals(23, conversion.convertNumberToRoman("XXIII"));
	}
	
	@Test
	public void romanToNum24() {
		assertEquals(24, conversion.convertNumberToRoman("XXIV"));
	}
	@Test
	public void romanToNum25() {
		assertEquals(25, conversion.convertNumberToRoman("XXV"));
	}
	@Test
	public void romanToNum26() {
		assertEquals(26, conversion.convertNumberToRoman("XXVI"));
	}
	@Test
	public void romanToNum27() {
		assertEquals(27, conversion.convertNumberToRoman("XXVII"));
	}
	@Test
	public void romanToNum28() {
		assertEquals(28, conversion.convertNumberToRoman("XXVIII"));
	}
	@Test
	public void romanToNum29() {
		assertEquals(29, conversion.convertNumberToRoman("XXIX"));
	}
	@Test
	public void romanToNum30() {
		assertEquals(30, conversion.convertNumberToRoman("XXX"));
	}
	
	@Test
	public void romanToNum31() {
		assertEquals(31, conversion.convertNumberToRoman("XXXI"));
	}

	@Test
	public void romanToNum32() {
		assertEquals(32, conversion.convertNumberToRoman("XXXII"));
	}
	@Test
	public void romanToNum33() {
		assertEquals(33, conversion.convertNumberToRoman("XXXIII"));
	}
	@Test
	public void romanToNum34() {
		assertEquals(34, conversion.convertNumberToRoman("XXXIV"));
	}
	@Test
	public void romanToNum35() {
		assertEquals(35, conversion.convertNumberToRoman("XXXV"));
	}
	@Test
	public void romanToNum36() {
		assertEquals(36, conversion.convertNumberToRoman("XXXVI"));
	}
	@Test
	public void romanToNum37() {
		assertEquals(37, conversion.convertNumberToRoman("XXXVII"));
	}
	@Test
	public void romanToNum38() {
		assertEquals(38, conversion.convertNumberToRoman("XXXVIII"));
	}
	@Test
	public void romanToNum39() {
		assertEquals(39, conversion.convertNumberToRoman("XXXIX"));
	}
	@Test
	public void romanToNum40() {
		assertEquals(40, conversion.convertNumberToRoman("XL"));
	}
	
	@Test
	public void romanToNum50() {
		assertEquals(50, conversion.convertNumberToRoman("L"));
	}

	@Test
	public void romanToNum60() {
		assertEquals(60, conversion.convertNumberToRoman("LX"));
	}
	
	@Test
	public void romanToNum70() {
		assertEquals(70, conversion.convertNumberToRoman("LXX"));
	}
	
	@Test
	public void romanToNum80() {
		assertEquals(80, conversion.convertNumberToRoman("LXXX"));
	}
	
	@Test
	public void romanToNum90() {
		assertEquals(90, conversion.convertNumberToRoman("XC"));
	}
	
	@Test
	public void romanToNum100() {
		assertEquals(100, conversion.convertNumberToRoman("C"));
	}
	
	@Test
	public void romanToNum110() {
		assertEquals(110, conversion.convertNumberToRoman("CX"));
	}
	
	@Test
	public void romanToNum120() {
		assertEquals(120, conversion.convertNumberToRoman("CXX"));
	}
	
	@Test
	public void romanToNum130() {
		assertEquals(130, conversion.convertNumberToRoman("CXXX"));
	}
	
	@Test
	public void romanToNum140() {
		assertEquals(140, conversion.convertNumberToRoman("CXL"));
	}
	
	@Test
	public void romanToNum150() {
		assertEquals(150, conversion.convertNumberToRoman("CL"));
	}
	
	@Test
	public void romanToNum160() {
		assertEquals(160, conversion.convertNumberToRoman("CLX"));
	}
	
	@Test
	public void romanToNum170() {
		assertEquals(170, conversion.convertNumberToRoman("CLXX"));
	}
	
	@Test
	public void romanToNum180() {
		assertEquals(180, conversion.convertNumberToRoman("CLXXX"));
	}
	
	@Test
	public void romanToNum190() {
		assertEquals(190, conversion.convertNumberToRoman("CXC"));
	}
	
	@Test
	public void romanToNum200() {
		assertEquals(200, conversion.convertNumberToRoman("CC"));
	}
	
	@Test
	public void romanToNum210() {
		assertEquals(210, conversion.convertNumberToRoman("CCX"));
	}
	
	@Test
	public void romanToNum220() {
		assertEquals(220, conversion.convertNumberToRoman("CCXX"));
	}
	
	@Test
	public void romanToNum230() {
		assertEquals(230, conversion.convertNumberToRoman("CCXXX"));
	}
	
	@Test
	public void romanToNum240() {
		assertEquals(240, conversion.convertNumberToRoman("CCXL"));
	}
	
	@Test
	public void romanToNum250() {
		assertEquals(250, conversion.convertNumberToRoman("CCL"));
	}
	
	@Test
	public void romanToNum260() {
		assertEquals(260, conversion.convertNumberToRoman("CCLX"));
	}
	
	@Test
	public void romanToNum270() {
		assertEquals(270, conversion.convertNumberToRoman("CCLXX"));
	}
	
	@Test
	public void romanToNum280() {
		assertEquals(280, conversion.convertNumberToRoman("CCLXXX"));
	}
	
	@Test
	public void romanToNum290() {
		assertEquals(290, conversion.convertNumberToRoman("CCXC"));
	}
	
	@Test
	public void romanToNum300() {
		assertEquals(300, conversion.convertNumberToRoman("CCC"));
	}
	
	@Test
	public void romanToNum310() {
		assertEquals(310, conversion.convertNumberToRoman("CCCX"));
	}
	
	@Test
	public void romanToNum320() {
		assertEquals(320, conversion.convertNumberToRoman("CCCXX"));
	}
	
	@Test
	public void romanToNum330() {
		assertEquals(330, conversion.convertNumberToRoman("CCCXXX"));
	}
	
	@Test
	public void romanToNum340() {
		assertEquals(340, conversion.convertNumberToRoman("CCCXL"));
	}
	
	@Test
	public void romanToNum350() {
		assertEquals(350, conversion.convertNumberToRoman("CCCL"));
	}
	
	@Test
	public void romanToNum360() {
		assertEquals(360, conversion.convertNumberToRoman("CCCLX"));
	}
	
	@Test
	public void romanToNum370() {
		assertEquals(370, conversion.convertNumberToRoman("CCCLXX"));
	}
	
	@Test
	public void romanToNum380() {
		assertEquals(380, conversion.convertNumberToRoman("CCCLXXX"));
	}
	
	@Test
	public void romanToNum390() {
		assertEquals(390, conversion.convertNumberToRoman("CCCXC"));
	}
	
	@Test
	public void romanToNum400() {
		assertEquals(400, conversion.convertNumberToRoman("CD"));
	}
	
//	@Test
//	public void romanToNum1() {
//		assertEquals(1, conversion.convertNumberToRoman("I"));
//	}
//	@Test
//	public void romanToNum1() {
//		assertEquals(1, conversion.convertNumberToRoman("I"));
//	}
//	@Test
//	public void romanToNum1() {
//		assertEquals(1, conversion.convertNumberToRoman("I"));
//	}
//	@Test
//	public void romanToNum1() {
//		assertEquals(1, conversion.convertNumberToRoman("I"));
//	}
//	
}
