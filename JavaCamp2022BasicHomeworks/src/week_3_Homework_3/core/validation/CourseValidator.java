package week_3_Homework_3.core.validation;

import java.util.ArrayList;
import java.util.List;

import week_3_Homework_3.entities.Course;
import week_3_Homework_3.fakeDatabase.FakeDatabase;

public class CourseValidator {

	private static List<String> errors = new ArrayList<>();
	private static boolean isValid;

	public static ValidationEntity validate(Course course) {
		// spaghetti problems require spaghetti solutions
		isValid = true;
		errors.clear();

		for (Course databaseCourse : FakeDatabase.courses) {
			if (course.getName() == databaseCourse.getName()) {
				isValid = false;
				errors.add("Given Course Name is Already Taken : " + course.getName());
			}
			if (course.getCategory() == databaseCourse.getCategory()) {
				isValid = false;
				errors.add("Given Course Category is Already Taken : " + course.getCategory());
			}
		}
		if (course.getPrice() < 0) {
			isValid = false;
			errors.add("Course Price can't be lower than 0");
		}
		return new ValidationEntity(isValid, errors);

	}

}
