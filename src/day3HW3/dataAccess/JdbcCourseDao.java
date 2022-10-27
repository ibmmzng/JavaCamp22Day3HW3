package day3HW3.dataAccess;

import day3HW3.entities.Course;

public class JdbcCourseDao implements CourseDao {

	@Override
	public void add(Course course) {
		System.out.println("Kurs, JDBC ile Veritabanýna eklendi.");
		
	}

}
