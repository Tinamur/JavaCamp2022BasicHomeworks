package week_3_Homework_3.dataAccess;

import java.util.List;

import week_3_Homework_3.entities.Course;

public interface CourseDao {
	void add(Course course);

	void update(Course course);

	void delete(Course course);

	List<Course> getCourses();
}
