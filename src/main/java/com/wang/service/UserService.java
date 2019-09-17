package com.wang.service;

import com.wang.pojo.User;

/**
 * @author SurpriseWang
 * @date 2019年9月9日上午9:41:42
 */
public interface UserService {
    User queryUser(String userName,String password);
	Boolean createUser(User user);
}
