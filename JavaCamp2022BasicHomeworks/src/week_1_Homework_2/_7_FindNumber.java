package week_1_Homework_2;

public class _7_FindNumber {

	public static void main(String[] args) {
		int numbers[] = { 1, 2, 5, 7, 9, 0 };
		int numberToTest = 5;
		boolean isFound = false;

		for (int number : numbers) {
			if (numberToTest == number) {
				isFound = true;
			}
		}
		if (isFound) {
			System.out.println("Number Found : " + numberToTest);
		}else {
			System.out.println("Number not Found : " + numberToTest);
		}
		

	}

}
