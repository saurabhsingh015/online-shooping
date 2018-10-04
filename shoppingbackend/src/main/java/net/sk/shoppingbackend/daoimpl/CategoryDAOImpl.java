package net.sk.shoppingbackend.daoimpl;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Repository;

import net.sk.shoopingbackend.dao.CategoryDAO;
import net.sk.shoppingbackend.dto.Category;



@Repository("categoryDAO")
public class CategoryDAOImpl implements CategoryDAO {

	
	private static List<Category> categories = new ArrayList<>();
	
	static {
		
		Category category = new Category();
		
		//adding first category
		category.setId(1);
		category.setName("Television");
		category.setDescription("This is some description for television!");
		category.setImageUrl("CAT_1.png");
		
		
		categories.add(category) ;
		
		//second category
       
		category  = new Category();
		category.setId(2);
		category.setName("Mobile");
		category.setDescription("This is some description for mobile!");
		category.setImageUrl("CAT_2.png");
		
		categories.add(category);
		
		
	
		//third category
	       
			category  = new Category();
			category.setId(3);
			category.setName("Laptop");
			category.setDescription("This is some description for laptop!");
			category.setImageUrl("CAT_3.png");
			
			categories.add(category);
	}
	
	
	@Override
	public List<Category> list() {
		// TODO Auto-generated method stub
		return categories;
	}


	public Category get(int id) {
		
		
		//enchanced for loop
		for(Category category : categories) {
			
			if(category.getId() == id) return category;
		}
		
		return null;
	}
	
	

}
