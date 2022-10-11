package week_3_Homework_3.entities;

public class Course {
	private int id;
	private String name;
	private String category;
	private double price;
	private String courseImage;
	private int completionRate;
	private String teacher;
	private String teacherImage;

	public Course(int id, String name, String category, double price, String courseImage, int completionRate,
			String teacher, String teacherImage) {
		super();
		this.id = id;
		this.name = name;
		this.category = category;
		this.price = price;
		this.courseImage = courseImage;
		this.completionRate = completionRate;
		this.teacher = teacher;
		this.teacherImage = teacherImage;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getCategory() {
		return category;
	}

	public void setCategory(String category) {
		this.category = category;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}

	public String getCourseImage() {
		return courseImage;
	}

	public void setCourseImage(String courseImage) {
		this.courseImage = courseImage;
	}

	public int getCompletionRate() {
		return completionRate;
	}

	public void setCompletionRate(int completionRate) {
		this.completionRate = completionRate;
	}

	public String getTeacher() {
		return teacher;
	}

	public void setTeacher(String teacher) {
		this.teacher = teacher;
	}

	public String getTeacherImage() {
		return teacherImage;
	}

	public void setTeacherImage(String teacherImage) {
		this.teacherImage = teacherImage;
	}

}
