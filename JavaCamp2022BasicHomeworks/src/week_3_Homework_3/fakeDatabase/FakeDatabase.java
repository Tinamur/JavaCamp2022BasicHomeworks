package week_3_Homework_3.fakeDatabase;

import java.util.ArrayList;
import java.util.List;

import week_3_Homework_3.entities.Course;

public class FakeDatabase {
	// Lets add Fake Database
	public static List<Course> courses = new ArrayList<Course>() {
		{
			add(new Course(0, "Course0", "Category0", 25, "CourseImage0.jpg", 57, "Engin Demiroğ",
					"SekilbirResim.jpg"));
			add(new Course(0, "Course1", "Category1", 50, "CourseImage1.jpg", 63, "Engin Demiroğ",
					"SekilbirResim.jpg"));
			add(new Course(0, "Course2", "Category2", 75, "CourseImage2.jpg", 12, "Engin Demiroğ",
					"SekilbirResim.jpg"));
			add(new Course(0, "Course3", "Category3", 100, "CourseImage3.jpg", 78, "Engin Demiroğ",
					"SekilbirResim.jpg"));

		}
	};

}
