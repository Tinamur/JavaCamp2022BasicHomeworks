package week_3_Homework_3.business;

import java.util.List;

import week_3_Homework_3.core.logging.Logger;
import week_3_Homework_3.core.validation.CourseValidator;
import week_3_Homework_3.core.validation.ValidationEntity;
import week_3_Homework_3.dataAccess.CourseDao;
import week_3_Homework_3.entities.Course;

public class CourseManager {

	private CourseDao courseDao;
	private List<Logger> loggers;

	public CourseManager(CourseDao courseDao, List<Logger> loggers) {
		this.courseDao = courseDao;
		this.loggers = loggers;
	}

	public void add(Course course) {
		ValidationEntity result = CourseValidator.validate(course);
		if (result.isValid) {
			courseDao.add(course);

			for (Logger logger : loggers) {
				logger.log(course.getName());
			}
		} else {
			for (String message : result.message) {
				System.out.println(message);
			}
		}
	}

	public void update(Course course) {

	}

	public void delete(Course course) {

	}

}
