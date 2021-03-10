package org.isaiahjenkins.showroom.DAO;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;
import org.isaiahjenkins.showroom.model.Brand;

/**
 * Brands DAO layer class to call brand CRUD operations.
 */
public class BrandsDAO{

	/** The factory. */
	SessionFactory factory = new Configuration().configure("hibernate.cfg.xml").addAnnotatedClass(Brand.class)
			.buildSessionFactory();

	/**
	 * Gets the brands.
	 *
	 * @return the brands
	 */
	public List<Brand> getBrands(){
		Session session = factory.getCurrentSession();
		session.beginTransaction();
		List<Brand> list = session.createQuery("from brands").getResultList();
		return list;
	}

	/**
	 * Gets the brand.
	 *
	 * @param brandId the brand id
	 * @return the brand
	 */
	public Brand getBrand(int brandId){
		Session session = factory.getCurrentSession();
		session.beginTransaction();
		return session.get(Brand.class, brandId);
	}

	/**
	 * Adds the brand.
	 *
	 * @param brand the brand
	 */
	public void addBrand(Brand brand){
		Session session = factory.getCurrentSession();
		session.beginTransaction();
		session.save(brand);
		session.getTransaction().commit();

	}

	/**
	 * Update brand.
	 *
	 * @param updatedBrand the updated brand
	 */
	public void updateBrand(Brand updatedBrand){
		Session session = factory.getCurrentSession();
		session.beginTransaction();
		int id = updatedBrand.getBrandId();
		Brand brand = session.get(Brand.class, id);
		// brand = updatedBrand;
		brand.setBrandName(updatedBrand.getBrandName());
		session.getTransaction().commit();

	}

	/**
	 * Delete brand.
	 *
	 * @param brandId the brand id
	 */
	public void deleteBrand(int brandId){
		Session session = factory.getCurrentSession();
		session.beginTransaction();
		Brand brand = session.get(Brand.class, brandId);
		session.delete(brand);
		session.getTransaction().commit();

	}

}
