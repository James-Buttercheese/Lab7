import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class EmailTests {

	@Test
	public void testContainsAtSymbol() {

		String email = "albert@aol.com";

		Assertions.assertTrue(Lab7Regex.validateEmail(email));

	}

	@Test
	public void testMinLength() {

		String email = "bel@aol.com";

		Assertions.assertFalse(Lab7Regex.validateEmail(email));

	}

	@Test
	public void testContainsPeriod() {

		String email = "cinderella@aol.com";

		Assertions.assertTrue(Lab7Regex.validateEmail(email));

	}

	@Test
	public void testAlphanumeric() {

		String email = "123deville@hotmail200.com";

		Assertions.assertTrue(Lab7Regex.validateEmail(email));

	}
	
	@Test
	public void testNoSpecialCharacters() {
		
		String email = "elmo!@yahoo?.com";
		
		Assertions.assertFalse(Lab7Regex.validateEmail(email));

	}
	
	@Test
	public void testMaxDomainLength() {
		
		String email = "frodo@grandcircus.com";
		
		Assertions.assertFalse(Lab7Regex.validateEmail(email));
		
	}
	
	@Test 
	public void testTopLevelDomainMin() {
		
		String email = "garfield@netscape.n";
		
		Assertions.assertFalse(Lab7Regex.validateEmail(email));
		
	}
	
	@Test 
	public void testTopLevelDomainMax() {
		
		String email = "garfield@netscape.netty";
		
		Assertions.assertFalse(Lab7Regex.validateEmail(email));
		
	}
	

}
