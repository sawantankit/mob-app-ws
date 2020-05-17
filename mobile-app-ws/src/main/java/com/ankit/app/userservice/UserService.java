package com.ankit.app.userservice;

import com.ankit.app.ui.model.request.UserDetailsRequestModel;
import com.ankit.app.ui.model.response.UserRest;

public interface UserService {
	UserRest createUser(UserDetailsRequestModel userDetails);
}