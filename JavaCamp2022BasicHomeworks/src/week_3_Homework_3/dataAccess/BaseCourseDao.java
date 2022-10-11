package week_3_Homework_3.dataAccess;

import java.util.List;

import week_3_Homework_3.entities.Course;
import week_3_Homework_3.fakeDatabase.FakeDatabase;

public abstract class BaseCourseDao implements CourseDao {

	// Creating Abstract Because I am not going to simulate update and delete
	public abstract void add(Course course);

	@Override
	public final void update(Course course) {
		System.out.println("Course Updated : " + course.getName());

	}

	@Override
	public final void delete(Course course) {
		System.out.println("Course Deleted : " + course.getName());

	}

	public final List<Course> getCourses() {
		return FakeDatabase.courses;
	}

}
