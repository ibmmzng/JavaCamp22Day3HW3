package day3HW3.dataAccess;

import day3HW3.entities.Instructor;

public class HibernateInstructorDao implements InstrustorDao {

	@Override
	public void ad(Instructor instructor) {
		System.out.println("Eðitmen, Hibernate ile Veritabanýna eklendi.");
		
	}

}
