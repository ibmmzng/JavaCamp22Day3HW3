package day3HW3;

import day3HW3.Business.CategoryManager;
import day3HW3.Business.CourseManager;
import day3HW3.Business.InstructorManager;
import day3HW3.dataAccess.HibernateCategoryDao;
import day3HW3.dataAccess.HibernateInstructorDao;
import day3HW3.dataAccess.JdbcCourseDao;
import day3HW3.entities.Category;
import day3HW3.entities.Course;
import day3HW3.entities.Instructor;
import day3HW3.logging.DatabaseLogger;
import day3HW3.logging.FileLogger;
import day3HW3.logging.Logger;
import day3HW3.logging.MailLogger;

public class Main {

	public static void main(String[] args) throws Exception{
		
		Instructor instructor=new Instructor();
		instructor.setId(1);
		instructor.setFirstName("Engin");
		instructor.setLastName("Demiroð");
		
		Course course1=new Course(1,"C#", 5000);
		Course course2=new Course(2,"Java", 6000);
		Course course3=new Course(3,"Python", 7000);
		Course course4=new Course(4,"Java", 6000);
		
		Category category=new Category();
		category.setId(1);
		category.setCategoryName("Programlama");
		
		Logger[] loggers= {new DatabaseLogger(),new FileLogger(),new MailLogger()};
		
		CategoryManager categoryManager=new CategoryManager(new HibernateCategoryDao(), loggers);
		categoryManager.add(category);
		
		CourseManager courseManager=new CourseManager(new JdbcCourseDao(), loggers);
		courseManager.add(course4);
		courseManager.add(course2);
		
		InstructorManager instructorManager=new InstructorManager(new HibernateInstructorDao(), loggers);
		instructorManager.add(instructor);
		
		

	}

}
