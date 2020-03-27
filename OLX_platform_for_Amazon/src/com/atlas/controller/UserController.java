package com.atlas.controller;

import com.atlas.model.user;

import java.util.HashMap;

public class UserController {

    private static UserController userController;
    HashMap<String, user> userdetails;

    private UserController()
    {
        userdetails = new HashMap<String, user>();
    }
    public static UserController getInstance()
    {
        if(userController ==null)
        {
            userController = new UserController();
            return userController;
        }
        else
        {
            return userController;
        }
    }
    void addUsers(String uid, String uName, String Phone, String address)
    {
        user u = new user(uid, uName, Phone, address);
        userdetails.put(uid, u);
    }
    public void UserStart()
    {

    }
}
