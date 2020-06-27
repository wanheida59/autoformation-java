package sort;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class TriTest {

	@Test
	void testTriBasic() {
		
		//Given
		int[] input= {12,34,2,78,45,22,24,13,54,17};
		int[] expect= {2,12,13,17,22,24,45,54,78};
		
		//When
		int[] result=Tri.sort(input);
		
		//Then
		assertEquals(expect,result);
	}

}
