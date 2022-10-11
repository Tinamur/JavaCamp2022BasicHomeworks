package week_3_Homework_3.dataAccess;

import week_3_Homework_3.entities.Course;

public class HibernateCourseDao extends BaseCourseDao implements CourseDao {

	@Override
	public void add(Course course) {
		System.out.println("Added to database with hibernate : " + course.getName());

	}

}
