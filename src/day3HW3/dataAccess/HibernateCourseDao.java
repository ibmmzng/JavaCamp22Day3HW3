package day3HW3.dataAccess;

import day3HW3.entities.Course;

public class HibernateCourseDao implements CourseDao {

	@Override
	public void add(Course course) {
		System.out.println("Kurs, Hibernate ile Veritabanưna eklendi.");
		
	}

}
