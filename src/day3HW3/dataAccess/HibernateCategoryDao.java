package day3HW3.dataAccess;

import day3HW3.entities.Category;

public class HibernateCategoryDao implements CategoryDao {

	@Override
	public void add(Category category) {
		System.out.println("Kategory, Hibernate ile Veritabanýna eklendi.");
		
	}

	

}
