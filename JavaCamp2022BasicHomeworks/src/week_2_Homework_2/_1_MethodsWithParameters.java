package week_2_Homework_2;

public class _1_MethodsWithParameters {

	public static void main(String[] args) {

		add("item 23");
		delete(0);
		delete(6);
		update(1, "item 42");
		update(7, "item 424");
		System.out.println(addition(7, 9));

	}

	public static void add(String itemName) {
		System.out.println(itemName + " is added!");
	}

	public static void delete(int id) {
		String itemToDelete = findItem(id);
		if (itemToDelete != null) {
			System.out.println(itemToDelete + " is deleted!");
		} else {
			System.out.println("Error!!");
		}
	}

	// no update! thats not what we are doing in this exercise
	public static void update(int id, String newName) {
		String itemToUpdate = findItem(id);
		if (itemToUpdate != null) {
			System.out.println(itemToUpdate + " is updated! -> " + newName);
		} else {
			System.out.println("Error!!");
		}

	}

	public static String findItem(int id) {
		String[] items = { "Item_1", "Item_2", "Item_3" };

		if (id < items.length && id >= 0) {
			return items[id];
		} else {
			return null;
		}

	}

	public static int addition(int num1, int num2) {

		return num1 + num2;
	}
}
