package _01_Lambda_Methods;

public class LambdaMethods {
	public static void main(String[] args) {
		// 1. Look at the SpecialPrinter function interface.
	
		// Here is an example of calling the printCustomMessage method with a lambda.
		// This prints the passed in String 10 times.
		printCustomMessage((s)->{
			for(int i = 0; i < 10; i++) {
				System.out.println(s);
			}
		}, "repeat");
		
		//2. Call the printCustonMessage method using a lambda so that the String prints backwards.
		printCustomMessage((s)->{
			String rev = "";
			for(int i = s.length()-1; i >= 0; i--) {
				rev += s.charAt(i);
			}
			System.out.println(rev);
		}, "backwards");
		//3. Call the printCustonMessage method using a lambda so that the String prints with a mix between upper an lower case characters.
		printCustomMessage((s)->{
			String distort = "";
			for (int i = 0; i < s.length(); i++) {
				if (s.charAt(i) % 2 == 0) {
					distort += s.substring(i, i+1).toUpperCase();
					
				}
				else {
					distort += s.substring(i, i+1).toLowerCase();
				}
			}
			System.out.println(distort);
		}, "distorted");
		//4. Call the printCustonMessage method using a lambda so that the String prints with a period in between each character.
		printCustomMessage((s) ->{
			String periods = "";
			for (int i = 0; i < s.length(); i++) {
				periods += s.substring(i,i+1).concat(".");
			}
			System.out.println(periods);
		}, "HelloGuys");
		//5. Call the printCustonMessage method using a lambda so that the String prints without any vowels.
		printCustomMessage((s) ->{
			String noVowels = "";
			
			for (int i = 0; i < s.length(); i++) {
				noVowels = s.replaceAll("a", ".");
				noVowels = s.replaceAll("e", ".");
				noVowels = s.replaceAll("i", ".");
				noVowels = s.replaceAll("o", ".");
				
				
			}
			System.out.println(noVowels);
		}, "Foxtrot");
	}
	
	public static void printCustomMessage(SpecialPrinter sp, String value) {
		sp.printSpecial(value);
	}
}
	
