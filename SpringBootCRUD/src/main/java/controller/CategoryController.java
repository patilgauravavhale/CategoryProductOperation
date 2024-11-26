package controller;

	import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
	//import org.springframework.data.domain.Page;
	//import org.springframework.data.domain.PageRequest;
	import org.springframework.web.bind.annotation.*;

import entity.CategoryEntity;
import service.CategoryService;

	@RestController	("/api/categories")
    public class CategoryController {
	    @Autowired
	    private CategoryService categoryService;

	    @GetMapping
	  public List<CategoryEntity> getAllCategory()
	  {
	    	return categoryService.getAllCategories();
	  }

	    @GetMapping("/{id}")
	    public CategoryEntity getCategoryById(@PathVariable Long id) {
	        return categoryService.getCategoryById(id);
	    }

	    @PostMapping
	    public CategoryEntity createCategory(@RequestBody CategoryEntity category) {
	        return categoryService.createCategory(category);
	    }

	    @PutMapping("/{id}")
	    public CategoryEntity updateCategory(@PathVariable Long id, @RequestBody CategoryEntity category) {
	        return categoryService.updateCategory(id, category);
	    }

	    @DeleteMapping("/{id}")
	    public void deleteCategory(@PathVariable Long id) 
	    {
	    	categoryService.deleteCategory(id);
	    }
	


}
