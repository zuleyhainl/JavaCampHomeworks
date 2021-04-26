package HW2;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Course course1 = new Course(1, "Java Campı", "Java+React","Engin Demiroğ");
		Course course2 = new Course();
		
		Category category1 = new Category(1,"Yazılım Geliştirici Yetiştirme Kampı");
		Category category2 = new Category(2,"Temel Seviye Programlama Kampı");
		
		course2.id = 2;
		course2.name = "C# Kampı";
		course2.detail = "C#+ANGULAR";
		course2.instructorName = "Engin Demiroğ";
		
		Course[] courses = {course1,course2};
		Category[] categories = {category1,category2};
		
		for(Course course : courses)
		{
			System.out.printf("%s\t%s\t%s\n",course.name, course.detail, course.instructorName);
			
		}
		System.out.println();
		for(Category category : categories)
		{
			System.out.printf("%s\n",category.name);
			
		}
		System.out.println();
		
		CourseManager courseManager1 = new CourseManager();
		
		courseManager1.addCourse(course1);
		courseManager1.deleteCourse(course2);
		
		

	}

}
