package com.atlas.controller;

import com.atlas.utilities.ScannerClass;


public class admin {
    ScannerClass sc = ScannerClass.getInstance();
    public void adminStart()
    {
        System.out.println("Enter admin user ID:");
        String adminID = sc.readLine();
        System.out.println("Enter password: ");
        String pwd = sc.readLine();
        if(adminID.equals("admin")&&pwd.equals("administrator"))
        {

        }
        else
        {
            System.out.println("You're not an administrator");
        }
    }

}
