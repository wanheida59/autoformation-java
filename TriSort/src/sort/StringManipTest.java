package sort;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class StringManipTest {

	@Test
	void testConcatNominal() {
		//Given When Then
		
		//Given
		String param1="Toto";
		String param2="Tata";
		String expected="Toto,Tata";
		
		//When
		String result=StringManip.concat(param1,param2);
		
		//Then
		assertEquals(expected,result);	
	}

	@Test
	void testConcatWithOnNullParam1() {
		//Given When Then
		
		//Given
		String param1=null;
		String param2="Tata";
		String expected="Tata";
		
		//When
		String result=StringManip.concat(param1,param2);
		
		//Then
		assertEquals(expected,result);	
	}
	
	@Test
	void testConcatWithOnNullParam2() {
		//Given When Then
		
		//Given
		String param1="Tata";
		String param2=null;
		String expected="Tata";
		
		//When
		String result=StringManip.concat(param1,param2);
		
		//Then
		assertEquals(expected,result);	
	}
	
}
