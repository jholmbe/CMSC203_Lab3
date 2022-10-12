import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class GradeBookTester {
	private GradeBook array1;
	private GradeBook array2;
	
	@BeforeEach
	void setUp() throws Exception {
		
		array1 = new GradeBook(5);
		array2 = new GradeBook(5);
		
		array1.addScore(65.0);
		array1.addScore(93.0);
		array1.addScore(76.0);
		
		array2.addScore(87.0);
		array2.addScore(90.0);
		array2.addScore(79.0);
	}

	@AfterEach
	void tearDown() throws Exception {
		array1=array2=null;
	}

	@Test
	void testAddScore() {
		String expectedString1 = "65.0 93.0 76.0";
		String expectedString2 = "87.0 90.0 79.0";
		String realString1 = array1.toString();
		String realString2 = array2.toString();
		int size = 3;
		int realSize1 = array1.getScoreSize();
		int realSize2 = array2.getScoreSize();
		
		
		assertTrue(expectedString1.equals(realString1));
		assertTrue(expectedString2.equals(realString2));
		assertEquals(size, realSize1);
		assertEquals(size, realSize2);
	}

	@Test
	void testSum() {
		double expectedScore1 = 234.0;
		double expectedScore2 = 256.0;
		double realScore1 = array1.sum();
		double realScore2 = array2.sum();
		
		assertTrue(expectedScore1 == realScore1);
		assertTrue(expectedScore2 == realScore2);
	}

	@Test
	void testMinimum() {
		double expectedScore1 = 65.0;
		double expectedScore2 = 79.0;
		double realScore1 = array1.minimum();
		double realScore2 = array2.minimum();
		
		assertTrue(expectedScore1 == realScore1);
		assertTrue(expectedScore2 == realScore2);
	}

	@Test
	void testFinalScore() {
		double expectedScore1 = 169.0;
		double expectedScore2 = 177.0;
		double realScore1 = array1.finalScore();
		double realScore2 = array2.finalScore();
		
		assertTrue(expectedScore1 == realScore1);
		assertTrue(expectedScore2 == realScore2);
	}

}
