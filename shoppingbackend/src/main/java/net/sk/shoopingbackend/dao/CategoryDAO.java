package net.sk.shoopingbackend.dao;

import java.util.List;

import net.sk.shoppingbackend.dto.Category;

public interface CategoryDAO {

	List<Category> list();
	Category get(int id);
}
