package org.isaiahjenkins.showroom.model;

/**
 * HATEOAS model for Brands.
 */
public class Link{

	/** The relationship. */
	private String link, rel;

	/**
	 * Instantiates a new link.
	 */
	public Link(){
	}

	/**
	 * Instantiates a new link.
	 *
	 * @param link the link
	 * @param rel  the relationship
	 */
	public Link(String link, String rel){
		super();
		this.link = link;
		this.rel = rel;
	}

	/**
	 * Gets the link.
	 *
	 * @return the link
	 */
	public String getLink(){
		return link;
	}

	/**
	 * Sets the link.
	 *
	 * @param link the new link
	 */
	public void setLink(String link){
		this.link = link;
	}

	/**
	 * Gets the relationship.
	 *
	 * @return the relationship
	 */
	public String getRel(){
		return rel;
	}

	/**
	 * Sets the rel.
	 *
	 * @param rel the new relationship
	 */
	public void setRel(String rel){
		this.rel = rel;
	}

}
