package week_1_Homework_2;


public class _4_DemoAboutVowels {

	public static void main(String[] args) {
		char givenLetter = 'a';
		char[] backVowels = { 'a', 'ı', 'o', 'u', };
		char[] frontVowels = { 'e', 'i', 'ö', 'ü', };
		boolean isVowel = false;
		String VowelType = "";

		for (char c : backVowels) {
			if (c == Character.toLowerCase(givenLetter)) {
				isVowel = true;
				VowelType = "back";
			}
		}
		
		//I don't want to run this loop if vowel is found in other one
		if (!isVowel) {
			for (char c : frontVowels) {
				if (c == Character.toLowerCase(givenLetter)) {
					isVowel = true;
					VowelType = "front";
				}
			}
		}
		
		if (isVowel) {
			System.out.println(givenLetter + " is a " + VowelType + " vowel");
		}else {
			System.out.println(givenLetter + " is not a Vowel");
		}

	}

}
