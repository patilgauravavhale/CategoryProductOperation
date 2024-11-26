package service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.data.domain.Page;
//import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

import entity.ProductEntity;
import repositories.ProductRepository;

@Service
public class ProductServiceImp implements ProductService
{
	@Autowired
    private ProductRepository productRepository;

	
	/*@Override
	public Page<ProductEntity> getAllProducts(Pageable pageable)
	{
		return productRepository.findAll(pageable);
		
	}*/

	@Override
	public ProductEntity getProductById(Long id)
	{
		 return productRepository.findById(id)
	                .orElseThrow(() -> new RuntimeException("Product not found"));
		
	}

	@Override
	public ProductEntity createProduct(ProductEntity product) 
	{
		 return productRepository.save(product);
	}

	@Override
	public ProductEntity updateProduct(Long id, ProductEntity productDetails)
	{
		 ProductEntity product = getProductById(id);
	        product.setName(productDetails.getName());
	        product.setPrice(productDetails.getPrice());
	        product.setCategory(productDetails.getCategory());
	        return productRepository.save(product);
	}

	@Override
	public void deleteProduct(Long id)
	{
        productRepository.deleteById(id);
		
	}

	@Override
	public List<ProductEntity> getAllProduct() {
		return productRepository.findAll();
	}

}
