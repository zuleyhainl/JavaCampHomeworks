package Homework2;

public class CourseManager {//bussiness class
	
	public void addCourse(Course course)
	{
		System.out.printf("%s --> eklendi\n",course.name);
		
	}
	
	public void deleteCourse(Course course)
	{
		System.out.printf("%s --> silindi\n",course.name);
		
	}

}
