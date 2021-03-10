package org.isaiahjenkins.showroom.model;

import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.Transient;

/**
 * Brand model.
 */
@Entity(name = "brands")
@Table(name = "brands")
public class Brand{

	/** The brand id. */
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "brandId")
	private int brandId;

	/** The brand name. */
	@Column(name = "brandName")
	private String brandName;

	/** The links. */
	@Transient
	private List<Link> links;

	/**
	 * Instantiates a new brand.
	 */
	public Brand(){

	}

	/**
	 * Instantiates a new brand.
	 *
	 * @param brandId   the brand id
	 * @param brandName the brand name
	 */
	public Brand(int brandId, String brandName){
		super();
		this.brandId = brandId;
		this.brandName = brandName;
	}

	/**
	 * Gets the brand id.
	 *
	 * @return the brand id
	 */
	public int getBrandId(){
		return brandId;
	}

	/**
	 * Sets the brand id.
	 *
	 * @param brandId the new brand id
	 */
	public void setBrandId(int brandId){
		this.brandId = brandId;
	}

	/**
	 * Gets the brand name.
	 *
	 * @return the brand name
	 */
	public String getBrandName(){
		return brandName;
	}

	/**
	 * Sets the brand name.
	 *
	 * @param brandName the new brand name
	 */
	public void setBrandName(String brandName){
		this.brandName = brandName;
	}

	/**
	 * Gets the links.
	 *
	 * @return the links
	 */
	public List<Link> getLinks(){
		return links;
	}

	/**
	 * Sets the links.
	 *
	 * @param links the new links
	 */
	public void setLinks(List<Link> links){
		this.links = links;
	}

	@Override
	public String toString(){
		return "BrandEntity [brandId=" + brandId + ", brandName=" + brandName + "]";
	}

}
