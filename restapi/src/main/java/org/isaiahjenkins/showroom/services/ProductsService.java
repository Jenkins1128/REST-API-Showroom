package org.isaiahjenkins.showroom.services;

import java.util.List;

import org.isaiahjenkins.showroom.DAO.ProductsDAO;
import org.isaiahjenkins.showroom.model.Product;

/**
 * Products service layer class to call Products DAO layer operations.
 */
public class ProductsService{

	/** The dao. */
	ProductsDAO dao = new ProductsDAO();

	/**
	 * Gets the products by brand id.
	 *
	 * @param brandId the brand id
	 * @return the products by brand
	 */
	public List<Product> getProductsByBrand(int brandId){
		List<Product> ProductList = dao.getProductsByBrand(brandId);
		return ProductList;
	}

	/**
	 * Gets the products by brand and category.
	 *
	 * @param brandId  the brand id
	 * @param category the category
	 * @return the products by brand and category
	 */
	public List<Product> getProductsByBrandAndCategory(int brandId, String category){
		List<Product> ProductList = dao.getProductsByBrandAndCategory(brandId, category);
		return ProductList;
	}

}
