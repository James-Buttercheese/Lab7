import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class DateTest {
	
	//Format: dd/mm/yyyy
	
	
	@Test
	public void testNonAlphaAndSymbols() {
		
		String date = "10/De/1971";
		
		Assertions.assertFalse(Lab7Regex.validateDate(date));
		
	}
	
	@Test
	public void testContainsForwardSlash() {
		
		String date = "31/12/1901";
		
		Assertions.assertTrue(Lab7Regex.validateDate(date));
		
	}
	
	@Test
	public void testDays() {
		
		String date = "1/11/3008";
		
		Assertions.assertFalse(Lab7Regex.validateDate(date));
		
	}
	
	@Test
	public void testMonths() {
		
		String date = "02/101/1745";
		
		Assertions.assertFalse(Lab7Regex.validateDate(date));
		
	}
	
	@Test
	public void testYears() {
		
		String date = "09/01/100";
		
		Assertions.assertFalse(Lab7Regex.validateDate(date));
		
	}

}
