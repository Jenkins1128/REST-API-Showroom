package org.isaiahjenkins.showroom.resources;

import javax.servlet.ServletContext;
import javax.ws.rs.GET;
import javax.ws.rs.HeaderParam;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.Context;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.UriInfo;

/**
 * Demo resource class for testing.
 */
@Path("/")
public class DemoResource{

	/** The uri info. */
	@Context
	private UriInfo uriInfo;

	/** The servlet context. */
	@Context
	private ServletContext servletContext;

	/**
	 * Useful annotations.
	 *
	 * @return the string
	 */
	@GET
	@Produces(MediaType.TEXT_PLAIN)
	public String usefulAnnotations(){
		return "Hello Jax-rs";
	}

	/**
	 * Context demo.
	 *
	 * @param header the header
	 * @return the string
	 * @throws Exception the exception
	 */
	@GET
	@Path("/demo")
	@Produces({MediaType.TEXT_PLAIN, MediaType.APPLICATION_JSON})
	public String contextDemo(@HeaderParam("header") String header) throws Exception{

		if(header == null){
			throw new RuntimeException();
		}
		return "The value of custom header value is : " + header;
	}

}
