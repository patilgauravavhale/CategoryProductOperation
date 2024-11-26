package service;

import java.util.List;

//import org.springframework.data.domain.Page;
//import org.springframework.data.domain.Pageable;

import entity.ProductEntity;

public interface ProductService 
{
   // public Page<ProductEntity> getAllProducts(Pageable pageable) ;
	public List<ProductEntity> getAllProduct();
    public ProductEntity getProductById(Long id) ;
    public ProductEntity createProduct(ProductEntity product) ;
    public ProductEntity updateProduct(Long id, ProductEntity productDetails) ;
    public void deleteProduct(Long id) ;

}
