package com.parth.emt.manager;

import com.parth.emt.exception.AuthenticationFailure;


public interface UserManager {

	public void authenticate(String user, String password) throws AuthenticationFailure;
}
