package com.sha.springbootmysqldemo.service;

import com.sha.springbootmysqldemo.model.User;

import java.util.List;

/**
 * @author sa
 * @date 20.02.2021
 * @time 12:09
 */
public interface IUserService
{
    User saveUser(User user);

    User findByUsername(String username);

    List<User> findAll();
}
