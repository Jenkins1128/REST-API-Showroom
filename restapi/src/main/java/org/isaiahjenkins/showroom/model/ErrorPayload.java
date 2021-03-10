package org.isaiahjenkins.showroom.model;

/**
 * ErrorPayload to send to end user.
 */
public class ErrorPayload{

	/** The status code. */
	private int statusCode;

	/** The message. */
	private String message;

	/**
	 * Instantiates a new error payload.
	 */
	public ErrorPayload(){

	}

	/**
	 * Instantiates a new error payload.
	 *
	 * @param statusCode the status code
	 * @param message    the message
	 */
	public ErrorPayload(int statusCode, String message){
		super();
		this.statusCode = statusCode;
		this.message = message;
	}

	/**
	 * Gets the status code.
	 *
	 * @return the status code
	 */
	public int getStatusCode(){
		return statusCode;
	}

	/**
	 * Sets the status code.
	 *
	 * @param statusCode the new status code
	 */
	public void setStatusCode(int statusCode){
		this.statusCode = statusCode;
	}

	/**
	 * Gets the message.
	 *
	 * @return the message
	 */
	public String getMessage(){
		return message;
	}

	/**
	 * Sets the message.
	 *
	 * @param message the new message
	 */
	public void setMessage(String message){
		this.message = message;
	}

}
