package day3HW3.Business;

import day3HW3.dataAccess.CategoryDao;
import day3HW3.entities.Category;
import day3HW3.logging.Logger;

import java.util.ArrayList;

public class CategoryManager {
	
	private ArrayList<String> categories = new ArrayList<String>();
	private CategoryDao categoryDao;
	private Logger[] loggers;
	
	public CategoryManager (CategoryDao categoryDao, Logger[] loggers) {
		this.categoryDao=categoryDao;
		this.loggers=loggers;
	}
	
	
	public void add(Category category) throws Exception {
		if(categories.contains(category.getCategoryName())) {
			throw new Exception("Bu Kategori ismi zaten var!!!");
		}
		categoryDao.add(category);
		for(Logger logger:loggers) {
			logger.log(category.getCategoryName());
		}
	}
}
