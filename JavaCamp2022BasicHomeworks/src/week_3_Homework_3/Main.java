package week_3_Homework_3;

import java.util.ArrayList;
import java.util.List;

import week_3_Homework_3.business.CourseManager;
import week_3_Homework_3.core.logging.DatabaseLogger;
import week_3_Homework_3.core.logging.EmailLogger;
import week_3_Homework_3.core.logging.FileLogger;
import week_3_Homework_3.core.logging.Logger;
import week_3_Homework_3.dataAccess.HibernateCourseDao;
import week_3_Homework_3.entities.Course;

public class Main {

	public static void main(String[] args) {
		List<Logger> loggers = new ArrayList<Logger>();

		loggers.add(new DatabaseLogger());
		loggers.add(new EmailLogger());
		loggers.add(new FileLogger());

		CourseManager courseManager = new CourseManager(new HibernateCourseDao(), loggers);

		Course newCourse1 = new Course(0, "Course0", "Category1", -3, null, 0, null, null);
		Course newCourse2 = new Course(1, "Course1", "Category5", 0, null, 0, null, null);
		Course newCourse3 = new Course(1, "Course5", "Category1", 0, null, 0, null, null);
		Course newCourse4 = new Course(1, "Course95", "Category5", -3, null, 0, null, null);
		Course newCourse5 = new Course(1, "Course95", "Category5", 0, null, 0, null, null);

		Course[] courses = new Course[] { newCourse1, newCourse2, newCourse3, newCourse4, newCourse5 };

		for (Course course : courses) {
			courseManager.add(course);
			System.out.println("------------------------");
		}
	}

}
