package com.utron.yw.service;

import com.utron.yw.common.ReturnResult;
import com.utron.yw.model.User;

public interface UserService {

	public ReturnResult<User> login(String account, String password,boolean rememberMe, Integer userType);

}
