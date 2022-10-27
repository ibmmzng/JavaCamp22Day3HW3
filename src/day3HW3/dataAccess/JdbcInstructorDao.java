package day3HW3.dataAccess;

import day3HW3.entities.Instructor;

public class JdbcInstructorDao implements InstrustorDao {

	@Override
	public void ad(Instructor instructor) {
		System.out.println("Eðitmen, JDBC ile Veritabanýna eklendi.");
		
	}

}
