package day3HW3.Business;

import day3HW3.dataAccess.InstrustorDao;
import day3HW3.entities.Instructor;
import day3HW3.logging.Logger;

public class InstructorManager {
	private InstrustorDao instrustorDao;
	private Logger[] loggers;
	
	public InstructorManager(InstrustorDao instrustorDao,Logger[] loggers) {
		this.instrustorDao=instrustorDao;
		this.loggers=loggers;
	}
	
	public void add(Instructor instructor) {
		System.out.println("Eðitmen:  "+instructor.getFirstName()+" "+instructor.getLastName());
		instrustorDao.ad(instructor);
		for(Logger logger:loggers) {
			logger.log(instructor.getFirstName()+instructor.getLastName());
		}
	}
}
