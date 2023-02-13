import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class ExampleIC {

	@Test
	void testMath() throws Exception {
		
		int answer = MyMath.add(2,2);
		
		assertEquals(4, answer, "Bad math");
	}
	
	@Test
	void testMathB() throws Exception {
		
		int answer = MyMath.add(3,3);
		
		assertEquals(6, answer, "Bad math");
	}
	
	@Test
	void testMathC() throws Exception {
		
		int answer = MyMath.add(1,1);
		
		assertEquals(2, answer, "Bad math");
	}

}
