package org.isaiahjenkins.showroom.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

/**
 * Product model.
 */
@Entity(name = "products")
@Table(name = "products")
public class Product{

	/** The product id. */
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "productId")
	int productId;

	/** The brand entity. */
	@ManyToOne(targetEntity = Brand.class)
	@JoinColumn(name = "brandId")
	Brand brandEntity;

	/** The product name. */
	@Column(name = "productName")
	String productName;

	/** The category. */
	@Column(name = "category")
	String category;

	/** The cost. */
	@Column(name = "cost")
	String cost;

	/**
	 * Instantiates a new product.
	 */
	public Product(){

	}

	/**
	 * Gets the product id.
	 *
	 * @return the product id
	 */
	public int getProductId(){
		return productId;
	}

	/**
	 * Sets the product id.
	 *
	 * @param productId the new product id
	 */
	public void setProductId(int productId){
		this.productId = productId;
	}

	/**
	 * Gets the brand entity.
	 *
	 * @return the brand entity
	 */
	public Brand getBrandEntity(){
		return brandEntity;
	}

	/**
	 * Sets the brand entity.
	 *
	 * @param brandEntity the new brand entity
	 */
	public void setBrandEntity(Brand brandEntity){
		this.brandEntity = brandEntity;
	}

	/**
	 * Gets the product name.
	 *
	 * @return the product name
	 */
	public String getProductName(){
		return productName;
	}

	/**
	 * Sets the product name.
	 *
	 * @param productName the new product name
	 */
	public void setProductName(String productName){
		this.productName = productName;
	}

	/**
	 * Gets the category.
	 *
	 * @return the category
	 */
	public String getCategory(){
		return category;
	}

	/**
	 * Sets the category.
	 *
	 * @param category the new category
	 */
	public void setCategory(String category){
		this.category = category;
	}

	/**
	 * Gets the cost.
	 *
	 * @return the cost
	 */
	public String getCost(){
		return cost;
	}

	/**
	 * Sets the cost.
	 *
	 * @param cost the new cost
	 */
	public void setCost(String cost){
		this.cost = cost;
	}
}
