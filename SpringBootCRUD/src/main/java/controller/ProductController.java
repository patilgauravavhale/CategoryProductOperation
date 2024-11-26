   package controller;


	import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
	//import org.springframework.data.domain.Page;
	//import org.springframework.data.domain.PageRequest;
	import org.springframework.web.bind.annotation.*;

    import entity.ProductEntity;
    import service.ProductService;

	@RestController
	@RequestMapping("/api/products")
	public class ProductController 
	{
	    @Autowired
	    private ProductService productService;

	    @GetMapping
	    public List<ProductEntity> getAllProducts() {
	        return productService.getAllProduct();
	    }

	    @GetMapping("/{id}")
	    public ProductEntity getProductById(@PathVariable Long id) {
	        return productService.getProductById(id);
	    }

	    @PostMapping
	    public ProductEntity createProduct(@RequestBody ProductEntity product) {
	        return productService.createProduct(product);
	    }

	    @PutMapping("/{id}")
	    public ProductEntity updateProduct(@PathVariable Long id, @RequestBody ProductEntity product) {
	        return productService.updateProduct(id, product);
	    }

	    @DeleteMapping("/{id}")
	    public void deleteProduct(@PathVariable Long id) {
	        productService.deleteProduct(id);
	    }
	}



