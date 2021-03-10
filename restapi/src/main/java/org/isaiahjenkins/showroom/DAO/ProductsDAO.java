package org.isaiahjenkins.showroom.DAO;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;
import org.isaiahjenkins.showroom.model.Brand;
import org.isaiahjenkins.showroom.model.Product;

/**
 * Products DAO layer class for products CRUD operations.
 */
public class ProductsDAO{

	/** The factory. */
	SessionFactory factory = new Configuration().configure("hibernate.cfg.xml").addAnnotatedClass(Product.class)
			.addAnnotatedClass(Brand.class).buildSessionFactory();

	/**
	 * Gets the products by brand.
	 *
	 * @param brandId the brand id
	 * @return the products by brand
	 */
	public List<Product> getProductsByBrand(int brandId){
		Session session = factory.getCurrentSession();
		session.beginTransaction();
		List<Product> productList;
		String HQL = "from products where brandId = '" + brandId + "'";
		productList = session.createQuery(HQL).getResultList();
		return productList;
	}

	/**
	 * Gets the products by brand and category.
	 *
	 * @param brandId  the brand id
	 * @param category the category
	 * @return the products by brand and category
	 */
	public List<Product> getProductsByBrandAndCategory(int brandId, String category){
		Session session = factory.getCurrentSession();
		session.beginTransaction();
		List<Product> productList;
		String HQL = "from products where brandId = '" + brandId + "' and category='" + category + "'";
		productList = session.createQuery(HQL).getResultList();
		return productList;
	}
}
