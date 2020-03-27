package com.atlas.controller;

import com.atlas.utilities.ScannerClass;


public class admin {

    public void adminStart()
    {
        ScannerClass sc = ScannerClass.getInstance();
        System.out.println("Enter admin user ID:");
        sc.readLine();
        String adminID = sc.readLine();
        System.out.println("Enter password: ");
        String pwd = sc.readLine();
        if(adminID.equals("admin") && pwd.equals("administrator"))
        {

        }
        else
        {
            System.out.println("You're not an administrator");
        }
    }

}
