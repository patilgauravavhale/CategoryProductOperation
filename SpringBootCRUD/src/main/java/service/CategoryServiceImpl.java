package service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.data.domain.Page;
//import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

import entity.CategoryEntity;
import repositories.CategoryRepository;

@Service
public class CategoryServiceImpl implements CategoryService
{
	@Autowired
    private CategoryRepository categoryRepository;

	/* @Override
	public Page<CategoryEntity> getAllCategories(Pageable pageable)
	{
        return categoryRepository.findAll(pageable);
	} */

	@Override
	public CategoryEntity getCategoryById(Long id)
	{
        return categoryRepository.findById(id)
                .orElseThrow(() -> new RuntimeException("Category not found"));
	}

	@Override
	public CategoryEntity createCategory(CategoryEntity category)
	{
        return categoryRepository.save(category);

	}

	@Override
	public CategoryEntity updateCategory(Long id, CategoryEntity categoryDetails) 
	{
		  CategoryEntity category = getCategoryById(id);
	        category.setName(categoryDetails.getName());
	        return categoryRepository.save(category);
	}

	@Override
	public void deleteCategory(Long id) 
	{
        categoryRepository.deleteById(id);
		
	}


	@Override
	public List<CategoryEntity> getAllCategories() 
	{
		return categoryRepository.findAll();
	}

}
