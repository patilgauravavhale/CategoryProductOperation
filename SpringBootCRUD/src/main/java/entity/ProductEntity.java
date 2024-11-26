package entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;

@Entity
	public class ProductEntity {
	    @Id
	    @GeneratedValue(strategy = GenerationType.IDENTITY)
	    private Long id;

	    
	    private String name;

	    
	    private Double price;

	    @ManyToOne
	    @JoinColumn(name = "category_id", nullable = false)
	    private CategoryEntity category;

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

		public Double getPrice() {
			return price;
		}

		public void setPrice(Double price) {
			this.price = price;
		}

		public CategoryEntity getCategory() {
			return category;
		}

		public void setCategory(CategoryEntity category) {
			this.category = category;
		}

		public ProductEntity(Long id, String name, Double price, CategoryEntity category) {
			super();
			this.id = id;
			this.name = name;
			this.price = price;
			this.category = category;
		}

		public ProductEntity() 
		{
		
		}
	    
	    
	}



