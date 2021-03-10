package org.isaiahjenkins.showroom.services;

import java.util.List;

import org.isaiahjenkins.showroom.DAO.BrandsDAO;
import org.isaiahjenkins.showroom.model.Brand;

/**
 * Brands service layer to call Brand DAO layer operations.
 */
public class BrandsService{

	/** The dao. */
	BrandsDAO DAO = new BrandsDAO();

	/**
	 * Gets all the brands.
	 *
	 * @return the brands
	 */
	public List<Brand> getBrands(){
		List<Brand> list = DAO.getBrands();
		return list;
	}

	/**
	 * Adds the brand.
	 *
	 * @param brand the brand
	 */
	public void addBrand(Brand brand){

		DAO.addBrand(brand);

	}

	/**
	 * Update brand.
	 *
	 * @param updatedBrand the updated brand
	 */
	public void updateBrand(Brand updatedBrand){
		DAO.updateBrand(updatedBrand);

	}

	/**
	 * Delete brand.
	 *
	 * @param brandId the brand id
	 */
	public void deleteBrand(int brandId){
		DAO.deleteBrand(brandId);

	}

	/**
	 * Gets the brand.
	 *
	 * @param brandId the brand id
	 * @return the brand
	 */
	public Brand getBrand(int brandId){
		return DAO.getBrand(brandId);
	}

}
