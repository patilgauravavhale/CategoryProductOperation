package service;

import java.util.List;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

import entity.CategoryEntity;

public interface CategoryService 
{
	 // public Page<CategoryEntity> getAllCategories(Pageable pageable);
	public List<CategoryEntity> getAllCategories();
	   public CategoryEntity getCategoryById(Long id) ;
	    public CategoryEntity createCategory(CategoryEntity category);
	    public CategoryEntity updateCategory(Long id, CategoryEntity categoryDetails);
	    public void deleteCategory(Long id) ;



}
