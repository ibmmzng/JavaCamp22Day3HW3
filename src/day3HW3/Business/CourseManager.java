package day3HW3.Business;

import java.util.ArrayList;

import day3HW3.dataAccess.CourseDao;
import day3HW3.entities.Course;
import day3HW3.logging.Logger;

public class CourseManager {
	
	private CourseDao courseDao;
	private Logger[] loggers;
	private ArrayList<String> courses=new ArrayList<String>();
	
	public CourseManager(CourseDao courseDao,Logger[] loggers) {
		this.courseDao=courseDao;
		this.loggers=loggers;
	}
	
	public void add(Course course) throws Exception {
		if(course.getCoursePrice()<0) {
			throw new Exception("Kursun fiyatý SIFIR'dan küçük olamaz.");
		}
		else if(courses.contains(course.getCourseName())) {
			throw new Exception("Bu Kurs Ýsmi zaten var!!!");
		}
		courseDao.add(course);
		for(Logger logger:loggers) {
			logger.log(course.getCourseName());
		}
	}
}
