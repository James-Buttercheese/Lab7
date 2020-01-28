import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class HTMLTest {
	
	//Format: dd/mm/yyyy
	
	
	@Test
	public void testNonAlphaAndSymbols() {
		
		String html = "<p>magic</p>";
		
		Assertions.assertTrue(Lab7Regex.validateHTML(html));
		
	}
	
	@Test
	public void testInnerPointers() {
		
		String html = "<pmagic/p>";
		
		Assertions.assertFalse(Lab7Regex.validateHTML(html));
		
	}
	
	@Test
	public void testOuterPointers() {
		
		String html = "p>magic</p";
		
		Assertions.assertFalse(Lab7Regex.validateHTML(html));
		
	}
	
	@Test
	public void testForwardSlash() {
		
		String html = "<p>magic<p>";
		
		Assertions.assertFalse(Lab7Regex.validateHTML(html));
		
	}
	
	@Test
	public void testNoSymbolsInPointers() {
		
		String html = "<@>magic</@>";
		
		Assertions.assertFalse(Lab7Regex.validateHTML(html));
		
	}
	
	@Test
	public void testCapsSpacesAndSymbols() {
		
		String html = "<b>Magic Toaster Strudel!!</b>";
		
		Assertions.assertTrue(Lab7Regex.validateHTML(html));
		
	}
	
	

}
