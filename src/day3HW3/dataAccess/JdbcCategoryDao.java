package day3HW3.dataAccess;

import day3HW3.entities.Category;

public class JdbcCategoryDao implements CategoryDao {

	@Override
	public void add(Category category) {
		System.out.println("Kategory, JDBC ile veritabanýna eklendi");
		
	}

}
