package week_1_Homework_2;

public class _5_PerfectNumbers {

	public static void main(String[] args) {
		int givenNumber = 8128;
		int total = 0;

		if (givenNumber <= 0) {
			System.out.println("Please Write a Positive Number !!!");
			return;
		} else {
			for (int i = 1; i <= givenNumber / 2; i++) {
				if (givenNumber % i == 0) {
					total += i;
				}
			}
			if (total == givenNumber) {
				System.out.println(givenNumber + " is a perfect number!");
			} else {
				System.out.println(givenNumber + " is not a perfect number!");
			}

		}
	}

}
