package com.parth.emt.exception;


public class AuthenticationFailure extends Exception {

	/**
	 * 
	 */
	private static final long	serialVersionUID	= 6586809297391262629L;

	@Override
	public String getMessage() {

		return "Authentication Failure";
	}
	
}
