import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class NameTests {

	@Test
	public void testIfEmpty() {
		
		String name = "";
		
		Assertions.assertFalse(Lab7Regex.validateName(name));

	}
	
	@Test
	public void testIfNumber() {
		
		String name = "james123";
		
		Assertions.assertFalse(Lab7Regex.validateName(name));
		
	}
	
	@Test
	public void testIfPascalCase() {
		
		String name = "James";
		
		Assertions.assertTrue(Lab7Regex.validateName(name));
		
	}
	
	@Test 
	public void testMaxLength() {
		
		String name = "Abcdefghijklmnopqrstuvwxyzabcde";
		
		Assertions.assertFalse(Lab7Regex.validateName(name));
		
	}
	
	@Test 
	public void testSymbols() {
		
		String name = "james!";
		
		Assertions.assertFalse(Lab7Regex.validateName(name));
		
	}
	
	 
	
	

}
