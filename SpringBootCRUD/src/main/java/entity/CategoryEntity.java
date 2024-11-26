package entity;

	

import java.util.List;
import jakarta.persistence.CascadeType;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;

	@Entity

	public class CategoryEntity {
	    @Id
	    @GeneratedValue(strategy = GenerationType.IDENTITY)
	    private Long id;

	    private String name;

	    @OneToMany(mappedBy = "category", cascade = CascadeType.ALL, orphanRemoval = true)
	    private List<ProductEntity> products;

		public Long getId() {
			return id;
		}

		public void setId(Long id) {
			this.id = id;
		}

		public String getName() {
			return name;
		}

		public void setName(String name) {
			this.name = name;
		}

		public List<ProductEntity> getProducts() {
			return products;
		}

		public void setProducts(List<ProductEntity> products) {
			this.products = products;
		}

		public CategoryEntity(Long id, String name, List<ProductEntity> products) {
			super();
			this.id = id;
			this.name = name;
			this.products = products;
		}

		public CategoryEntity() 
		{
			
		}
	    
	    
	}



