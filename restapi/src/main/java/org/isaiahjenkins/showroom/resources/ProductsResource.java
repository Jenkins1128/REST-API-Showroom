package org.isaiahjenkins.showroom.resources;

import java.util.List;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.QueryParam;
import javax.ws.rs.core.MediaType;

import org.isaiahjenkins.showroom.model.Product;
import org.isaiahjenkins.showroom.services.ProductsService;

/**
 * Products resource class to call products service layer operations.
 */
@Path("/showroom/brands")
public class ProductsResource{

	/** The products service. */
	ProductsService productsService = new ProductsService();

	/**
	 * Gets the products by brand id and category.
	 *
	 * @param brandId  the brand id
	 * @param category the category
	 * @param start    the start
	 * @param end      the end
	 * @return the products by brand
	 */
	@GET
	@Path("/{brandId}/products")
	@Produces(MediaType.APPLICATION_JSON)
	public List<Product> getProductsByBrand(@PathParam("brandId") int brandId, @QueryParam("category") String category,
			@QueryParam("start") int start, @QueryParam("end") int end){

		List<Product> ProductList;
		if(category != null){
			ProductList = productsService.getProductsByBrandAndCategory(brandId, category);
		}else{
			ProductList = productsService.getProductsByBrand(brandId);
		}
		if(end > 0){
			ProductList = ProductList.subList(start, end);
		}
		return ProductList;
	}

}
