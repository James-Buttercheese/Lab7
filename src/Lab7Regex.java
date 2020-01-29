import java.util.Scanner;

/*
 * 
 * Lab 7 Starter Project
 * 
 * 
 */

public class Lab7Regex {

	public static void main(String[] args) {

		Scanner scnr = new Scanner(System.in);

		System.out.print("Please enter a valid Name: ");
		String name = scnr.nextLine();
		validateName(name);

		System.out.print("Please enter a valid E-Mail: ");
		String email = scnr.nextLine();
		validateEmail(email);

		System.out.print("Please enter a valid phone number: ");
		String phoneNumber = scnr.nextLine();
		validatePhone(phoneNumber);

		System.out.print("Please enter a valid date: ");
		String date = scnr.nextLine();
		validateDate(date);

		System.out.print("Please enter a valid html code: ");
		String html = scnr.nextLine();
		validateHTML(html);

		scnr.close();

	}

	public static boolean validateName(String name) {

		// change this to pass ALL tests
		String regex = "[A-Z][a-zA-Z]{0,29}";

		if (name.matches(regex)) {
			System.out.println("Name is valid!");
			return true;
		} else {
			System.out.println("Sorry, name is not valid!");
			return false;
		}
	}

	public static boolean validateEmail(String email) {

		// change this to pass ALL tests
		String regex = "[\\w^_]{5,30}@[\\w^_]{3,10}\\.[\\w^_]{2,3}";

		if (email.matches(regex)) {
			System.out.println("Email is valid!");
			return true;
		} else {
			System.out.println("Sorry, email is not valid!");
			return false;
		}
	}

	public static boolean validatePhone(String phone) {

		// change this to pass ALL tests
		String regex = "\\d{3}-\\d{3}-\\d{4}";

		if (phone.matches(regex)) {
			System.out.println("Phone number is valid!");
			return true;
		} else {
			System.out.println("Sorry, phone is not valid!");
			return false;
		}
	}

	public static boolean validateDate(String date) {

		// change this to pass ALL tests
		String regex = "(0[1-9]|[10-31]{2})/(0[1-9]|[10-12]{2})/\\d{4}";

		if (date.matches(regex)) {
			System.out.println("Date is valid!");
			return true;
		} else {
			System.out.println("Sorry, date is not valid!");
			return false;
		}
	}

	public static boolean validateHTML(String html) {

		// change this to pass ALL tests
		String regex = "[<][\\w]*\\>.*\\</[\\w]*[>]";

		if (html.matches(regex)) {
			if (isSame(html)) {
				System.out.println("HTML is valid!");
				return true;
			} else {
				System.out.println("Sorry, HTML is not valid!");
				return false;
			}
		} else {
			System.out.println("Sorry, HTML is not valid!");
			return false;
		}

	}

	public static boolean isSame(String html) {
		boolean isSame = false;

		int subsStart1 = html.indexOf("<");
		int subsEnd1 = html.indexOf(">");
		int subsStart2 = html.indexOf("/");
		int subsEnd2 = html.indexOf(">", subsStart2);

		String subs1 = html.substring(subsStart1 + 1, subsEnd1);
		String subs2 = html.substring(subsStart2 + 1, subsEnd2);

		if (subs1.equals(subs2)) {
			isSame = true;
			return isSame;
		}

		return isSame;
	}

}
