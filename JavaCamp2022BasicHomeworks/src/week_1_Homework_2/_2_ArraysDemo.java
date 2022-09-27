package week_1_Homework_2;

public class _2_ArraysDemo {

	public static void main(String[] args) {
		double[] testNumbers = { 1.2, 1.3, 51.1, 5.7, 8.1, 3.3 };
		double total = 0;
		double largestNumber = testNumbers[0];

		for (double number : testNumbers) {
			if (largestNumber < number) {
				largestNumber = number;
			}
			total += number;
			System.out.println(number);
		}
		System.out.println("---------------------");
		System.out.println("Total = " + total);
		System.out.println("---------------------");
		System.out.println("Largest Number = " + largestNumber);
	}

}
